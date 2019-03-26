// Java program that demonstrates the use of throw 

/*throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
By the help of throws keyword we can provide information to the caller of the method about the exception. */
class ThrowExcep 
{ 
	static void fun() 
	{ 
		try
		{ 
			throw new NullPointerException("demo"); 
		} 
		catch(NullPointerException e) 
		{ 
			System.out.println("Caught inside fun()."); 
			throw e; // rethrowing the exception 
		} 
	} 

	public static void main(String args[]) 
	{ 
		try
		{ 
			fun(); 
		} 
		catch(NullPointerException e) 
		{ 
			System.out.println("Caught in main."); 
		} 
	} 
} 
