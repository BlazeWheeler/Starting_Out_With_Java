
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 493 Problem 16: 2D Array Operations 
 * 
 * @Description Write a program that creates a two-dimensional array initialized with test data. 
 * Use any primitive data type that you wish. 
 * The program should have the following methods:
 * getTotal. This method should accept a two-dimensional array as its argument and
 * return the total of all the values in the array.'
 * getAverage. This method should accept a two-dimensional array as its argument and 
 * return the average of all the values in the array.
 * getRowTotal. This method should accept a two-dimensional array as its first argument and an integer as its second argument. 
 * The second argument should be the subscript of a row in the array. 
 * The method should return the total of the values in the specified row.
 * getColumnTotal. This method should accept a two-dimensional array as its first argument and an integer as its second argument. 
 * The second argument should be the sub- script of a column in the array. 
 * The method should return the total of the values in the specified column.
 * getHighestInRow. This method should accept a two-dimensional array as its first argument and an integer as its second argument. 
 * The second argument should be the subscript of a row in the array. 
 * The method should return the highest value in the specified row of the array.
 * getLowestInRow. This method should accept a two-dimensional array as its first argument and an integer as its second argument.
 * The second argument should be the sub- script of a row in the array.
 * The method should return the lowest value in the specified row of the array.
 * Demonstrate each of the methods in this program.
 */

import java.util.Random;
public class TwoDArrayOperations {

	public static void main(String[] args) {
		
		final int ROWS = 5; 
		final int COLUMNS = 5; 
		int test[][] = new int[ROWS][COLUMNS]; 
		
		// Create Random Obj
		Random rand = new Random(); 
		
		// Supply 2D Array With Dummy Data
		for(int i = 0; i < ROWS; i++) { 
			for(int j = 0; j < COLUMNS; j++) { 
				// Fill 2D Array With Dummy Data
				test[i][j] = rand.nextInt(9) + 1;
			}
		}
		
		// Output Array
		System.out.print("2D Array: \n------------");
		for(int i = 0; i < ROWS; i++) { 
			System.out.println();
			for(int j = 0; j < COLUMNS; j++) { 
				// Output Array
				System.out.print(test[i][j] + " ");
			}
		}
		
		// Output 
		System.out.println();
		System.out.println("\nTotal: " + getTotal(test));
		System.out.println("Average: " + getAverage(test));
		System.out.println("Row Total " +  1 + ": " + getRowTotal(test, 1));
		System.out.println("Column Total " + 2 + ": " +  getColumnTotal(test, 2));
		System.out.println("Highest In Row " + 3 + ": " + getHighestRow(test,3));
		System.out.println("Lowest In Row " + 1 + ": " + getLowestRow(test,1));
		System.out.println("Highest In Column " + 4 + ": " + getHighestColumn(test,4));
		System.out.println("Lowest In Column " + 4 + ": " +  getLowestColumn(test,4));
	}
	
	/**
	 * Calculates Total Of All Elements In 2D Array
	 * @param arr 2D Array Integer Array
	 * @return total Total Of All Elements In an Array
	 */

	public static double getTotal(int arr[][]) { 

		double total = 0.0; 
		final int ROWS = arr.length; 
		final int COLUMNS = arr[0].length;

		for(int i = 0; i < ROWS; i++) { 
			for(int j = 0; j < COLUMNS; j++)  
				total += arr[i][j];
		}
		return total; 
	}
	
	/**
	 * Calculates Average Of All Elements In An Array
	 * @param arr 2D Integer Array
	 * @return avg Average Of All Elements In Array
	 */
	
	public static double getAverage(int arr[][]) { 
		
		double avg = 0.0;
		int counter = 0;
		final int ROWS = arr.length; 
		final int COLUMNS = arr[0].length;
		
		for(int i = 0; i < ROWS; i++) { 
			for(int j = 0; j < COLUMNS; j++) { 
				avg += arr[i][j];
				counter++;
			}
		}
		return avg / counter;
	}
	
	/**
	 * Calculates Total Of A Row In A 2D Array
	 * @param arr 2D Integer Array 
	 * @param subScript Row To Get Total Of Elements
	 * @return rowTotal Total Of Row At Specified SubScript
	 */
	
	public static double getRowTotal(int arr[][], int subScript) { 
		
		double rowTotal = 0.0; 
		// Set Accumulator 
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) { 
			total = 0; 
			for(int j = 0; j < arr[i].length; j++) 
				total += arr[i][j];
			
			if(i == subScript)  
				rowTotal = total;
		}
		return rowTotal;
	}
	
	
	/**
	 * Calculates Total Of Column In A 2D Array
	 * @param arr 2D Integer Array
	 * @param subScript Column To Get Total Of Elements 
	 * @return colTotal Total Of Column At Specified SubScript
	 */

	public static double getColumnTotal(int arr[][], int subScript) { 

		double colTotal = 0.0;
		int total = 0; 

		for(int i = 0; i < arr[0].length; i++) { 
			total = 0;

			for(int j = 0; j < arr.length; j++) 
				total += arr[j][i];
		
			if( i == subScript)  
				colTotal = total;
		}
		return colTotal;
	}
	
	
	/**
	 * Calculates The Highest Element In A Specified Row Of A 2D Array
	 * @param arr 2D Integer Array
	 * @param subScript Row To Get The Highest Element 
	 * @return highest Highest Element In Row At Specified SubScript
	 */
	
	public static double getHighestRow(int arr[][], int subScript) { 
		
		double highest = 0; 
		
		for(int i = 0; i < arr.length; i++) { 
			
			for(int j = 0; j < arr[0].length; j++) { 
				
				if(i == subScript) { 
					if(highest < arr[i][j]) 
						highest = arr[i][j];	
				}
			}
		}
		return highest;
	}
	
	
	
	/**
	 * Calculates Lowest Element In A Specified Row Of 2D Array
	 * @param arr 2D Integer Array
	 * @param subScript Row To Get The Lowest Element 
	 * @return highest Highest Element In A Row At A Specified SubScript
	 */
	
	public static double getLowestRow(int arr[][], int subScript) { 
		
		double highest = arr[subScript][0]; 
		
		for(int i = 0; i < arr.length; i++) { 
			
			for(int j = 0; j < arr[0].length; j++) { 
				
				if(i == subScript) { 
					if(highest > arr[i][j]) 
						highest = arr[i][j];	
				}
			}
		}
		return highest;
	}
	
	
	/**
	 * Calculates Highest Element In A Specified Column Of A 2D Array 
	 * @param arr 2D Integer Array
	 * @param subScript Column To Get The Highest Element  
	 * @return highest Highest Element In A Column At A Specified SubScript
	 */
	
	public static double getHighestColumn(int arr[][], int subScript) { 
		
		double highest = 0;
		
		for(int i = 0; i < arr.length; i++) { 
			
			for(int j = 0; j < arr.length; j++) { 
				if(i == subScript) { 
					if(highest < arr[j][i])
						highest = arr[j][i];
				}
			}
		}
		return highest;
	}
	
	/**
	 * Calculates Lowest Element In A Specified Column Of A 2D Array
	 * @param arr 2D Integer Array
	 * @param subScript Column To Get The Lowest Element 
	 * @return lowest Lowest Element In A Column At A Specified SubScript
	 */
	
	public static double getLowestColumn(int arr[][], int subScript) { 
		
		double lowest = arr[0][subScript];
		
		for(int i = 0; i < arr.length; i++) { 
			
			for(int j = 0; j < arr.length; j++) { 
				if(i == subScript) { 
					if(lowest > arr[j][i])
						lowest = arr[j][i];
				}
			}
		}
		return lowest;
	}
}
