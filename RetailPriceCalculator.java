/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 312 Problem 2: Retail Price Calculator
 * 
 * @Description Write a program that asks the user to enter an item’s
 * wholesale cost and its markup percentage. It should then display the
 * item’s retail price. For example:
 * If an item’s wholesale cost is 5.00 and its markup percentage is 
 * 100 percent, then the item’s retail price is 10.00.
 * If an item’s wholesale cost is 5.00 and its markup percentage is 
 * 50 percent, then the item’s retail price is 7.50.
 * The program should have a method named calculateRetail that receives 
 * the wholesale cost and the markup percentage as arguments, 
 * and returns the retail price of the item.
 */

import java.util.*;
import java.text.*;
public class RetailPriceCalculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double wholeSale, markupPercent; 
		
		System.out.println("Enter Wholesale Cost: ");
		wholeSale = in.nextDouble(); 
		
		System.out.println("Enter Markup Percent: "); 
		markupPercent = in.nextDouble() / 100;
		in.close();
		
		calculateRetail(wholeSale, markupPercent);

	}
	
	public static void calculateRetail(double ws, double mp){ 
		
		DecimalFormat usd = new DecimalFormat("$ ###,###.##");
		double retail = 0.0;
		
		retail = ws * mp; 
		retail = retail + ws;
		
		System.out.println("Retail Price: " + usd.format(retail));
	}

}
