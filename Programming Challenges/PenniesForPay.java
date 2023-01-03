/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 263 Problem 4: Pennies for Pay
 * 
 * @Description Write a program that calculates the amount a 
 * person would earn over a period of time if his or her salary 
 * is one penny the first day, two pennies the second day, 
 * and continues to double each day. The program should display 
 * a table showing the salary for each day, and then show the 
 * total pay at the end of the period. The output should be displayed
 * in a dollar amount, not the number of pennies.
 * Input Validation: Do not accept a number less than 1 for the
 * number of days worked.
 */


import java.util.*;
import java.text.DecimalFormat;
public class PenniesForPay {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		DecimalFormat usd = new DecimalFormat("$ ###.##");
		int numOfDays; 
		double salary;
		
		//Get Input 
		System.out.println("Enter A Number Of Days: ");
		numOfDays = in.nextInt();
		
		//Input Validation 
		if(numOfDays < 1) { 
			do { 
				System.out.println("Enter A Postive Number: ");
				numOfDays = in.nextInt();
			}while(numOfDays < 1);
		}
		
		in.close();
		
		//Title Table Input
		System.out.println("Day \t Salary Per Day");
		System.out.println("-----------------------"); 
		
		// Setting Accumulator Variable 
		salary = 0.0;
		
		// Loop For Calculations 
		for(int i = 1; i < numOfDays + 1; i++) { 
			// Starts Day 1 at 0.01
			if(i == 1)
				salary += .01;
			else
				salary += salary; // Doubles Salary Per Day
			
			System.out.println(i + "\t\t"+ usd.format(salary));
		}
	}
}
