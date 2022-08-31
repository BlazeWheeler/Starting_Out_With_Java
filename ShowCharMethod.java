/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 312 Problem 1: showChar Method
 * 
 * @Description Write a method named showChar. The method should accept
 * two arguments: a reference to a String object and an integer. 
 * The integer argument is a character position within the String, with
 * the first character being at position 0. When the method executes, 
 * it should display the character at that character position.
 * Here is an example of a call to the method: 
 * showChar("New York", 2);
 * In this call, the method will display the character w because it is 
 * in position 2. Demonstrate the method in a complete program.
 */

import java.util.*;

public class ShowCharMethod {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		String input; 
		int atIndex; 
		int stringLen;
		
		System.out.println("Enter A String: "); 
		input = in.nextLine(); 
		
		stringLen = input.length() -1;
		
		System.out.println("Enter An index between 0 - " + stringLen);
		atIndex = in.nextInt();
		in.close();
		
		showChar(input, atIndex);
	}
	
	/*
	 * Prints Char From String Reference From Chosen Index
	 * @param s User Input String Reference
	 * @param n User Input Number To Find Char At Desired Index
	 */
	
	public static void showChar(String s, int n) { 
		
		System.out.println("Char At Index " + n + " is " + s.charAt(n));
	}

}
