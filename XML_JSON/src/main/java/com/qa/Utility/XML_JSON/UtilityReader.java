package com.qa.Utility.XML_JSON;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;



public class UtilityReader {
	
	
	
	private  String readXMLFileToString(File f)
	{
		
		String result = null;
		try
		{
			BufferedReader in 
			= new BufferedReader(new FileReader(f.getAbsolutePath())); 
			String output = new String("");
			String st;
			while ((st=in.readLine()) != null) { 
				if(st.contains("\"")){
					st = st.replaceAll("\"", "\\\"");
				}
				output+=st; 
				} 
			
			result= output.toString();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}

		
		
		return result;
	}
	private  String readJSONFileToString(File f)
	{
		
		String result = null;
		try
		{
			InputStream is = new FileInputStream(f.getPath());
		    String jsonTxt = IOUtils.toString(is, "UTF-8");
		    if(jsonTxt.contains("\""))
		    {
		    	jsonTxt = jsonTxt.replaceAll("\"", "\\\"");
		    }
		    result = jsonTxt;
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}

		
		
		return result;
	}
	
	public String getXMLAsString(File f)
	{
		
		return this.readXMLFileToString(f);
	}
	
	public String getJSONAsString(File f)
	{
		String result = this.readJSONFileToString(f);
		return result;
	}


}
