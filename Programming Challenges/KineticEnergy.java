
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 315 Problem 12: Kinetic Energy
 * 
 * @Description In physics, an object that is in motion is said to have 
 * kinetic energy. The following formula can be used to determine 
 * a moving object’s kinetic energy:
 * 		 								 	  1
 * 								  		KE = --- mv2
 *		 								  	  2
 * The variables in the formula are as follows: KE is the kinetic energy,
 * m is the object’s mass in kilograms, and v is the object’s velocity,
 * in meters per second.
 * Write a method named kineticEnergy that accepts an object’s mass 
 * (in kilograms) and velocity (in meters per second) as arguments. 
 * The method should return the amount of kinetic energy that the 
 * object has. Demonstrate the method by calling it in a program that 
 * asks the user to enter values for mass and velocity.
 */

import java.util.*;
import java.text.*;
public class KineticEnergy {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		DecimalFormat jules = new DecimalFormat("##.##");
		
		double mass = 0.0,
			   velocity = 0.0;
		
		//Get User Input
		System.out.println("Enter Mass In Kilograms");
		mass = in.nextInt();
		
		System.out.println("Enter Velocity In Meters Per Second");
		velocity = in.nextInt();
		in.close();
		
		//Output
		System.out.print("Kinetic Energy: ");
		//Method Call & Format Output 
		System.out.println(jules.format(kineticEnegry(mass, velocity))+ " J");
	}
	
	/*
	 * Calculates An Objects In Motion's Kinetic Energy
	 * @param mass Mass Of Object In KiloGrams
	 * @param mps Velocity Of Object In Meters Per Second 
	 * @return ke returns Kinetic Energy
	 */
	public static double kineticEnegry(double mass, double mps) { 
		
		double ke = .5,
			   v = mps * mps;
			   v = v * mass; 
			   ke = ke * v;
		return ke;	   
	}
}
