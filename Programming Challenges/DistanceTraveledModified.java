/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 315 Problem 9: Distance Traveled Modification
 * 
 * @Description The distance a vehicle travels can be calculated as follows:
 * Distance 5 Speed * Time
 * write a method named distance that accepts a vehicle’s speed and time
 * as arguments, and returns the distance the vehicle has traveled. 
 * Modify the “Distance Traveled” program you wrote 
 * in Chapter 4 (Programming Challenge 2) to use the method.
 */

import java.util.Scanner;
public class DistanceTraveledModified {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		int speed, numOfHours; 
		//Distance Traveled
		double dt;
		
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
			//Method Call
			dt = distance(speed, i);
			
			System.out.println(i + "\t\t" + dt);
		}
	}
	
	/*
	 * Calculates Distance Traveled Of A Vehicle
	 * @param s Speed Of Vehicle in MPH
	 * @param t Time Of Vehicle In Hours
	 */
	
	public static double distance(int s, int t) { 
		double distanceTraveled;
		
		distanceTraveled = s * t;
		return distanceTraveled;
	}
}

