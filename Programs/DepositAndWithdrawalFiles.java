/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 401 Problem 13: Deposit and Withdrawal Files
 * 
 * @Description Use Notepad or another text editor to create a text file named
 *  Deposits.txt. The file should contain the following numbers, one per line:
 *  100.00 
 *  124.00
 *  78.92
 *  37.55 
 *  Next, create a text file named Withdrawals.txt. The file should contain
 *  the following numbers, one per line:
 *  29.88 
 *  110.00
 *  27.52
 *  50.00 
 *  12.90
 *  The numbers in the Deposits.txt file are the amounts of deposits that were made to a savings
 *  account during the month, and the numbers in the Withdrawals.txt file are the 
 *  amounts of withdrawals that were made during the month. Write a program that creates an 
 *  instance of the SavingsAccount class that you wrote in Programming Challenge 12.
 *  The starting balance for the object is 500.00. The program should read the values 
 *  from the Deposits.txt file and use the object’s method to add them to the account balance. 
 *  The program should read the values from the Withdrawals.txt file and use the object’s method 
 *  to subtract them from the account balance. The program should call the class method to calculate 
 *  the monthly interest, and then display the ending balance and the total interest earned.
 *  
 */

import java.util.*;
import java.io.*;

public class DepositAndWithdrawalFiles {

	public static void main(String[] args) throws IOException {
		
		// Create Files 
		File deposit = new File("Deposits.txt");
		File withdrawal = new File("Withdrawals.txt");
		
		// Create Scanners
		Scanner depositFile = new Scanner(deposit); 
		Scanner withdarwalFile = new Scanner(withdrawal);
		
		// Create Savings Object
		SavingsAccount2 account1 = new SavingsAccount2(500); 
		
		// Store Input From File
		String line;
		
		double deposits,
			   withhdrawals;
		
		// 10 Percent Interest Rate
		account1.setAnnualInterestRate( .1 ); 
		
		// Scan Deposit File
		while(depositFile.hasNext()) { 
			line = depositFile.nextLine();
			deposits = Double.parseDouble(line);
			account1.deposit(deposits);
			account1.addIntrestRate();
			
			// Scan Withdraw File
			while(withdarwalFile.hasNext()) { 
				line = withdarwalFile.nextLine();
				withhdrawals = Double.parseDouble(line);
				account1.widthdrawl(withhdrawals);
				account1.addIntrestRate();
			}
		}
		// Close Files
		depositFile.close();
		withdarwalFile.close();
		
		// Output
		System.out.printf("Ending balance: $%.2f", account1.getBalance());
		System.out.printf("\nTotal interest: $%.2f", account1.getAccumulativeInterest());
	}
}

class SavingsAccount2 { 
	
	private double annualInterestRate; 
	private double balance;
	private double accumulativeInterest;
	
	SavingsAccount2(double b) { 
		balance = b;
	}
	
	/**
	 * 
	 * @param amt Amount Of Withdrawal
	 */
	
	public void widthdrawl(double amt) { 
		balance = balance - amt;
	}
	
	/**
	 * Adds Deposit To Current Balance
	 * @param amt Amount Of Deposit 
	 */
	
	public void deposit(double amt) { 
		balance = balance + amt;
	}
	
	/**
	 * Adds Interest Rate And Accumulative Interest
	 */
	
	public void addIntrestRate() { 
		
		balance += balance * (annualInterestRate/12);
		accumulativeInterest += balance * (annualInterestRate/12);
	}
	
	// Getters
	public double getBalance() { 
		return balance;
	}
	
	public double getAccumulativeInterest() {
		return accumulativeInterest;
	}
	
	// Setters
	public void setAnnualInterestRate(double air){
		annualInterestRate = air;
	}
}