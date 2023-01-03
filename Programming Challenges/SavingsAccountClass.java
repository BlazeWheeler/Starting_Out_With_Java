/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 400 Problem 12: SavingsAccount Class
 * 
 * @Description Design a SavingsAccount class that stores a savings 
 * account’s annual interest rate and balance. The class constructor
 * should accept the amount of the savings account’s starting balance.
 * The class should also have methods for subtracting the amount of a withdrawal,
 * adding the amount of a deposit, and adding the amount of monthly interest to the balance.
 * The monthly interest rate is the annual interest rate divided by twelve. 
 * To add the monthly interest to the balance, multiply the monthly interest
 * rate by the balance, and add the result to the balance.
 * 
 * Test the class in a program that calculates the balance of a savings account at the end of a period of time. It should
 * ask the user for the annual interest rate, the starting balance, and the number of months that have passed since the 
 * account was established. A loop should then iterate once for every month, performing the following:
 *		a. Ask the user for the amount deposited into the account during the month. Use the class method to add this
 *		   amount to the account balance.
 * 		b. Ask the user for the amount withdrawn from the account during the month. Use the class method to subtract
 * 		   this amount from the account balance.
 * 		c. Use the class method to calculate the monthly interest.
 * 		   After the last iteration, the program should display the ending balance, the total amount of deposits, the total
 * 		   amount of withdrawals, and the total interest earned.
 */


import java.util.*;

public class SavingsAccountClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		double startingBalance, 
			   annualIntrest; 
		int numOfMonths;

		double amtDeposit = 0, 
			   amtWithdrawl = 0,
			   withdrawls = 0 ,
			   deposits = 0;
			   
		
		// Get Input;
		System.out.println("Enter Starting Balance: ");
		startingBalance = in.nextDouble(); 
		
		System.out.println("Enter Annual Intrest Rate: ");
		annualIntrest = in.nextDouble(); 
		
		
		System.out.println("Enter Number Of Months Since "
						 + "Account Was Established: ");
		numOfMonths = in.nextInt(); 
		
		// Create Object
		SavingsAccount account1 = new SavingsAccount(startingBalance);
		// Set Annual Interest Rate
		account1.setAnnualInterestRate(annualIntrest);
		
		//Iterate Through Number Of Months To Receive Data
		for(int i = 1; i < numOfMonths + 1; i++) { 
			
			System.out.println("Enter Amount Deposited In Month " 
								+ i +  ":");
			amtDeposit = in.nextDouble(); 
			account1.deposit(amtDeposit);
			
			// Deposits Accumulator
			deposits += amtDeposit;
			
			System.out.println("Enter Amount Withdrawled In Month " 
					+ i +  ":");
			amtWithdrawl = in.nextDouble(); 
			account1.widthdrawl(amtWithdrawl);
			// Deposits Accumulator
			withdrawls += amtWithdrawl;
			// Call addIntrestRate
			account1.addIntrestRate();	
		}
		// Close Scanner
		in.close();
		
		// Output
		System.out.printf("\nEnding balance: $%.2f", account1.getBalance());
		System.out.printf("\nTotal deposits: $%.2f", deposits);
		System.out.printf("\nTotal withdrawals: $%.2f", withdrawls);
		System.out.printf("\nTotal interest: $%.2f", account1.getBalance());
	}
}

class SavingsAccount { 
	
	private double annualInterestRate; 
	private double balance;
	private double accumulativeInterest;
	
	SavingsAccount(double b) { 
		
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

