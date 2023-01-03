
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 264 Problem 9: Population
 * 
 * @Description Write a program that will predict the size of a population
 * of organisms. The program should ask for the starting number of 
 * organisms, their average daily population increase (as a percentage),
 * and the number of days they will multiply. For example, 
 * a population might begin with two organisms, have an average daily 
 * increase of 50 percent, and will be allowed to multiply for seven days. 
 * The program should use a loop to display the size of the population 
 * for each day. Input Validation: Do not accept a number less than 
 * 2 for the starting size of the population. Do not accept a 
 * negative number for average daily population increase. 
 * Do not accept a number less than 1 for the number of days they will 
 * multiply.   
 * 
 */

import java.text.*;
import java.util.*;

public class Population {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		NumberFormat df = DecimalFormat.getInstance();
		int startingOrg, numOfDays;
		double popIncrease, populationSize;
		
		//Setting Accumulator
		populationSize = 0.0;
		
		System.out.println("Enter The Starting Number Of Organisms: ");
		startingOrg = in.nextInt();
		
		//Input Validation Organisms 
		while(startingOrg < 2) { 
			System.out.println("Enter Number Greater than 1 ");
			startingOrg = in.nextInt();
		}
		
		System.out.println("Enter Average Daily Population Increase Percentage: ");
		popIncrease = in.nextDouble();
		
		//Input Validation Population Increase
		while(popIncrease <= -1) { 
			System.out.println("Enter A Non-Negative Number: ");
			popIncrease = in.nextDouble()/100;
		}
		
		System.out.println("Enter Number Of Days Organisms Mutiply: ");
		numOfDays = in.nextInt();
		
		//Input Validation Number Of Days
		while(numOfDays < 1) { 
			System.out.println("Enter a number Greater Than " + numOfDays);
		}
		in.close();
		
		//Format Table
		System.out.println("---------------------------------------------------");
		System.out.println(" Day" +"\t\tPopulation" + "\tPercent of Increase");	
		System.out.println("---------------------------------------------------");
		System.out.println("  1\t\t " + df.format(startingOrg) + "\t\t N/A");
		
		
		//Population Increase Loop
		for(int i = 2; i < numOfDays +1; i++) { 
			
				populationSize += (startingOrg * popIncrease);
		
				System.out.println("  " +i + "\t\t " + df.format(populationSize) +
								   "\t\t " + (popIncrease)+"%");
		}
	}
}
