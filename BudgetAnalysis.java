/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 188 Problem 16: Budget Analysis
 * 
 * @Description Write a program that asks the user to enter the 
 * amount that he or she has budgeted for a month. A loop should 
 * then prompt the user to enter each of his or her expenses for
 * the month, and keep a running total. When the loop finishes, 
 * the program should display the amount that the user is
 * over or under budget.
 * 
 */

import java.util.*;
import java.text.*;

public class BudgetAnalysis {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat usd = new DecimalFormat("$ ###,###.##");
		
		double budget, input;
		//Set Accumulator 
		double expenses = 0.0;
		
		//Get Input
		System.out.println("Enter Budget:"); 
		budget = in.nextDouble();
		
	 
		System.out.println("Enter Expense: (Enter -99 When Finished) "); 
		input = in.nextDouble(); 
		expenses += input;
		
		// While Loop Using Sentinel Value 
		while(input != -99) { 
			System.out.println("Enter Expense:  (Enter -99 When Finished) "); 
			input = in.nextDouble(); 
			//MARK: If Sentinel Value is Entered: Input Is Not Added To Expenses
			
			if(input == -99)
				break;
			expenses += input;
			
		}
		in.close();
		
		//Output 
		if(expenses > budget)  
			System.out.println("You Are " + usd.format(expenses - budget) + " Over Budget" );	
		else
			System.out.println("You Are " + usd.format(budget - expenses) +" Under Budget");
		

	}

}
