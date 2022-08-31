/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 399 Problem 10: A Game of Twenty-One
 * 
 * @Description For this assignment, you will write a program 
 * that lets the user play against the computer in a variation 
 * of the popular blackjack card game. In this variation of the 
 * game, two six-sided dice are used instead of cards. 
 * The dice are rolled, and the player tries to beat the 
 * computer’s hidden total without going over 21.
 * Here are some suggestions for the game’s design:
 * Each round of the game is performed as an iteration of a 
 * loop that repeats as long as the player agrees to roll 
 * the dice, and the player’s total does not exceed 21.
 * At the beginning of each round, the program will ask the 
 * user whether or not he or she wants to roll the dice to 
 * accumulate points.
 * During each round, the program simulates the rolling of two 
 * six-sided dice. It rolls the dice first for the computer,
 * and then it asks the user whether he or she wants to roll.
 * (Use the Die class that was shown in Code Listing 6-14 to simulate the dice.) 
 * The loop keeps a running total of both the computer’s and the user’s points.
 * The computer’s total should remain hidden until the loop has finished.
 * After the loop has finished, the computer’s total is revealed,
 * and the player with the most points, without going 
 * over 21, wins.
 */

import java.util.Random;
import java.util.*;

public class AGameOfTwentyOne {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		//Create Instances Of Die Class
		Die user = new Die(6);
		Die computer = new Die(6);
		
		
		int compScore, userScore,
		userChoice = 0;
		
		//Output Formatting
		System.out.println("A Game Of 21");
		System.out.println("-------------------------------------------------");
		
		//First Roll 
		userScore = user.getValue();
		compScore = computer.getValue();
		
		//Output
		System.out.println("Round 1 |" + " You Rolled " + user.getValue() + 
						   " | Your Score Is : " + userScore);
		System.out.println("-------------------------------------------------");
		System.out.println("Enter -99 To Roll Again | Enter Any Number To End:");
		userChoice = in.nextInt();
		
		do { 
			
			for(int i = 2; userChoice == -99; i++) { 
				
				// User Roll Again
				user.roll();
				// Add To User Score 
				userScore += user.getValue(); 
				
				// Opponent Roll Again
				computer.roll();
				// Opponent Add To Computer Score
				compScore += computer.getValue();
				//Output 
				System.out.println("Round " + i + " | You Rolled " + user.getValue() + 
								   " | Score: " + userScore);
				System.out.println("-------------------------------------------------");
				System.out.println("Enter -99 To Roll Again | Enter Any Number To End: ");
				
				userChoice = in.nextInt();
				System.out.println("-------------------------------------------------");
				
				// Does Not Allow Score Over 21
					if(userScore > 21) { 
						System.out.println("You Lost!\n" + "Computer Score: " + compScore + "\n" +
						   		   		   "Your Score " + userScore);
						System.exit(0);
					}
					if(compScore > 21) { 
						System.out.println("You Won!\n" + "Computer Score: " + compScore + "\n" +
								   "Your Score " + userScore);
						System.exit(0);
					}
				}
			
		} while(userChoice == -99);
		in.close();
		
		//Win Conditions
		if(compScore > userScore)
			System.out.println("You Lost!");
		if(compScore < userScore)
			System.out.println("You Won!");
		
		System.out.println("Computer Score: " + compScore + "\n" +
		   		           "Your Score " + userScore);
		System.exit(0);
	}
}


/**
The Die class simulates a six-sided die.
*/

class Die {
private int sides;   // Number of sides
private int value;   // The die's value

/**
   The constructor performs an initial
   roll of the die.
   @param numSides The number of sides for this die.
*/

public Die(int numSides) {
   sides = numSides;
   roll();
}

/**
   The roll method simlates the rolling of
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
