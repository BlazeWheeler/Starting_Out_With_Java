/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 316 Problem 14: Prime Number List
 * 
 * @Description Use the isPrime method that you wrote in Programming 
 * Challenge 13 in a program that stores a list of all the prime numbers
 * from 1 through 100 in a file.
 */

import java.io.*;
public class PrimeNumberList {

	public static void main(String[] args) throws IOException {
		
		//Print Writer 
		PrintWriter outputFile = new PrintWriter("PrimeNumList.txt");
		
		//Output Formatting
		outputFile.println("Prime Number List");
		outputFile.println("------------------");
		
		// Prints All Prime Number To 100 Loop
		for(int i = 1; i < 100 +1; i++) { 
			
			if(isPrime(i) == true)
				outputFile.println(i);
		}
		//Close File
		outputFile.close();
		
	}
	
	/**
	 * Determines If Given Number Is Prime 
	 * @param num User Inputed Number 	
	 */
		
	public static boolean isPrime(int num) { 
		
		// Base Case
		if(num <= 1)
			return false;
		
		for(int i = 2; i < num; i++) 
			if(num % i == 0)
				return false;
		return true;
			
	}

}
