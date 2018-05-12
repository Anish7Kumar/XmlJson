package com.github.anish7kumar;

import java.util.LinkedList;

public class Path {
	
	
	//path="key1=alpha/index1=1/key2=beta/key3=gamma/index2=2/index3=3/key4=key";
	String path;
	String delimeter;
	private LinkedList<String> fullPath;
	int countkey;
	int countIndex;
	Path()
	{
		path="";
		fullPath= new LinkedList<String>();
		delimeter="/";
		countkey=0;
		countIndex=0;
		
	}

	public LinkedList<String> getPathMap()
	{
		return fullPath;
	}
	public void addKey(String Key)
	{
		countkey++;
		path+=("Key"+countkey+":"+Key)+delimeter;
	}
	
	public void addIndex(int index)
	{
		countIndex++;
		path+=("Index"+countIndex+":"+index)+delimeter;
	}
	
	public String getPath()
	{
		return path;
	}
	//path="key1:alpha/index1:1/key2:beta/key3:gamma/index2:2/index3:3/key4:key";
	public void build() throws InvalidPathException
	{
		
		if(path.isEmpty()|| path==null)
		{
			throw new InvalidPathException();
		}
		else
		{
			String[] pathBits= path.split(delimeter);
			
			for(String s : pathBits)
			{
				fullPath.add(s);
			}
		}
	}
}
