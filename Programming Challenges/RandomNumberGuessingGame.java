
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 266 Problem 17: Random Number Guessing Game
 * 
 * @Description Enhance the program that you wrote for Programming 
 * Challenge 17 so it keeps a count of the number of guesses that 
 * the user makes. When the user correctly guesses the random
 * number, the program should display the number of guesses.
 * 
 */


import java.util.*;


public class RandomNumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input, randomNum; 
		
		System.out.println("Guess The Random Number: ");
		input = in.nextInt();
		
		//Create Random Number Objects
		Random rand = new Random();
		
		//Generates Random Number 1 - 10
		randomNum = rand.nextInt(10); 
		
		// Loop To Check If Guess Is Correct
		while(input != randomNum) { 
			
			if(input < randomNum) { 
				System.out.println("Too Low, Try Again: ");
				input = in.nextInt();
			}
			if(input > randomNum) { 
				System.out.println("Too High, Try Again: ");
				input = in.nextInt();
			}	
		}
		in.close();
		
		//Output
		System.out.println("Correct! The Number Was " + randomNum);
	}

}
