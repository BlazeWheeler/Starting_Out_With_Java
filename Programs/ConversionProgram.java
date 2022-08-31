/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 314  Problem 8: Conversion Program
 * 
 * @Description Write a program that asks the user to enter a
 * distance in meters. The program will then present the following 
 * menu of selections:
 * 		1. Convert to kilometers 
 * 		2. Convert to inches
 * 		3. Convert to feet
 *		4. Quit the program
 * The program will convert the distance to kilometers, inches, or feet, 
 * depending on the user’s selection. 
 * 
 */

import java.util.*;

public class ConversionProgram {
	
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in); 
		int userChoice = 0, 
			meters = 0;
		
		// Program Loops Unless 4 Is Entered
		while(userChoice != 4) { 
			
			//Input Validation Loop For userChoice Input
			do { 
				menu();
				userChoice = in.nextInt();
				
				// Exit With Sentinel Value
				if(userChoice == 4) { 
					System.out.println("Bye!"); 
					System.exit(0);
				}
				
				while(meters <=0) { 
					System.out.println("Enter A Distance In Meters: ");
					meters = in.nextInt();
				}
				
				if(userChoice < 1 || userChoice > 4)
					System.out.println("USER ERROR: Invalid Choice \n");
			}while(userChoice < 1 || userChoice > 4);
			
			// Calculation -> Method Calls
			if(userChoice ==1)
				showKilometers(meters);
			if(userChoice == 2)
				showInches(meters); 
			if(userChoice == 3)
				showFeet(meters);
			
			//Sets UserInput To 0 To Continue The loop 
			meters = 0;
			userChoice = 0;
			
		}
		// If Outside Of WhileLoop Scanner Will Close
		in.close();
	}
	
	/*
	 * Outputs Menu
	 */
	public static void menu() { 
		System.out.println("1. Convert To Kilometers \n" + 
						   "2. Convert To Inches \n" + 
						   "3. Convert To Feet \n" + 
						   "4. Quit The Program \n");
		System.out.println("Enter Your Choice"); 
	}
	
	/*
	 * Converts Meters -> Prints Kilometers
	 * @param m User Inputed Meters
	 */
	public static void showKilometers(int m) { 
		double total = 0.0; 
		total = m * 0.001;
		
		System.out.println(m + " = " + total + " In Kilometers\n");
	}
	
	/*
	 * Converts Meters -> Prints Inches
	 * @param m User Inputed Meters
	 */
	public static void showInches(int m) { 
		double total = 0.0; 
		total = m * 39.37;
		
		System.out.println(m + " = " + total + " In Inches\n");
	}
	
	/*
	 * Converts Meters -> Prints Feet
	 * @param m User Inputed Meters
	 */
	public static void showFeet(int m) { 
		double total = 0.0; 
		total = m * 3.281; 
		
		System.out.print(m + " = " + total + " In Feet\n");
	}
}
