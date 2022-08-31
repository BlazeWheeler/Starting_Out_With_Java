/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 316 Problem 16: Present Value
 * 
 * @Description Suppose you want to deposit a certain amount of money 
 * into a savings account, and then leave it alone to draw interest 
 * for the next 10 years. At the end of 10 years, you would like to
 * have $10,000 in the account. How much do you need to deposit today
 * to make that happen? You can use the following formula, which is 
 * known as the present value formula, to find out:
 * 		   			    F
 * 				P = --------
 * 	   			    (1+r) *2
 * 
 * The terms in the formula are as follows:
 * P is the present value, or the amount that you need to deposit today.
 * F is the future value that you want in the account. (F is $10,000.)
 * r is the annual interest rate.
 * n is the number of years that you plan to let the money sit 
 * in the account.
 * Write a method named presentValue that performs this calculation. 
 * The method should accept the future value, annual interest rate, 
 * and number of years as arguments. It should return the present value,
 * which is the amount that you need to deposit today. Demonstrate the
 * method in a program that lets the user experiment with different 
 * values for the formula’s terms.
 */

import java.util.*;
import java.text.*;

public class PresentValue {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		DecimalFormat usd = new DecimalFormat("$ ###,###.##");
		
		double futureValue, 
			   presentValue,
			   intrestRate; 
		int numOfYears; 
		
		System.out.println("Enter Future Value: ");
		futureValue = in.nextDouble();
		
		System.out.println("Enter Intrest Rate;");
		intrestRate = in.nextDouble()/100; 
						
		System.out.println("Enter Desired Number Of Years");
		numOfYears = in.nextInt();
		in.close();
		
		//Method Call
		presentValue = presentValue(futureValue, intrestRate, numOfYears);
		//Output
		System.out.println("Present Value: " + usd.format(presentValue));
	}
	
	/*
	 * Calculates Present Value Need To Achieve Desired Saving Amount
	 * @param ft Future Value
	 * @param air Annual Rate Of Interest
	 * @param noy Number Of Years
	 */
	
	public static double presentValue(double ft, double air, int noy) {
		
		double p = 0.0; 
		//(1 +r )
		p = 1 + air;
		// 1r^n
		p = Math.pow(p, noy);
		// F/(1+r)^n
		p = ft / p; 
		
		return p;
	}
}
