/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 491 Problem 10: Lottery Application
 * 
 * @Description Write a Lottery class that simulates a lottery. The class should have an array of five integers named lotteryNumbers. 
 * The constructor should use the Random class (from the Java API) to generate a random number in the range of 0 through 9 for each element in the array. 
 * The class should also have a method that accepts an array of five integers that represent a per- son’s lottery picks. 
 * The method is to compare the corresponding elements in the two arrays and return the number of digits that match. 
 * For example, the following shows the lotteryNumbers array and the user’s array with sample numbers stored in each.
 * here are two matching digits (elements 2 and 4).
 * lotteryNumbers array:
 * [7,4,9,1,3]
 * User’s array:
 * [4,2,9,7,3]
 * In addition, the class should have a method that returns a copy of the lotteryNumbers array.
 * Demonstrate the class in a program that asks the user to enter five numbers. 
 * The program should display the number of digits that match the randomly generated lottery numbers. 
 * If all of the digits match, display a message proclaiming the user a grand prize winner.
 * 
 */

import java.util.*;

public class LotteryApplication {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int userPicks[] = new int[5];
		
		// Get User's Lottery Picks
		for(int i = 0; i < 5; i++) { 
			System.out.println("Enter Pick " + (i + 1) + " (0-9):");
			userPicks[i] = in.nextInt();
		}
		
		in.close();
		// Create Lottery Object
		Lottery lotteryObj1 = new Lottery(userPicks);
		
		System.out.print("Lottery Numbers: ");
		
		// Displays Random Generated Lottery Numbers
		for(int i = 0; i < lotteryObj1.getLotterNumbers().length; i++)
			System.out.print(lotteryObj1.getLotterNumbers()[i] + " ");
		
		System.out.println("\n");
		System.out.println("You Had " + lotteryObj1.compareUserPicks() + " match(s)");
		System.out.println();
		
		// Output The Value Of Matched Numbers
		if(lotteryObj1.compareUserPicks() > 0) { 
			System.out.print("Your Matches: ");
			 lotteryObj1.outputMatchingPicks();
			 // Win Conditions
			 if(lotteryObj1.compareUserPicks() == 5)
				 System.out.println("Congrats! You Are The Grand Winner");
		}
	}
}


class Lottery { 
	
	private int lotteryNumber[] = new int[5];
	private int userPicks[] = new int[5];
	Random rand = new Random();
	
	/**
	 * Passes User Picks To Array
	 * Generates Array Of Random Ints For Lottery
	 * @param arr Array Of Users Picks For Lottery
	 */
	
	Lottery(int arr[]) { 
		
		this.userPicks = arr; 
		
		for(int i = 0; i < lotteryNumber.length; i++) { 
			lotteryNumber[i] = rand.nextInt(9);
		}
	}
	
	/**
	 * Compares User Picks To Lottery Picks 
	 * @return matches Returns Number Of User Picks Match Lottery Numbers 
	 */
	public int compareUserPicks() { 
		
		int matches = 0; 
		
		for(int i = 0; i < userPicks.length; i++) { 
			for(int j = 0; j < userPicks.length; j++) { 
				
				if(userPicks[j] == lotteryNumber[i])
					matches++;
			}
		}
		return matches;
	}
	
	/**
	 * Copies Random Generated Lottery Numbers To A New Array
	 * @return copyLotteryNumber Returns A Copy Of Lottery Numbers
	 */
	
	public int[] getLotterNumbers() { 
		 
		 int copyLotteryNumber[] = new int[5];
		
		for(int i = 0; i < lotteryNumber.length; i++) { 
			copyLotteryNumber[i] = lotteryNumber[i];
		}
		return  copyLotteryNumber;
	}
	
	
	/**
	 * Outputs The User Picks That Match Lottery Numbers
	 */
	
	public void outputMatchingPicks() { 
		
		for(int i = 0; i < userPicks.length; i++) { 
			
			for(int j = 0; j< userPicks.length; j++) { 
				if(userPicks[j] == lotteryNumber[i])
					System.out.print(userPicks[j] + " ");
			}
		}
	}
}
