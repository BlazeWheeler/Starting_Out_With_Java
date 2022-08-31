
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 264 Problem 10: Largest And Smallest
 * 
 * @Description Write a program with a loop that lets the user enter 
 * a series of integers. The user should enter −99 to signal the end of 
 * the series. After all the numbers have been entered, the program 
 * should display the largest and smallest numbers entered.
 *     
 * 
 */

import java.util.*;


public class LargestAndSmallest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		int input; 
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//Loop Validation with Sentinel Value
		do { 
			
			System.out.println("Enter A Postive Integer (Enter -99 When Finished): ");
			input = in.nextInt();
			nums.add(input);
			
		}while(input != -99); // Sentinel Value
		in.close();
		
		// Sorting / Remove Sentinel Value
		Collections.sort(nums);
		nums.remove(0);
		
		System.out.println("Lowest: " + nums.get(0) + "\n" +  // Get Lowest
		                   "Highest: "+ nums.get(nums.size() -1)); // Get Highest
	}

}
