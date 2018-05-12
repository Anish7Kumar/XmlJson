package com.github.anish7kumar;

public class InvalidPathException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidPathException()
	{
        super("The Path you are trying to build is either Empty or null");
    }
	
	public InvalidPathException(String s)
	{
		super(s);
	}
}

