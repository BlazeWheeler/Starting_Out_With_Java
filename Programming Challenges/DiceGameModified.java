
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 401 Problem 14: Dice Game
 * 
 * @Description Write a program that uses the Die class that was presented in this chapter 
 * to play a simple dice game between the computer and the user. The program should create
 * two instances of the Die class (each a 6-sided die). One Die object is the computer’s 
 * die, and the other Die object is the user’s die.
 * The program should have a loop that iterates 10 times. Each time the loop iterates, 
 * it should roll both dice. The die with the highest value wins. 
 * (In case of a tie, there is no winner for that particular roll of the dice.)
 * As the loop iterates, the program should keep count of the number of times the computer
 *  wins, and the number of times that the user wins. After the loop performs all of its 
 *  iterations, the program should display who was the grand winner,
 *   the computer or the user.
 */

import java.util.Random;

public class DiceGameModified {

	public static void main(String[] args) {
		
		// Counters
		int userScore = 0,
			compScore = 0; 
		
		// Create Instance Of Object
		DieGame userDie = new DieGame(6);
		DieGame compDie = new DieGame(6);
		
		// Format Output
		System.out.println("Round\tUser\tComputer");
		System.out.println("--------------------------");
		
		for(int i = 1; i < 11; i++) { 
			
			//Roll Dice
			userDie.roll();
			compDie.roll();
			
			//Output Value Of Each Roll 
			System.out.println(i + "\t" + userDie.getValue() + "\t" + compDie.getValue() );
		
			if(userDie.getValue() > compDie.getValue())
				userScore++; 
			if(userDie.getValue() < compDie.getValue())
				compScore++; 	
		}
		
		// Format Output 
		System.out.println("--------------------------");
		System.out.println("Wins:\t" + userScore + "\t"  + compScore );
		System.out.println("--------------------------");
		
		// Win Condition Logic 
		if(userScore > compScore)
			System.out.println("Grand Winner: User");
		if(userScore < compScore)
			System.out.println("Grand Winner: Computer");	
		if(userScore == compScore)
			System.out.println("It's A Draw");
	}
}

class DieGame { 
	
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

	public DieGame(int numSides) {
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

	
	
	
