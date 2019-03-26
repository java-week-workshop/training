/*The only case when the code inside finally block is not executed is when System.exit(0) is called explicitly in the program. 
 * Then exit statement is called and the program is terminated without executing any further.*/

public class FinallyBlockDemo 
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			System.out.printf("1\t"); 
			int data = 5 / 0; 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.printf("2\t"); 
			System.exit(0); 
		} 
		finally
		{ 
			System.out.printf("3\t"); 
		} 
		System.out.printf("4\t"); 
	} 
} 
