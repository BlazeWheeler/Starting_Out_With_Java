/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 402 Problem 17: Tossing Coins For A Dollar
 * 
 * @Description For this assignment you will create a game program 
 * using the Coin class from Programming Challenge 16. The program 
 * should have three instances of the Coin class: one representing
 * a quarter, one representing a dime, and one representing a nickel.
 * When the game begins, your starting balance is $0. During each
 * round of the game, the program will toss the simulated coins. 
 * When a coin is tossed, the value of the coin is added to your 
 * balance if it lands heads-up. For example, if the quarter lands 
 * heads-up, 25 cents is added to your balance. Nothing is added 
 * to your balance for coins that land tails-up. The game is over 
 * when your balance reaches one dollar or more. 
 * If your balance is exactly one dollar, you win the game. 
 * You lose if your balance exceeds one dollar.
 * 
 */


import java.util.Random;
import java.text.DecimalFormat;

public class TossingCoinsForADollar {

	public static void main(String[] args) {
		
		// Decimal Format
		DecimalFormat usd = new DecimalFormat("$ #.00");
		
		// Counters
		double total = 0.0;
		int round = 0;
		
		// Create Coin Instances 
		CoinSimulator quater = new CoinSimulator();
		CoinSimulator dime = new CoinSimulator(); 
		CoinSimulator nickel = new CoinSimulator();
		
		// Format Output 
		System.out.println("Round\tQuarter\t Nickel\t Dime\t Total");
		System.out.println("---------------------------------------------");
		
		// Toss Coins And Game Calculations
		do { 
			quater.toss();
			dime.toss();
			nickel.toss();
			round++;
			System.out.print(round + "\t");
			
			if(quater.getSideUp().equalsIgnoreCase("heads"))
				total += .25;
			
			if(dime.getSideUp().equalsIgnoreCase("heads"))
				total += .10;
			if(nickel.getSideUp().equalsIgnoreCase("heads"))
				total += .05;
			System.out.println(quater.getSideUp() + "\t " + nickel.getSideUp() 
												  + "\t "  + dime.getSideUp() 
												  + "\t "  + usd.format(total));
		}while(total < 1.00);
		
		// Format Output
		System.out.println("---------------------------------------------");
		
		// Game Win Conditions
		if(total == 1.00)
			System.out.println("Total: " + usd.format(total) + " You Won!");
		else
			System.out.println("Total: " + usd.format(total) + " You Lost!");
	}
}

class CoinSimulator { 
	
	private String sideUp; 
	
	Random coinToss = new Random();
	
	/**
	 * Constructor Randomly Selects Coin's Side 
	 */
	
	CoinSimulator(){ 
		
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