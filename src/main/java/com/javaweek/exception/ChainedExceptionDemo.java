// Java program to demonstrate working of chained exceptions 
/*
 * Chained Exceptions allows to relate one exception with another exception, i.e one exception describes cause of another exception. 
 * For example, consider a situation in which a method throws an ArithmeticException because of an attempt to divide by zero but the 
 * actual cause of exception was an I/O error which caused the divisor to be zero. 
 * 
 * 
 * 
 * Methods Of Throwable class Which support chained exceptions in java :
getCause() method :- This method returns actual cause of an exception.
initCause(Throwable cause) method :- This method sets the cause for the calling exception.*/


public class ChainedExceptionDemo 
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			// Creating an exception 
			NumberFormatException ex = 
					new NumberFormatException("Exception"); 

			// Setting a cause of the exception 
			ex.initCause(new NullPointerException( 
					"This is actual cause of the exception")); 

			// Throwing an exception with cause. 
			throw ex; 
		} 

		catch(NumberFormatException ex) 
		{ 
			// displaying the exception 
			System.out.println(ex); 

			// Getting the actual cause of the exception 
			System.out.println(ex.getCause()); 
		} 
	} 
} 
