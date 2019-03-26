package com.javaweek.exception;

class MyException extends RuntimeException 
{ 
	public MyException(String s) 
	{ 
		super(s); 
	} 
} 

public class CustomExceptionDemo 
{ 
	// Driver Program 
	public static void main(String args[]) 
	{ 
		
		try
		{ 
			// Throw an object of user defined exception 
			throw new MyException("Real cause is unknown"); 
		} 
		catch (MyException ex) 
		{ 
			System.out.println("Inside catch block"); 

			// Print the message from MyException object 
			System.out.println(ex.getMessage()); 
		} 
	} 
} 
