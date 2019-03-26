package com.javaweek.exception;

import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 

public class MultiCatchDemo 
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			System.out.printf("1\t"); 
			
			//NullPointer 
			Integer i = null ;
			i.hashCode();
			
			//Arithmetic
			System.out.println(5/0);
			
			//IOException
			FileReader fr = new FileReader(new File("abc.txt"));
			fr.ready();
			
			
		//	throw new IOException(); 
			
		} 
		catch(EOFException e) 
		{ 
			System.out.printf("2\t"); 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.printf("3\t"); 
		} 
		catch(NullPointerException e) 
		{ 
			System.out.printf("4\t"); 
		} 
		catch(IOException e) 
		{ 
			System.out.printf("5\t"); 
		} 
		catch(Exception e) 
		{ 
			System.out.printf("6\t"); 
		} 
	} 
} 
