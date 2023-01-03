
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 488 Problem 1: Rainfall Class
 * 
 * @Description Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles. 
 * The program should have methods that return the following:
 * the total rainfall for the year
 * the average monthly rainfall
 * the month with the most rain
 * the month with the least rain
 * Demonstrate the class in a complete program.
 * Input Validation: Do not accept negative numbers for monthly rainfall figures.
 */

import java.util.*;

public class RainfallClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// Size Of Array
		final int  MONTHS_IN_YEAR = 12;
		// Get User Input
		double rain = 0.0;
		// Rainfall Array
		double rainFall[] = new double[MONTHS_IN_YEAR];
		
		for(int i = 0; i < rainFall.length; i++) { 
			// Get Input 
			System.out.println("Enter RainFall For Month " + (i + 1) + " (Inches): ");
			rain = in.nextDouble();
			// Negative Number Input Validation
			while(rain < 0) { 
				System.out.println("Please Enter Postive Number: ");
				rain = in.nextDouble();
			}
			// Apply Input To Array
			rainFall[i] = rain;
		}
		in.close();
		// Create Instance Of Class
		RainFall rainFall1 = new RainFall(rainFall);
		
		// Output
		System.out.println("Total Amount Of RainFall: " + rainFall1.calcTotalRainfall());
		System.out.println("Average Monthly Rainfall: " + rainFall1.avgRainFall());
		System.out.println("Month With Most Rain: " + Math.round(rainFall1.mostRain()));
		System.out.println("Month With Least Rain: " + Math.round(rainFall1.leastRain()));
	}
}

/*
 *  Chapter 7 Rainfall Class
 */

class RainFall { 
	
	private double mnthRainFall[];
	private double totalRainfall = 0.0;
	
	RainFall(double arr[]){ 
		this.mnthRainFall = arr;
	}
	
	/**
	 * Calculates Total Rainfall Of All Months
	 * @return totalRainfall Returns Total Rainfall Of All Months
	 */
	public double calcTotalRainfall() { 
		totalRainfall = 0.0;
		for(int i = 0; i < mnthRainFall.length; i++) { 
			totalRainfall += mnthRainFall[i];
		}
		return totalRainfall;
	}
	
	/*
	 * Calculates The Average Of Rainfall For All Months
	 */
	
	public double avgRainFall() { 
		return calcTotalRainfall() / 12;
	}
	
	/**
	 *  Calculates Month With Minimum Amount Of Rainfall
	 * @return min Returns Month With Minimum Amount Of Rainfall
	 */
	
	// Sequential Search For Least Rain
	public double leastRain() { 
		double min = mnthRainFall[0];
		for(int i = 0; i < mnthRainFall.length; i++) { 
			if(min > mnthRainFall[i])
				min = i + 1;
		}
		return min;
	}
	
	/**
	 * Calculates Month With Maximum Amount Of Rainfall
	 * @return max Returns Month With Maximum Amount Of Rainfall
	 */
	
	// Sequential Search For Most Rain
	public double mostRain() { 
		double max = mnthRainFall[0];
		for(int i = 0; i < mnthRainFall.length; i++) { 
			if(max < mnthRainFall[i])
				max = i + 1;	
		}
		return max;
	}
}
