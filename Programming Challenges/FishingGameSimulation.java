/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 403 Problem 18: Fishing Game Solution
 * 
 * @Description For this assignment, you will write a program that simulates a fishing game. 
 * In this game, a six-sided die is rolled to determine what the user has caught.
 * Each possible item is worth a certain number of fishing points. 
 * The points will remain hidden until the user is finished fishing, and then a message is displayed congratulating the user, 
 * depending on the number of fishing points gained.
 * Here are some suggestions for the game’s design:
 * Each round of the game is performed as an iteration of a loop that repeats as long as the player wants to fish for more items.
 * At the beginning of each round, the program will ask the user whether or not he or she wants to continue fishing.
 * The program simulates the rolling of a six-sided die (use the Die class that was shown in Code Listing 6-14).
 * Each item that can be caught is represented by a number generated from the die; for example, 1 for “a huge fish”,
 * 2 for “an old shoe”, 3 for “a little fish”, and so on.
 * Each item the user catches is worth a different amount of points.
 * The loop keeps a running total of the user’s fishing points.
 * After the loop has finished, the total number of fishing points is displayed, along with
 * a message that varies depending on the number of points earned.
 */

import java.util.*;
import java.util.Random;

public class FishingGameSimulation {

	public static void main(String[] args) {
		
		int continueVar = 0;
		int userPoints = 0;
		Scanner in = new Scanner(System.in);
		
		// Formatting
		System.out.println("\tFishing Game");
		System.out.println("----------------------------------------------------------");
		
		// Create Die Object
		FishingDie die1 = new FishingDie(6);
		
		do { 
			// Roll Die
			die1.roll();
			switch(die1.getValue()) { 
			
			// Determining The Catch
				case 1: 
					System.out.println("You Caught A Little Fish");
					userPoints += 10;
					break;
				case 2: 
					System.out.println("You Caught A Medium Fish");
					userPoints += 20;
					break; 
				case 3:
					System.out.println("You Caught A Large Fish");
					userPoints += 30; 
					break; 
				case 4: 
					System.out.println("You Caught A Trophy Fish");
					userPoints += 40; 
					break; 
				case 5: 
					System.out.println("You Caught A Old Boot");
					break; 
				case 6: 
					System.out.println("You Caught A Gold Coin");
					userPoints += 100;
					break;
			}
			
			System.out.println();
			System.out.println("Enter A Postive Integer To Fish Again | Type (-99) To Exit: ");
			System.out.println("----------------------------------------------------------");
			
			continueVar = in.nextInt();
			
		// - 99 Sentinel Value
		}while(continueVar != -99);
		
		// Close Scanner After While Loop Exit
		in.close();
		
		// Output Messages For Points
		if(userPoints <= 50)
			System.out.println("You Scored: " + userPoints + " Better Luck Next Time!");

		if(userPoints > 50 && userPoints <= 100)
			System.out.println("You Scored: " + userPoints + " Nice Try! Better Luck Next Time.");
		
		if(userPoints > 100 && userPoints <= 200)
			System.out.println("You Scored: " + userPoints + "Hey! I Think You're Getting Good At This");
		
		if(userPoints > 200)
			System.out.println("You Scored: " + userPoints + "Great Job! You're A Real Catch");
	}
}

class FishingDie { 
	
	/**
	The Die class simulates a six-sided die.
	*/

	
	private int sides;   // Number of sides
	private int value;   // The die's value

	/**
	   The constructor performs an initial
	   roll of the die.
	   @param numSides The number of sides for this die.
	*/

	public FishingDie(int numSides) {
	   sides = numSides;
	   roll();
	}

	/**
	   The roll method simulates the rolling of
	   the die.
	*/

	public void roll() {
	   // Create a Random object.
	   Random rand = new Random();
	   
	   // Get a random value for the die.
	   value = rand.nextInt(sides) + 1;
	}

	/**
	   getSides method
	   @return The number of sides for this die.
	*/

	public int getSides() {
	   return sides;
	}

	/**
	   getValue method
	   @return The value of the die.
	*/

	public int getValue() {
		return value;
	}
}