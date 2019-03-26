package com.javaweek.exception;


/*If a client can reasonably be expected to recover from an exception, make it a checked exception. 
 * If a client cannot do anything to recover from the exception, make it an unchecked exception*/
import java.io.*;

class CheckedUncheckedDemo {
	public static void main(String[] args) throws IOException {

		// Checked
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);

		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());

		fileInput.close();

//		//Unchecked
//		int x = 0;
//		int y = 10;
//		int z = y / x;

	}
}
