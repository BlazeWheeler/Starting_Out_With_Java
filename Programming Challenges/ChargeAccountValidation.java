
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 489 Problem 3: Charge Account Validation
 * 
 * @Description Create a class with a method that accepts a charge account number as its argument. 
 * The method should determine whether the number is valid by comparing it to the following 
 * list of valid charge account numbers:
 * 5658845 4520125 8080152 4562555 1005231 6545231
 * 7895122 8777541 5552012 5050552 3852085 7576651
 * 8451277 7825877 7881200 1302850 1250255 4581002
 * These numbers should be stored in an array or an ArrayList object. 
 * Use a sequential search to locate the number passed as an argument. 
 * If the number is in the array, the method should return true, 
 * indicating the number is valid. If the number is not in the array, 
 * the method should return false, indicating the number is invalid.
 * Write a program that tests the class by asking the user to enter a charge account number. 
 * The program should display a message indicating whether the number is valid or invalid.
 */

import java.util.*;

public class ChargeAccountValidation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int accountNum;
		
		// Create Account Validation Object
		AccountValidation accValObj = new AccountValidation();
		// Get Input
		System.out.println("Enter Account Number: ");
		accountNum = in.nextInt();
		in.close();
		// Output
		if(accValObj.checkAccountValid(accountNum) == true)
			System.out.println(accountNum + " is Valid.");
		if(accValObj.checkAccountValid(accountNum) == false)
			System.out.println(accountNum + " is Not Valid.");
	}
}

/**
 * Account Validation Class
 */

class AccountValidation { 
	
	private ArrayList<Integer> accountNums = new ArrayList<>(
			Arrays.asList(5658845, 4520125, 8080152, 4562555,
						  1005231, 6545231,7895122, 8777541, 
						  5552012, 5050552, 3852085, 7576651,
						  845127, 7825877, 7881200,1302850, 1250255,4581002));
	private boolean isValid = false;
	
	/**
	 * Checks Account Number And Determines If It is Valid
	 * @param account Account Number
	 * @return isValid Returns True If Account Is Valid
	 */
	
	public boolean checkAccountValid(int account) { 
		for(int i = 0; i < accountNums.size(); i++)  
			if( accountNums.get(i) == account) isValid = true;
		
		return isValid;
	}
}