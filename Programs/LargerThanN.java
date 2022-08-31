
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 489 Problem 5: Larger Than N 
 * 
 * @Description In a program, write a method that accepts two arguments: 
 * an array and a number n.
 * Assume that the array contains integers. 
 * The method should display all of the numbers in the array that are greater 
 * than the number n.
 */

import java.util.*;

public class LargerThanN {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner in = new Scanner(System.in);
		int n;
		int size, element;
		
		// Get Input 
		System.out.println("Enter An Integer 1 - 100:");
		n = in.nextInt();
		in.close();
		
		// Random Objects For Array Size & Elements
		Random randSize = new Random();
		Random randElement = new Random();
		
		// Generate Random Array Size
		size = randSize.nextInt(10) + 10 ;
		
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; i++) { 
			// Generate Array Elements
			element = randElement.nextInt(100);
			arr[i] = element;
		}
		 
		System.out.print("Randomized Array: ");
		// Output Array
		for(int j = 0; j < arr.length; j++) 
			System.out.print(arr[j ] + " ");
		
		System.out.println();
		
		largerThan(arr,n);
	}
	
	/**
	 * Outputs Elements In An Array That Are Larger Than User Inputted Number
	 * @param arr Array Of Random Generated Size And Elements
	 * @param n User Input Number
	 */
	
	public static void largerThan(int arr[], int n) { 
		
		System.out.print("Numbers Larger Than " + n + ": ");
		
		for(int i = 0; i < arr.length; i++) 
			if(arr[i] > n) {System.out.print(arr[i] + " ");}
	}
}
