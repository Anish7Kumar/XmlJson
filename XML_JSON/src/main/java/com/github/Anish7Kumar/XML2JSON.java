package com.github.Anish7Kumar;

import java.io.File;

import org.json.JSONObject;
import org.json.XML;
public class XML2JSON {
	
	
	
	public static String convertXMLToJSON(String xml)
	{
		String JSON =null;
		try
		{
			JSONObject json = XML.toJSONObject(xml);
			JSON = json.toString();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return JSON;
		
	}

	
	public static String convertXMLToJSON(File xml)
	{
		String JSON =null;
		try
		{
			
			String xml_data=new UtilityReader().getXMLAsString(xml);
			JSONObject json = XML.toJSONObject(xml_data);
			JSON = json.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return JSON;
		
	}
	
	
	
}
