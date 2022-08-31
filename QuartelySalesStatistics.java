/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 490 Problem 7: Quarterly Sales Statistics
 * 
 * @Description Write a program that lets the user enter four quarterly sales figures
 * for six divisions of a company. The figures should be stored in a two-dimensional array.
 * Once the figures are entered, the program should display the following data for each quarter:
 * A list of the sales figures by division
 * Each division’s increase or decrease from the previous quarter (this will not be displayed for the first quarter)
 * The total sales for the quarter
 * The company’s increase or decrease from the previous quarter (this will not be displayed for the first quarter)
 * The average sales for all divisions that quarter
 * The division with the highest sales for that quarter
 * Input Validation: Do not accept negative numbers for sales figures.
 */

import java.util.*;
public class QuartelySalesStatistics {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int DIVISIONS = 6;
		final int SALES = 4;
		double sales[][] = new double[DIVISIONS][SALES]; 
		
		// Get Input 
		for(int div = 0; div < DIVISIONS; div++) { 
			
			for(int qtr = 0; qtr < SALES; qtr++) { 
				System.out.printf("Division %d, Quarter %d: $", 
						(div + 1), (qtr + 1));
				sales[div][qtr] = in.nextDouble();
				
				// Input Validation For Negative Numbers
				while(sales[div][qtr] < 0) { 
					System.out.printf("Enter A Postive Salse Figure: ");
					sales[div][qtr] = in.nextDouble();
				}
			}
			System.out.println();
		}
		// Close Scanner
		in.close();
		
		/** Output And Format Data / Method Calls **/
		
		// List All Sales
		System.out.println("LIST OF ALL SALES: ");
		System.out.println("--------------------------");
		listOfSales(sales); 
		System.out.println();
		
		// Each division’s increase or decrease from the previous quarter 
		System.out.println("Divisons Difference From Previous Quarter: ");
		System.out.println("----------------------------------------------------");
		diffPerQuarter(sales);
		System.out.println();
		
		// Output Total Of Quarterly Sales For Each Division
		System.out.println("Total Sales For Each Division: ");
		System.out.println("-------------------------------");
		getTotalSales(sales);
		System.out.println();
		
		// Company's increase or decrease from the previous quarter 
		System.out.println("Company's Difference From Previous Quarter");
		System.out.println("----------------------------------------------------");
		compDiffPerQuarter(sales);
		System.out.println();
				
		// Output Average Sales For Each Division 
		System.out.println("Average Sales For Each Division: ");
		System.out.println("----------------------------------");
		getDivisionlAvg(sales);
		System.out.println();
				
		// Output Division With Highest Sales
		System.out.println("Division With The Highest Sales");
		System.out.println("Division: " + highestDivSales(sales));
		System.out.println("--------------------------------------");
		System.out.println();	
	}
	
	/**
	 * List Sales Of All Divisions For Each Quarter 
	 * @param arr Quarterly Sales Of Divisions 1 - 6
	 */
	
	public static void listOfSales(double arr[][]) { 
		for(int div = 0; div < 6; div++) { 
			for(int qtr = 0; qtr < 4; qtr++) { 
				System.out.printf("Division %d, Quater %d, $%.2f%n" , (div+1), (qtr + 1), arr[div][qtr]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Calculates And Returns Division With The Most Total Sales
	 * @param arr Quarterly Sales Of Divisions 1 - 6
	 * @return highest Division With The Most Total Sales
	 */

	public static int highestDivSales(double arr[][]) { 
		
		double highSale = 0;
		int highestDivision = 0; 
		double total = 0;
		
		for(int div = 0; div < 6 ; div++) { 		
			for(int qtr = 0; qtr < 4; qtr++) { 
				
				// Add All Total Sales 
				total += arr[div][qtr];
				// Check For Highest Sales 
				if(total > highSale) { 
					highSale = total;
					highestDivision = div;
				}
			}
			// Reset Accumulator
			total = 0;	
		}
		// Return Division With Highest Total Sales + 1 (TO PREVENT 1 OFF ERROR)
		return highestDivision + 1 ;
	}
	
	
	/**
	 * Calculates Each Division’s Increase Or Decrease From The Previous Quarter 
	 * @param arr Quarterly Sales Of Divisions 1 - 6
	 */
	
	public static void diffPerQuarter(double arr[][]) { 
		
		double total = 0; 
		double prevTotal = 0;  
		double difference = 0;
		
		for(int div = 0; div < 6; div++) { 
			
			for(int qtr = 0; qtr < 4; qtr++) { 
				// Total == To Current Position in Array
				total = arr[div][qtr];
				// Difference == Current Position In Array - Previous Position 
				difference = total - prevTotal;
				prevTotal = total;
				// Reset Accumulator 
				total = 0;
				
				// For First Quarter 
				if(qtr == 0)
					difference = 0;
				
				// Output Conditional Statements
				if(difference > 0)
					System.out.printf("Division %d, Quarter: $%d , Gain: %.2f%n", (div+1), qtr+1, difference);
				if(difference < 0)
					System.out.printf("Division %d, Quarter: $%d , Loss: %.2f%n", (div+1), qtr+1, difference);
				if(difference == 0)
					System.out.printf("Division %d, Quarter: $%d , NO GAIN OR LOSS%n", (div+1), qtr+1);
			}
			
			// Reset Accumulators 
			total = 0;
			prevTotal = 0;
		}
	}
	
	
	/**
	 * Calculates The Company’s Increase Or Decrease From The Previous Quarter 
	 * @param arr Quarterly Sales Of Divisions 1 - 6
	 */
	public static void compDiffPerQuarter(double arr[][]) { 
		
		
		double total = 0;
		double prevTotal = 0;
		double difference = 0;
		for(int div = 0; div < 6 ; div++) { 
							
			for(int qtr = 0; qtr < 4; qtr++) { 
				// Add All Total Sales Of Divisions
				total += arr[div][qtr];
				// Difference == Total Sales - Previous Total Sales
				difference = total - prevTotal;	
			}
			
			// For First Quarter 
			if(div == 0)
				difference = 0;
			
			// Reset Accumulators 
			prevTotal = total;
			total = 0;
			
			// Output Conditional Statements
			if(difference > 0) 	
			System.out.printf("Quarter %d, Gain: $%.2f%n", (div+1), difference);
			if(difference < 0)
				System.out.printf("Division %d, Loss: $%.2f%n", (div+1), difference);
			if(difference == 0)
				System.out.printf("Division %d, NO GAIN OR LOSS%n", (div+1));	
		}
	}
	
	/**
	 * The Average Sales For All Divisions That Quarter
	 * @param arr arr Quarterly Sales Of Divisions 1 - 6
	 */
	public static void getDivisionlAvg(double arr[][]) { 
		
		// Add All Total Sales Of Divisions
		double total = 0.0;
		for(int div = 0; div < 6 ; div++) { 
					
			for(int qtr = 0; qtr < 4; qtr++) { 
				total += arr[div][qtr];
			}
			
			total = (total/ 4.0);
			System.out.printf("Division %d, Average Sales: $%.2f%n", (div+1), total);
			total = 0;	
		}
	}

	/**
	 * Calculates The Total Sales For The Quarter
	 * @param arr Quarterly Sales Of Divisions 1 - 6
	 */
	public static void getTotalSales(double arr[][]) { 
		
		// Add All Total Sales Of Divisions
		double total = 0;
		for(int div = 0; div < 6 ; div++) { 
					
			for(int qtr = 0; qtr < 4; qtr++) { 
				total += arr[div][qtr];
			}
			System.out.printf("Division %d, Total Sales: $%.2f%n", (div+1), total);
			total = 0;	
		}
	}
}
