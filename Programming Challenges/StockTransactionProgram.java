
/*------------------------------------------------------------------------------------
 * MARK: @@@AUTHOR: Blaze Wheeler @ https://github.com/blazeWheeler
 * 
 * Last month Joe purchased some stock in Acme Software, Inc.  
 * Here are the details of the purchase:
 * The number of shares that Joe purchased was 1,000.
 * When Joe purchased the stock, he paid $32.87 per share.
 * Joe paid his stockbroker a commission that amounted to 2% of the amount he paid
 * for the stock.
 * 
 * Two weeks later Joe sold the stock. Here are the details of the sale:
 * The number of shares that Joe sold was 1,000.
 * He sold the stock for $33.92 per share.
 * He paid his stockbroker another commission that amounted to 2% of the amount he
 * received for the stock.
 * Write a program that displays the following information:
 * The amount of money Joe paid for the stock.
 * The amount of commission Joe paid his broker when he bought the stock.
 * The amount that Joe sold the stock for.
 * The amount of commission Joe paid his broker when he sold the stock.
 * Display the amount of profit that Joe made after selling his stock and paying the two
 * commissions to his broker. 
 * (If the amount of profit that your program displays is a negative number, 
 * then Joe lost money on the transaction.)
 *------------------------------------------------------------------------------------
 */


import java.text.DecimalFormat;

public class StockTransactionProgram {
	
	public static void main(String[] args) {
		
		DecimalFormat usd = new DecimalFormat("$ ###,###.##");
		
		// Totals of Stock Bought, Sold , And Commission Price 
		double totalBought, totalSold, totalCom, totalSoldCommission, stockProfit;
		int sharesPurchased = 1000;
		double stockPrice = 32.87; 
		// Commission Price Percent
		double comPrice = .02;
		double soldPrice = 33.92;
		
		//MARK: Bought Calculations 
		totalBought = sharesPurchased * stockPrice; 
		totalCom = totalBought * comPrice; 
		
		
		//MARK: Output
		System.out.println("Toal Amount Paid: " + usd.format(totalBought));
		System.out.println("Total Amount Of Commission Paid For Stock: " + 
		usd.format(totalCom)); 
		System.out.println("Sold Per Share Price: " + usd.format(soldPrice));
		
		// MARK: Sold Calculations 
		totalSold = sharesPurchased * soldPrice; 
		totalSoldCommission = totalSold * comPrice;
		
		//Total Shares Sold Price - Total Shares Bought Price 
		stockProfit = totalSold - totalBought;
		//Total - Bought Commission fee
		stockProfit = stockProfit - totalCom;
		// Total - sold Commission fee
		stockProfit = stockProfit - totalSoldCommission;
		
		// MARK: Output
		
		System.out.println("Total Commission Paid When Sold: " + totalSoldCommission);
		System.out.println("Total Profit " + usd.format(stockProfit) );
		
		
		}
	
}

