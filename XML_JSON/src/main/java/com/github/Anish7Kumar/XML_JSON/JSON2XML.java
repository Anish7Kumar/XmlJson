package com.github.Anish7Kumar.XML_JSON;

import java.io.File;

import org.json.JSONObject;
import org.json.XML;

public class JSON2XML {

	
	public static String convertJSONToXML(String json)
	{
		String xml =null;
		try
		{
			JSONObject js = new JSONObject(json);
			xml = XML.toString(js);
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return xml;
		
	}
	
	public static String convertJSONToXML(File json)
	{
		String xml =null;
		try
		{
			
			String json_data=new UtilityReader().getJSONAsString(json);
			JSONObject js = new JSONObject(json_data);
			xml = XML.toString(js);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return xml;
		
	}
	
	
	
}
