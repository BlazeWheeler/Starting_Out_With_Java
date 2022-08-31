/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 266 Problem 8: ESP Game
 * 
 * @Description Write a program that tests your ESP (extrasensory perception). 
 * The program should randomly select the name of a color from the
 * following list of words: Red, Green, Blue, Orange, Yellow
 * To select a word, the program can generate a random number. 
 * For example, if the number is 0, the selected word is Red, 
 * if the number is 1, the selected word is Green, and so forth. 
 * Next, the program should ask the user to enter the color that 
 * the computer has selected. After the user has entered his or 
 * her guess, the program should display the name of the randomly 
 * selected color. The program should repeat this 10 times and then 
 * display the number of times the user correctly guessed the 
 * selected color.
 *     
 * 
 */

import java.util.*;

public class EspGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Random Number, Number Of Guesses Counter, Correct Guess Counter
		int randNum, counter, correct;
		
		// Set Accumulators 
		counter = 0;
		correct = 0;
		
		String guess;
		
		String colors[] = {"Red", "Green", "Blue", "Orange", "Yellow"};
		
		// Creates Random Number 
		Random rand = new Random(); 
		randNum = rand.nextInt(5);
		counter++;
		
		do { 
			
			System.out.println("Enter Random Color: ");
			guess = in.nextLine(); 
			
			System.out.println("The Correct Color is " +
			colors[randNum].toString());
			counter++;
			
			// Random Number at Index In Array Comparison
			if(guess.equalsIgnoreCase(colors[randNum])) { 
				correct++;
			}
			
			//Changes Random Generated Color
			while(counter <= 9) { 
				randNum = rand.nextInt(5);
				break;
			}
		
		}while(counter <= 9);
		
		in.close();
		//Output
		System.out.println("_______________________________");
		System.out.println("\nYou Guessed Correct " + correct + " Time(s)");
		
	}

}
