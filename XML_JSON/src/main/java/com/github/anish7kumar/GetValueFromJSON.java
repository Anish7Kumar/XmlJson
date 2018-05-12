package com.github.anish7kumar;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class GetValueFromJSON {
	
	String value;
	public String getValueFromJson(Path path,String json)
	{
		LinkedList<String> map = path.getPathMap();
		Object obj = null;
		String json_data = json.trim();
		//JSONArray
				if(json_data.startsWith("["))
				{
					
					try {
						JSONArray jsonArray = new JSONArray(json_data);
						
						
						for(int i=0;i<map.size();i++)
						{
							
							String Key   =map.get(i).split(":")[0].toString().trim();
							String Value =map.get(i).split(":")[1].toString().trim();
							
							if(i==0)
							{
								if(Key.contains("Index"))
								 {
									obj = jsonArray.get(Integer.parseInt(Value));
								 }
								else
								{
									throw new InvalidPathException("Your provided json , is a JSONArray ,\n and JSONArray cannot have key-value pair as starting point"); 
								}
								
							}
							else
							{
								
								
								if(obj instanceof JSONArray)
								{
									obj = ((JSONArray) obj).get(Integer.parseInt(Value));
								}
								else if(obj instanceof JSONObject)
								{
									obj = ((JSONObject) obj).get(Value);
								}
								else
								{
									value = obj.toString();
								}
								
								
								
							}
							
							
						}
						
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				}
				//JSONObject
				else if(json_data.startsWith("{"))
				{
						
					try {
						JSONObject jsonObject = new JSONObject(json_data);
						for(int i=0;i<map.size();i++)
						{
							
							String Key=map.get(i).split(":")[0].toString().trim();
							String Value =map.get(i).split(":")[1].toString().trim();
							
							if(i==0)
							{
								if(Key.contains("Key"))
								 {
									obj = jsonObject.get(Value);
								 }
								else
								{
									throw new InvalidPathException("Your provided json , is a JSONObject ,\n and JSONObject cannot have index as starting point"); 
							    }
								
							}
							else
							{
								
								
								if(obj instanceof JSONArray)
								{
									obj = ((JSONArray) obj).get(Integer.parseInt(Value));
								}
								else if(obj instanceof JSONObject)
								{
									obj = ((JSONObject) obj).get(Value);
								}
								else
								{
									value = obj.toString();
								}
								
								
								
							}
							
							
						}
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				}
				else
				{
					System.err.println("Not A Valid JSON");
					return null;
				}
			
				return obj.toString();
	}
	
	
	
	
	
	
	
	
	
	public String getValueFromJson(Path path,File json) throws InvalidPathException
	{
		LinkedList<String> map = path.getPathMap();
		Object obj = null;
		String json_data=new UtilityReader().getJSONAsString(json).trim();
		//JSONArray
		if(json_data.startsWith("["))
		{
			
			try {
				JSONArray jsonArray = new JSONArray(json_data);
				
				
				for(int i=0;i<map.size();i++)
				{
					
					String Key   =map.get(i).split(":")[0].toString().trim();
					String Value =map.get(i).split(":")[1].toString().trim();
					
					if(i==0)
					{
						if(Key.contains("Index"))
						 {
							obj = jsonArray.get(Integer.parseInt(Value));
						 }
						else
						{
							throw new InvalidPathException("Your provided json , is a JSONArray ,\n and JSONArray cannot have key-value pair as starting point"); 
						}
						
					}
					else
					{
						
						
						if(obj instanceof JSONArray)
						{
							obj = ((JSONArray) obj).get(Integer.parseInt(Value));
						}
						else if(obj instanceof JSONObject)
						{
							obj = ((JSONObject) obj).get(Value);
						}
						else
						{
							value = obj.toString();
						}
						
						
						
					}
					
					
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		//JSONObject
		else if(json_data.startsWith("{"))
		{
				
			try {
				JSONObject jsonObject = new JSONObject(json_data);
				for(int i=0;i<map.size();i++)
				{
					
					String Key=map.get(i).split(":")[0].toString().trim();
					String Value =map.get(i).split(":")[1].toString().trim();
					
					if(i==0)
					{
						if(Key.contains("Key"))
						 {
							obj = jsonObject.get(Value);
						 }
						else
						{
							throw new InvalidPathException("Your provided json , is a JSONObject ,\n and JSONObject cannot have index as starting point"); 
					    }
						
					}
					else
					{
						
						
						if(obj instanceof JSONArray)
						{
							obj = ((JSONArray) obj).get(Integer.parseInt(Value));
						}
						else if(obj instanceof JSONObject)
						{
							obj = ((JSONObject) obj).get(Value);
						}
						else
						{
							value = obj.toString();
						}
						
						
						
					}
					
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		else
		{
			System.err.println("Not A Valid JSON");
			return null;
		}
	
		return obj.toString();
	}
	

}
