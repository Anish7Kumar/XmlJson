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
      {"value": "New", "onclick": "CreateNewDoc()"},
      {"value": "Open", "onclick": "OpenDoc()"},
      {"value": "Close", "onclick": "CloseDoc()"}
    ]
  }
}}

```
Now  you want to get the content of 2nd "value" i.e "Open". So you just need to create a Path to it.
Example :

```
Path p = new Path();
