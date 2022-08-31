/*------------------------------------------------------------------------------------
 *  MARK: @@@AUTHOR: Blaze Wheeler @ https://github.com/blazeWheeler
 * 
 *  Kathryn bought 600 shares of stock at a price of $21.77 per share.
 *  She must pay her stock- broker a 2 percent commission for the transaction. 
 *  Write a program that calculates and displays the following:
 *  • The amount paid for the stock alone (without the commission)
 *  • The amount of the commission
 *  • The total amount paid (for the stock plus the commission)
 *------------------------------------------------------------------------------------
 */



import java.text.DecimalFormat;


public class StockCommission {
	public static void main(String[] args) {
		
		int shares = 600;
		
		double stockPrice = 21.77;
		double stockTotal;
		double commissionPrice;
		double total; 
		
		// Output Format For United States Dollars
		DecimalFormat usd = new DecimalFormat("$ ###,###.##");
		
		// Formula For Total Amount Paid For Stock 
		stockTotal = stockPrice * shares; 
		// Formula For Commission Paid For Stock 
		commissionPrice = stockTotal * .02; 
		// Formula For Total Amount Paid For Stock + Commission
		total = commissionPrice + stockTotal; 
		
		System.out.println("Total Paid For Shares: " + usd.format(stockTotal));
		System.out.println("Total Commission Price: " + usd.format(commissionPrice));
		System.out.println("Total Paid: " + usd.format(total));
		
		
	}

}
