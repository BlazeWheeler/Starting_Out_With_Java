/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 313 Problem 5: Falling Distance
 * 
 * @Description When an object is falling because of gravity, 
 * the following formula can be used to determine the distance the 
 * object falls in a specific time period:
 * 						1
 *				   d = --- g(t*t)
 * 						2
 * The variables in the formula are as follows: d is the distance in 
 * meters, g is 9.8, and t is the amount of time, in seconds, 
 * that the object has been falling.
 * Write a method named fallingDistance that accepts an object’s falling
 * time (in seconds) as an argument. The method should return the 
 * distance, in meters, that the object has fallen during that time 
 * interval. Demonstrate the method by calling it in a loop that 
 * passes the values 1 through 10 as arguments, and displays the return 
 * value.
 */

import java.text.*;

public class FallingDistance {

	public static void main(String[] args) {

		//Decimal Formatter
		DecimalFormat meters = new DecimalFormat("##.##");
		double output = 0.0;
		
		//Table Formatting
		System.out.println("Seconds\t Distance (m)");
		System.out.println("________________________");
		
		for(int i = 1; i < 10 + 1; i++) { 
			//More Table Formatting
			System.out.print(i +" \t| " + "");
	
			output = fallingDistance(i);
			System.out.println(meters.format(output));
		}
	}
	
	/*
	 * Prints Falling Distance Of Object In Meters
	 * @param sec Number Of Seconds Object Is Falling
	 * @return Returns Falling Distance In Meters—____--
	 */
	public static double fallingDistance(int sec) { 
		
		double distance = .5; 
		double t = sec * sec;
		double g = 9.8;
		g = g * t;
		
		distance = distance * g;
		
		return distance;
		
	}

}
