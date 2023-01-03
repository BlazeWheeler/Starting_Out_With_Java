/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 316 Problem 15: Even / Odd Counter
 * 
 * @Description You can use the following logic to determine whether
 *  a number is even or odd:
 *  if((number % 2) == 0)
 *  	//This Number Is Even
 *  else
 *  	//This Number Is Odd
 *  
 * Write a program with a method named isEven that accepts an int
 * argument. The method should return true if the argument is even, 
 * or false otherwise. The program’s main method should use a loop 
 * to generate 100 random integers. It should use the isEven method 
 * to determine whether each random number is even, or odd. When the
 * loop is finished, the program should display the number of even 
 * numbers that were generated, and the number of odd numbers.
 */

import java.util.Random;

public class EvenOddCounter {

	public static void main(String[] args) {
		
		// Random Object
		Random rand = new Random();
		
		int randNum,
			even = 0,
			odd = 0;
		boolean result;
		
		//Table Formatting
		System.out.println("Even\t Odd");
		System.out.println("--------------");
		
		
		for(int i = 0; i < 100 ; i ++) { 
			
			//Store Random Numbers
			randNum = rand.nextInt(100) +1;
			//Call Method W/ Random Number Argument
			result = isEven(randNum); 
			
			if(result == true)
				even++;
			else
				odd++;
		}
		
		//Output
		System.out.println(even + "\t" + odd);
	}
	
	/*
	 * Calculates If Given Number Is Even Or Odd
	 * @param rand Random Generated Integer
	 * @return result Returns True If Integer Is Even Else Returns False
	 * 	
	 */
	public static boolean isEven(int rand) { 
		
		boolean result = true;
		
		if((rand % 2) == 0)
			result = true; 
		else 
			result = false; 
		return result;
		
	}

}
