
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 491 Problem 11: Array Operations
 * 
 * @Description Write a program with an array that is initialized with test data.
 * Use any primitive data type of your choice. The program should also have the 
 * following methods:
 * getTotal. This method should accept a one-dimensional array as its argument and 
 * return the total of the values in the array.
 * getAverage. This method should accept a one-dimensional array as its argument and 
 * return the average of the values in the array.
 * getHighest. This method should accept a one-dimensional array as its argument and 
 * return the highest value in the array.
 * getLowest. This method should accept a one-dimensional array as its argument and 
 * return the lowest value in the array.
 * Demonstrate each of the methods in the program.
 */

import java.util.*;
public class ArrayOperations {

	public static void main(String[] args) {
		
		// Test With Dummy Data
		/**
		 * int arr[] = {1,2,3,4,5,6,7,8}; 
		 *System.out.println(getAverage(arr));
		 *System.out.println(getHighest(arr));
		 *System.out.println(getLowest(arr));
		 */
		
		// Demonstrate each of the methods in the program.
		
		Scanner in = new Scanner(System.in); 
		int arr[] = new int[10]; 
		int userChoice= 0;
		
		System.out.println("Fill Array With 10 Numbers");
		System.out.println("-----------------------------");
		
		for(int i = 0; i < arr.length; i++) { 
			System.out.print("Enter Number " + (i+1) + " ");
			arr[i] = in.nextInt();
		}
		
		System.out.println();
		System.out.println("\t\tMENU");
		System.out.println("---------------------------------------");
		
		do { 
			System.out.println("Enter 1 For Total Of Array");
			System.out.println("Enter 2 For Average Of Array");
			System.out.println("Enter 3 For Highest Element In Array");
			System.out.println("Enter 4 For Lowest Element In Array");
			System.out.println("Enter -99 When Finished");
			System.out.println("---------------------------------------");
			userChoice = in.nextInt();
			
			switch(userChoice) { 
			case 1: 
				System.out.println("Total: " + getTotal(arr));
				System.out.println("---------------------------------------");
				break;
			case 2:
				System.out.println("Average: " + getAverage(arr)); 
				System.out.println("---------------------------------------");
				break; 
			case 3:
				System.out.println("Highest: "+ getHighest(arr));
				System.out.println("---------------------------------------");
				break; 
			case 4: 
				System.out.println("Lowest: " + getLowest(arr));
				System.out.println("---------------------------------------");
			}
		} while(userChoice != -99);
		in.close();
	}
	
	/**
	 * Calculates And Returns Sum Of All Elements In An Array
	 * @param arr Test Array
	 * @return total Sum Of All Elements In Array
	 */
	
	public static int getTotal(int arr[]) { 
	
		int total = 0; 
		
		for(int i = 0; i < arr.length; i++ )
			total += arr[i];
		return total;
	}
	
	/**
	 * Calculates Average Of Elements In Array
	 * @param arr Test Array
	 * @return avg Average Of All Elements In An Array 
	 */
	
	public static double getAverage(int arr[]) { 
		
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++ )
			avg += arr[i];
		
		avg = avg / arr.length;
		avg = Math.round(avg);
		
		return avg;
	}
	
	/**
	 * Calculates And Returns Highest Element In Array
	 * @param arr Test Array
	 * @return highest Greatest Element In Array
	 */
	
	public static int getHighest(int arr[]) { 
		
		int highest = 0; 
		
		for(int i = 0; i < arr.length; i++) { 
			
			if(highest  < arr[i])  
				highest = arr[i];
		}
		return highest; 
	}

/**
 * Calculates And Returns Lowest Number In Array
 * @param arr Test Array
 * @return lowest Lowest Element In Array
 */
	
public static int getLowest(int arr[]) { 
		
		int lowest = arr[0]; 
		
		for(int i = 0; i < arr.length; i++) { 
			
			if(lowest  > arr[i])  
				lowest = arr[i];
		}
		return lowest; 
	}
}
