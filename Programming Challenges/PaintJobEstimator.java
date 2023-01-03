/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 312 Problem 7: Paint Job Estimator
 * 
 * @Description A painting company has determined that for every 115 
 * square feet of wall space, one gallon of paint and eight hours of 
 * labor will be required. The company charges $18.00 per hour for labor.
 * Write a program that allows the user to enter the number of rooms
 * to be painted and the price of the paint per gallon. It should also 
 * ask for the square feet of wall space in each room. The program 
 * should have methods that return the following data:
 * The number of gallons of paint required
 * The hours of labor required
 * The cost of the paint
 * The labor charges
 * The total cost of the paint job
 * Then it should display the data on the screen.
 */

import java.util.*;
import java.lang.Math;
import java.text.*;

public class PaintJobEstimator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		DecimalFormat usd = new DecimalFormat("$###,###.##");
		
		int numOfRooms;
		double pricePerGallon, galRequired, laborCost,numOfHours; 
		double paintCost, totalJobCost;
		double wallSpace = 0.0;
		
		System.out.println("Enter The Number Of Rooms To Be Painted: ");
		numOfRooms = in.nextInt(); 
		
		for(int i = 0; i < numOfRooms; i ++) { 
			// I + 1 = Room 
			System.out.println("Enter Square Ft. Of Wall Space in room "
							   + (i+ 1) + " : ");
			wallSpace += in.nextDouble();
		}
		
		//Method Call
		galRequired = gallonsRequired(wallSpace);
		
		// Uses Hours Of Labor Method -> Divides By Hourly Rate
		numOfHours = hoursOfLabor(galRequired) / 18;
		laborCost = hoursOfLabor(galRequired);
		
		System.out.println("Enter Price Per Gallon Of Paint (In $USD): ");
		pricePerGallon = in.nextDouble(); 
		in.close();
		
		// Method Calls 
		paintCost = costOfPaint(pricePerGallon, galRequired);
		totalJobCost = totalCost(laborCost, paintCost);
		
		// Print Output 
		System.out.println("Total Gallon(s) Of Paint Required: " + galRequired);
		System.out.println("Total Hours Of Labor Required: " + numOfHours);
		System.out.println("Total Cost Of Paint: " + usd.format(paintCost));
		System.out.println("Total Labor Cost: " + usd.format(laborCost));
		System.out.println("Total Cost Of Job: " + usd.format(totalJobCost));
	}
	
	/*
	 * Calculates Gallons Of Paints Required For All Rooms
	 * @param ws (Wall Space) Total Square Feet Of All Rooms
	 * @return total Total Gallons Of Paint Required 
	 */
	public static double gallonsRequired( double ws) { 
		//Total Gallons 
		double total;
		
		if(ws < 115) 
			total = 1;
		else
		 total = ws / 115; 
		
		// Rounds Only Up Not Down 
		return Math.ceil(total);	
	}
	
	/*
	 * Calculates Total Of Hours And Total Cost Of Labor
	 * @param galReq gallons Of Paint Required 
	 * @return total Cost Total Cost Of Labor
	 */
	public static double hoursOfLabor(double galReq) { 
		//Total Hours Of Labor
		int totalHours;
		double totalCost;
		
		if(galReq < 1)
			totalHours = 0; 
		else
		totalHours = (int) (galReq * 8);
		totalCost = totalHours * 18;
		
		return totalCost;
	}
	
	/*
	 * Calculates Total Cost Of Paint
	 * @param ppg User Input Price Per Gallon
	 * @param numGal Number Of Gallons Of Paint
	 * @return total Cost Of Paint
	 */
	public static double costOfPaint(double ppg, double numGal) { 
		double total; 
		total = ppg * numGal;
		return total;
	}
	
	/*
	 * Calculates Total Cost Of Paint Job
	 * @param lc Labor Cost
	 * @param pc Paint Cost
	 * @return total Returns Total Cost Of Overall Paint Job
	 */
	public static double totalCost(double lc, double pc) { 
		double total; 
		total = lc + pc;
		return total;
	}
}
