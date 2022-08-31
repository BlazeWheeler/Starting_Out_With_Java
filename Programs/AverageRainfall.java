/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 264 Problem 8: Average Rainfall 
 * 
 * @Description Write a program that uses nested loops to collect 
 * data and calculate the average rainfall over a period of years.
 * First the program should ask for the number of years. 
 * The outer loop will iterate once for each year. 
 * The inner loop will iterate 12 times, once for each month. 
 * Each iteration of the inner loop will ask the user for the 
 * inches of rainfall for that month. After all iterations, the 
 * program should display the number of months, the total inches 
 * of rainfall, and the average rainfall per month for the entire 
 * period.
 */

import java.text.DecimalFormat;
import java.util.*;

public class AverageRainfall {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		DecimalFormat avgPerMonth = new DecimalFormat("# Inches");
		
		int numOfYears, 
		inOfRainfall, 
		inches,
		numOfMonths;
		
		double averageRainfall;
		
		// For Displaying Months
		String months[] = {"January", "Febuary", "March", "April", 
						   "May", "June", "July", "August", "September",
						   "October ","November", "December"};
		
		System.out.println("Enter The Number Of Years: " );
		numOfYears = in.nextInt(); 
		
		while(numOfYears < 1) { 
			System.out.println("Enter The Number Of Years");
			numOfYears = in.nextInt(); 
		}
		
		//Set Accumulator
		inOfRainfall = 0;
		// Loop Iterates Every Year
		for(int i = 1; i < numOfYears + 1; i++) { 
			//Loop Iterates Every Month In Year
			for(int j = 0; j < 12; j++) { 
				// Prints Each Month In Array
				System.out.println("Enter Inches Of Rainfall In " + months[j] + 
								   " For Year " + i);
				inches = in.nextInt();
				inOfRainfall += inches;
			}
		}
		in.close();
		
		//Calculations
		numOfMonths = numOfYears * 12;
		averageRainfall = Double.valueOf(inOfRainfall) / Double.valueOf(numOfMonths); 
		
		//Output 
		System.out.println("Number Of Months: " + numOfMonths); 
		System.out.println("Total Inches Of Rainfall: " + inOfRainfall); 
		System.out.println("Average Monthly Rainfall: " + avgPerMonth.format(averageRainfall));
	}

}
