/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 315 Problem 11: Multiple Stock Sales
 * 
 * @Description Use the method that you wrote for Programming
 * Challenge 10 (Stock Profit) in a program that calculates the
 * total profit or loss from the sale of multiple stocks. 
 * The program should ask the user for the number of stock sales,
 * and the necessary data for each stock sale. It should accumulate 
 * the profit or loss for each stock sale and then display the total.
 */

import java.util.*;
import java.text.*;
public class MutipleStockSales {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		// USD Format
		DecimalFormat usd = new DecimalFormat(" $0.00");
		
		int    numOfShares,
				userChoice; 
		double pricePerShare, 
			   purchaseCommission,
			   salesPrice, 
			   salesCommissionPaid,
			   profitOut = 0;
		
		
		//Input Validation 
		do { 
			System.out.println("How Many Different Stocks Did You Purchase");
			userChoice = in.nextInt();
			
			if(userChoice < 1)  
				System.out.println("Please Enter Number Greater Than 1 \n"
								+ "-----------------------------------------" );
		} while(userChoice < 1);
	
		for(int i = 1; i < userChoice + 1 ; i++) { 
			// Get Number Of Shares Purchased
			System.out.println("Stock " + i + ": "
										+ "Enter Number Of Shares (In $USD): ");
			numOfShares = in.nextInt();
			
			// Get Purchase Price Amount 
			System.out.println("Stock " + i + ": "
											+"Enter Purchase Price (In $USD): ");
			pricePerShare = in.nextDouble(); 
			
			// Get Commission Cost On Original Purchase
			System.out.println("Stock " + i + ": "
											+"Enter Purchase Commission Paid (In $USD): ");
			purchaseCommission = in.nextDouble();
			
			// Get Price Of Shares After Sold
			System.out.println("Stock " + i + ": "
										+"Enter Sell Price (In $USD): ");
			salesPrice = in.nextDouble(); 
			
			// Get Commission Cost After Sold 
			System.out.println("Stock " + i + ": "
										+"Enter The Sale Commission Paid (In $USD): ");
			salesCommissionPaid = in.nextDouble();
		
			// Store Profit Or Loss
			profitOut += profit(numOfShares, pricePerShare, purchaseCommission, salesPrice, salesCommissionPaid);
		}
		in.close();
		//Output Profit Or Loss Amount
		if(profitOut < 0)
			System.out.println("You Lost: " + usd.format(profitOut));
		if(profitOut > 0)
			System.out.println("You Profits: " + usd.format(profitOut));
		if(profitOut == 0)
			System.out.println("No Gain Or Loss ");
	}
	
	/*
	 * Calculates Profit Or Loss Of Bought And Sold Stocks Using: 
	 * Profit = ((NS * SP) - SC) - ((NS * PP) + PC)
	 * @param ns Number Of Shares
	 * @param pp Purchase Price
	 * @param pc Purchase Commission Paid
	 * @param sp Sale Price
	 * @param sc Sales Commission Paid
	 * @return profit Profit Or Loss Amount
	 */
	
	public static double profit(int ns, double pp, 
								double pc, double sp, double sc)
	{
		double profit;
		
		// Profit = ((NS * SP) - SC) - ((NS * PP) + PC)
		profit = ((ns * sp)- sc); 
		profit = profit - ((ns * pp)+ pc);
		
		return profit;
	}
}









