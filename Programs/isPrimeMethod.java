/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 316 Problem 13: isPrime Method
 * 
 * @Description A prime number is a number that is evenly divisible only
 * by itself and 1. For example, the number 5 is prime because it can be
 * evenly divided only by 1 and 5. The number 6, however, is not prime 
 * because it can be divided evenly by 1, 2, 3, and 6.
 * Write a method named isPrime, which takes an integer as an argument
 * and returns true if the argument is a prime number, or false otherwise. 
 * Demonstrate the method in a complete program.
 */

import java.util.*;
public class isPrimeMethod {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		boolean prime;
		
		//Get Input
		System.out.println("Enter Number To Check If The Number Is Prime:");
		num = in.nextInt();
		in.close();
		
		//Method Call
		prime = isPrime(num);
		
		//Determine Output
		if(prime == true) 
			System.out.println(num + " Is Prime");
		
		if(prime == false) 
			System.out.println(num + " Is Not Prime");
	}
		
	/*
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