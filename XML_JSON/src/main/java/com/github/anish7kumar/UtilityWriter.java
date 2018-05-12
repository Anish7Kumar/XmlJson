package com.github.anish7kumar;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UtilityWriter {

	
	public void writeJSONStringToFile(String JSONString, File target)
	{
		
		
		
		try {
			if(target.exists())
			{
				target.delete();
				target.createNewFile();	
			}
			else
			{
				target.getParentFile().mkdirs();
				target.createNewFile();
			}
			FileWriter f = new FileWriter(target.getPath().toString());
			f.write(JSONString.trim());
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void writeJSONStringToFile(String JSONString, String targetPath)
	{
		
		try {
			File mf = new File(targetPath);
			if(mf.exists())
			{
				mf.delete();
				mf.createNewFile();
				
				
				
			}
			else
			{
				mf.getParentFile().mkdirs();
				mf.createNewFile();
			}
			
			FileWriter f = new FileWriter(targetPath.trim());
			f.write(JSONString.trim());
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void writeJSONStringToFile(File JSONsource, File target)
	{
		
		
		
		try {
			if(target.exists())
			{
				target.delete();
				target.createNewFile();	
			}
			else
			{
				target.getParentFile().mkdirs();
				target.createNewFile();
			}
			FileWriter f = new FileWriter(target.getPath().toString());
			f.write(new UtilityReader().getJSONAsString(JSONsource).trim());
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
