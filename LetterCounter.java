/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 263 Problem 5: Letter Counter
 * 
 * @Description Write a program that asks the user to enter a string,
 *  and then asks the user to enter a character. 
 *  The program should count and display the number 
 *  of times that the specified character appears in the string.
 */


import java.util.*;

public class LetterCounter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		String inputStr, inputChar;
		char caseChar; 
		int numOfOccurrence = 0;
		
		//Get Input
		System.out.println("Enter A String: ");
		inputStr = in.nextLine(); 
	
		//Input Validation
		do { 	
			System.out.println("Enter A Character");
			inputChar = in.nextLine();
		
				if(inputChar.length() !=1 ) { 
					System.out.println("Enter A Single Character");
					inputChar = in.nextLine();
				}
			}while(inputChar.length() != 1);
		in.close();
		
		
		//Allows For Non-Case-Sensitivity 
		inputStr = inputStr.toLowerCase();
		inputChar = inputChar.toLowerCase();
		
		
		caseChar = inputChar.charAt(0);
		char[] inputArr = inputStr.toCharArray();
		
		
		for(int i = 0; i < inputArr.length; i++) { 
			int x = inputArr[i]; 
			if(caseChar == x) { 
				numOfOccurrence++;
			}
		}
		System.out.println(inputChar + " Occurs " + numOfOccurrence +
										" Time(s)");
	}

}
