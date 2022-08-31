/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 315 Problem 10: Stock Profit
 * 
 * @Description The profit from the sale of a stock can be
 * calculated as follows:
 * Profit = ((NS * SP) - SC) - ((NS * PP) + PC)
 * where NS is the number of shares, PP is the purchase price per share,
 * PC is the purchase commission paid, SP is the sale price per share, 
 * and SC is the sale commission paid. If the calculation yields a 
 * positive value, then the sale of the stock resulted in a profit. 
 * If the calculation yields a negative number, then the sale resulted 
 * in a loss.
 * Write a method that accepts as arguments the number of shares, 
 * the purchase price per share, the purchase commission paid, the sale
 * price per share, and the sale commission paid. The method should 
 * return the profit (or loss) from the sale of stock. 
 * Demonstrate the method in a program that asks the user to enter the 
 * necessary data and displays the amount of the profit or loss.
 *  
 */

import java.util.*;
import java.text.*;
public class StockProfit {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		// USD Format
		DecimalFormat usd = new DecimalFormat(" $ 0.00");
		
		int    numOfShares; 
		double pricePerShare, 
			   purchaseCommission,
			   salesPrice, 
			   salesCommissionPaid,
			   profitOut;
		
		// Get Number Of Shares Purchased
		System.out.println("Enter Number Of Shares: ");
		numOfShares = in.nextInt();
		
		// Get Purchase Price Amount 
		System.out.println("Enter Purchase Price (In $USD): ");
		pricePerShare = in.nextDouble(); 
		
		// Get Commission Cost On Original Purchase
		System.out.println("Enter Purchase Commission Paid (In $USD): ");
		purchaseCommission = in.nextDouble();
		
		// Get Price Of Shares After Sold
		System.out.println("Enter Sell Price (In $USD): ");
		salesPrice = in.nextDouble(); 
		
		// Get Commission Cost After Sold 
		System.out.println("Enter The Sale Commission Paid (In $USD): ");
		salesCommissionPaid = in.nextDouble();
		in.close();
		
		// Store Profit Or Loss
		profitOut = profit(numOfShares, pricePerShare, purchaseCommission, salesPrice, salesCommissionPaid);
	
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
