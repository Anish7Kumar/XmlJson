# XmlJson


This project helps is Converting JSON/XML file or String to XML/JSON String.
It helps in finding value from Complex JSON File/String.
It helps in Storing JSON String as file.


## Sample Usage

```
<!--XML to JSON-->

String json = XML2JSON.convertXMLToJSON(String xml);
String json = XML2JSON.convertXMLToJSON(File xml);

<!-- JSON to XML -->
String xml = JSON2XML.convertJSONToXML(File json);
String xml = JSON2XML.convertJSONToXML(String json);


<!-- Reading JSON/XML File to String-->

String json=new UtilityReader().getJSONAsString(File json);
String xml=new UtilityReader().getXMLAsString(File xml);

```


###Reading values from complex JSON

Suppose you have a json  as below :

```
{"menu": {
  "id": "file",
  "value": "File",
  "popup": {
    "menuitem": [
      "value", 
      "New", 
      "onclick",
      "CreateNewDoc"
     
    ]
  }
}}

```
Now  you want to get the content of 2nd item in "menuitem" i.e "New". So you just need to build a Path to it.
Example :

```

//Building a path to the Desired value


Path path = new Path();
path. addKey("menu");
path.addKey("popup");
path.addKey("menuitem");
path.addIndex(1);
path.build();

//Passing the path  and the json (from which it has to fetch the path)
String value =new GetValueFromJSON().getValueFromJson(path,String json);

String value = new GetValueFromJSON().getValueFromJson(path path,File json);
```

### It can also be used to Write JSON string to a file 

Sample Usage:

```

new UtilityWriter().writeJSONStringToFile(String JSONString, File target);
new UtilityWriter().writeJSONStringToFile(String JSONString, String targetPath);
new UtilityWriter().writeJSONStringToFile(File JSONsource, File target);

```


#Usage 

You can directly download the jar from :"https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.github.anish7kumar%22"

#Maven dependency:

Just add the below code in your pom.xml in dependencies section

```

<!-- https://mvnrepository.com/artifact/com.github.anish7kumar/XML_JSON -->
<dependency>
    <groupId>com.github.anish7kumar</groupId>
    <artifactId>XML_JSON</artifactId>
    <version>1.0.1</version>
</dependency>

```
