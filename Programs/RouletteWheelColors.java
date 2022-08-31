/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 402 Problem 15: Roulette Wheel Colors
 * 
 * @Description On a roulette wheel, the pockets are numbered from 0 to 36. 
 * The colors of the pockets are as follows:
 * Pocket 0 is green.
 * For pockets 1 through 10, the odd numbered pockets are red and 
 * the even numbered pockets are black.
 * For pockets 11 through 18, the odd numbered pockets are black 
 * and the even numbered pockets are red.
 * For pockets 19 through 28, the odd numbered pockets are red and 
 * the even numbered pockets are black.
 * For pockets 29 through 36, the odd numbered pockets are black
 * and the even numbered pockets are red.
 * Write a class named RoulettePocket. The class’s constructor 
 * should accept a pocket number. The class should have a method 
 * named getPocketColor that returns the pocket’s color, as a string.
 * Demonstrate the class in a program that asks the user to enter 
 * a pocket number, and displays whether the pocket is green, red, 
 * or black. The program should display an error message if the 
 * user enters a number that is outside the range of 0 through 36.
 */

import java.util.*;

public class RouletteWheelColors {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		int pocket = 0;
		
		// Input Validation
		do { 
			System.out.println("Enter Number (1 - 36): "); 
			pocket = in.nextInt();
		}while(pocket < 0 || pocket > 36);
		in.close();
		
		// Create Instance
		RoulettePocket userPicked = new  RoulettePocket(pocket);
		//output
		System.out.print("Pocket Color: ");
		System.out.println(userPicked.getPocketColor());
	}
}

class RoulettePocket { 
	
	private int pocket;
	
	RoulettePocket(int p) { 
		this.pocket = p;
	}
	
	public String getPocketColor() { 
		
		int p = this.pocket;
		
		String pocket = "";
		
		// Green || 0
		if (p == 0)
			pocket = "Green";
		
			// 1 - 10
			switch(p %2) { 
			// Even = Black
			case 0: 
				// 1 - 10 Even = Black
				if(p > 0 && p <= 10)
					pocket = "Black";
				// 11 - 18 Even = Red
				if(p > 10 && p <= 18)
					pocket = "Red";
				// 19 - 28 Even = Black
				if(p > 18 && p <= 28)
					pocket = "Black";
				//29 - 36 Even = Red
				if(p > 28 && p <= 36)
					pocket ="Red";
				
			// Odd = Red	
			default: 
				// 1 - 10 Odd
				if(p > 0 && p <= 10)
					pocket = "Red";
				// 11 = 18 Odd
				if(p > 10 && p <= 18)
					pocket = "Black";
				//19 - 28 Odd = Black
				if(p > 18 && p <= 28)
					pocket = "Red";
				//29 - 36 Odd = Black
				if(p > 28 && p <= 36)
					pocket ="Black";
			}
	return pocket; 	
	}
}
