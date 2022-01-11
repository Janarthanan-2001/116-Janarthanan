package com.journaldev.spring.exceptions;

public class ArrayIndexOutOfBoundsException extends Exception{
	
	
	

	public ArrayIndexOutOfBoundsException(int id)
	{
		super("ArrayIndexOutOfBoundsException with id = " + id);
	}

}
