/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 402 Problem 16: Average Rainfall 
 * 
 * @Description Write a class named Coin. The Coin class should 
 * have the following field:
 * A String named sideUp. The sideUp field will hold either “heads” 
 * or “tails” indicating the side of the coin that is facing up.
 * The Coin class should have the following methods:
 * A no argument constructor that randomly determines the side of the 
 * coin that is facing up (“heads” or “tails”) and initializes the
 * sideUp field accordingly.
 * A void method named toss that simulates the tossing of the coin.
 * When the toss method is called, it randomly determines the side of the coin 
 * that is facing up (“heads” or “tails”) and sets the sideUp field accordingly.
 * A method named getSideUp that returns the value of the sideUp field.
 * Write a program that demonstrates the Coin class. 
 * The program should create an instance of the class and display
 * the side that is initially facing up. Then, use a loop to toss 
 * the coin 20 times. Each time the coin is tossed, display the side that
 * is facing up. The program should keep count of the number of 
 * times heads is facing up and the number of times tails is facing up, 
 * and display those values after the loop finishes.
 *
 */

import java.util.Random;

public class CoinTossSimulator {

	public static void main(String[] args) {
		
		// Create Coin
		Coin flip1 = new Coin(); 
		// Win Counters
		int heads = 0, tails = 0;
		
		for(int i = 1; i < 21; i ++) { 
			
			flip1.toss();
			
			// Add To Win Counters
			if(flip1.getSideUp().equalsIgnoreCase("heads"))
				heads++; 
			if(flip1.getSideUp().equalsIgnoreCase("tails"))
				tails++;
			
			// Output each iteration 
			System.out.println("Flip "+ i+ ":" + flip1.getSideUp());
		}
		// Output Win Totals 
		System.out.println("\nTotal:\nHeads: " + heads + "\tTails: " + tails);
	}

}

class Coin { 
	
	private String sideUp; 
	
	Random coinToss = new Random();
	
	/**
	 * Constructor Randomly Selects Coin's Side 
	 */
	
	Coin(){ 
		
		toss();
		sideUp = getSideUp();
		
	}
	
	/**
	 * Flips Coin And Assigns sideUp
	 */
	
	public void toss() { 
		
		int randToss; 
		
		randToss = coinToss.nextInt(2)+1;
		
		if(randToss == 1)
			sideUp = "Heads";
		if(randToss == 2)
			sideUp = "Tails";
	}
	
	/**
	 * Returns Current Coin Side 
	 * @return sideUp
	 */
	
	public String getSideUp() { 
		
		return sideUp;
	}
}