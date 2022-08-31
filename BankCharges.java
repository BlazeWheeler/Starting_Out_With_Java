

import java.text.DecimalFormat;
import java.util.*;
public class BankCharges {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat usd = new DecimalFormat("$ ###,###.##");
		
		final double BASE_CHARGE = 10.00;
		double total,serviceFee;
		int numOfChecks; 
		
		//Get Input 
		System.out.println("Enter Number Of Checks Written This Month: ");
		numOfChecks = in.nextInt(); 
		in.close();
		
		//IF-ELSE Logic
		if(numOfChecks < 20) { 
			serviceFee = .10 * numOfChecks; 
			total = BASE_CHARGE + serviceFee; 
			System.out.println("Service Fee: " + usd.format(serviceFee) + "\n" + 
							   "Total:" + usd.format(total));
		}
		
		if(numOfChecks > 20 && numOfChecks < 40) { 
			serviceFee = .08 * numOfChecks; 
			total = BASE_CHARGE + serviceFee; 
			System.out.println("Service Fee: " + usd.format(serviceFee) + "\n" + 
							   "Total:" + usd.format(total));
		}
		
		if(numOfChecks > 40 && numOfChecks < 60) { 
			serviceFee = .06 * numOfChecks; 
			total = BASE_CHARGE + serviceFee; 
			System.out.println("Service Fee: " + usd.format(serviceFee) + "\n" + 
							   "Total:" + usd.format(total));
		}
		
		if(numOfChecks > 60) { 
			serviceFee = .04 * numOfChecks; 
			total = BASE_CHARGE + serviceFee; 
			System.out.println("Service Fee: " + usd.format(serviceFee) + "\n" + 
							   "Total:" + usd.format(total));
		}
	}
}
