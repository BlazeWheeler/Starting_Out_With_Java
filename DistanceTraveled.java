/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 263 Problem 2: Distance Traveled  
 * 
 * @Description The distance a vehicle travels can be calculated as 
 * follows: Distance 5 Speed * Time For example, if a train travels
 * 40 miles-per-hour for three hours, the distance traveled
 * is 120 miles. Write a program that asks for the speed of a vehicle
 * (in miles-per-hour) and the number of hours it has traveled. 
 * It should use a loop to display the distance a vehicle has
 * traveled for each hour of a time period specified by the user.
 * For example, if a vehicle is traveling at 40 mph for a 
 * three-hour time period, it should display a report similar to the
 * one that follows:
 * 					 	Hour    Distance Traveled
 *		 				-------------------------
 *			 			1 		40
 *			 			2 		80
 *						3 		120
 * Input Validation: Do not accept a negative number for speed 
 * and do not accept any value less than 1 for time traveled.
 */

import java.util.*;
public class DistanceTraveled {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		int speed, numOfHours; 
		
		System.out.println("Enter Speed Of Vehicle (In MPH): ");
		speed = in.nextInt();
		
		System.out.println("Enter Time Traveled (In Hours): ");
		numOfHours= in.nextInt();
		
		//Input Validation Speed 
		if(speed <= 0) { 
			do { 
				System.out.println("Enter A Postive Number For Speed:");
				speed = in.nextInt();
			}while(speed <= 0);
		}
		
		//Input Validation Hours
		if(numOfHours < 1) { 
			do { 
				System.out.println("Enter A Postive Number For " + 
								   "Hours: ");
				speed = in.nextInt();
			}while(numOfHours < 1);
		}
		in.close();
		
		// Formatting Title Output
		System.out.println("Hour \t Distance Traveled");
		System.out.println("--------------------------");
		
		// Loop For Calculations 
		for(int i = 1; i < numOfHours + 1; i++) { 
			System.out.println(i + "\t\t" + speed * i);
		}
	}
}
