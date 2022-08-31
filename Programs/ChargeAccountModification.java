
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 489 Problem 4: Charge Account Modification 
 * 
 * @Description Modify the charge account validation class that you wrote for
 * Programming Challenge 3 so it reads the list of valid charge account numbers from a file.
 * Use Notepad or another text editor to create the file.
 */

import java.util.*;
import java.io.*;

public class ChargeAccountModification {

	public static void main(String[] args ) throws IOException {
		
		// Create File
		File accounts = new File("EmpId.txt");
		
		ArrayList<Integer> accountsArr = new ArrayList<>();
		
		// File Scanner 
		Scanner accountScan = new Scanner(accounts);
		// User Input Scanner
		Scanner in = new Scanner(System.in);
		int accountNum;
		int accountIds;
		
		// Scan File & Store data
		while(accountScan.hasNext()) { 
			accountIds = accountScan.nextInt(); 
			accountsArr.add(accountIds);
		}
		accountScan.close();
		
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

class AccountValidationModification { 
	
	private ArrayList<Integer> accountNums = new ArrayList<>();
			
	private boolean isValid = false;
	
	/**
	 * 
	 * @param id ArrayList Contains Employee Id Numbers
	 */
	AccountValidationModification(ArrayList<Integer> id) { 
		this.accountNums = id;
	}
	
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
