
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis & GodFrey Muganda 
 * Page: 399 Problem 11: 1994 Gas Prices
 * 
 * @Description In the student sample for this book you will find a text file named 1994 weekly gas averages.txt. 
 * The file contains 52 lines of text that represent average weekly gas. 
 * Line one contains average price for week one and line 2 contains the average price for week 2 etc.
 * Write a program that reads the gas prices from the file into an array of an ArrayList. 
 * The program should do the following:
 * Display the lowest average price of the year, along with the week number for that price, and the name of the month which it occurred.
 * Display the highest average price of the year, along with the week number for that price, and the name of the month which it occurred.
 * Display the average gas price for each month.
 * Txt file gas averages. I'm just starting out with java. Whatever answer is provided, could you keep it simple enough for me to understand since I’m having difficulty.
 * 
 */

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class GasPrices {

	public static void main(String[] args) throws IOException {
		
		File gasPrices = new File("1994_Weekly_Gas_Averages.txt");
		Scanner fileIn = new Scanner(gasPrices); 
		
		String months[] = {"January", "Febuary", "March", "April", "May", "June",
							"July", "August", "September", "October", "November", "December" };
		
		ArrayList<Double> prices = new ArrayList<>();
		// Lowest Index Location Variable
		int lowestIndex = 0;
		int highestIndex = 0;
		// Lowest Value Variables
		double lowest = 0; 
		double highest = 0;
		
		// Pass Data To Array List
		while(fileIn.hasNext())
			prices.add(fileIn.nextDouble());
		fileIn.close();
		
		// Get Lowest Average
		lowest = prices.get(0);
		highest = 0;
		
		// Get Highest And Lowest Averages
		for(int i = 0; i< prices.size(); i++) { 
			
			if(lowest > prices.get(i)) 
				lowest = prices.get(i);
			
			for(int j = 0; j < prices.size(); j++) { 
				if(highest < prices.get(i))
					highest = prices.get(i);
			}
		}
		
		// Get Lowest Index
		lowestIndex = prices.indexOf(lowest);
		// Get Highest Index
		highestIndex = prices.indexOf(highest);
		
		// Output
		System.out.println("Lowest Gas Price: " + lowest + " Week: " +  (lowestIndex + 1) + " Month: " + months[getMonthIndex(lowestIndex)]);
		System.out.println("Highest Gas Price " + highest + " Week: " + (highestIndex +1) + " Month: " + months[getMonthIndex(highestIndex)]);
		System.out.println("Monthly Gas Price Averages:");
		printMonthlyAverage(prices, months);
	}
	
	
	/**
	 * Calculates And Outputs Average Of Weekly Gas Prices Per Month
	 * @param prices Array List Of Average Weekly Gas Prices
	 * @param months Months Of The Year
	 */
	
	public static void printMonthlyAverage(ArrayList<Double> prices, String[]months) { 
		
		DecimalFormat usd = new DecimalFormat("$#.##");
		double monthAverage = 0;
		int counter = 0;
		
		for(int i = 1; i < prices.size(); i++) { 
			
			monthAverage += prices.get(i);
			
			if(i % 4 == 0 && i != 0) { 
				System.out.println(months[counter] + " Average: " + usd.format((monthAverage/4)));
				counter++;
				monthAverage = 0;
			}
		}
	}
	
	/**
	 * Calculates The Month Of Given Index Of Element In ArrayList
	 * @param index Index Of Value In ArrayList
	 * @return monthIndex
	 */
	
	public static int getMonthIndex(int index) { 

		int monthIndex = -1;

		for(int i = 1; i < index ; i++) { 

			if(i % 4 == 0 )  
				monthIndex++;
		}
		if(monthIndex < 0)
			monthIndex++;

		return monthIndex;
	}
}
