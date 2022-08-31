/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 267 Problem 22: Slot Machine Simulation
 * 
 * @Description A slot machine is a gambling device that the user 
 * inserts money into and then pulls a lever (or presses a button). 
 * The slot machine then displays a set of random images. If two or 
 * more of the images match, the user wins an amount of money that 
 * the slot machine dispenses back to the user.
 * Create a program that simulates a slot machine. When the program 
 * runs, it should do the following:
 * Asks the user to enter the amount of money he or she wants to 
 * enter into the slot machine.
 * Instead of displaying images, the program will randomly select a word 
 * from the following list: 
 * Cherries, Oranges, Plums, Bells, Melons, Bars
 * To select a word, the program can generate a random number in the 
 * range of 0 through 5. If the number is 0, the selected word is 
 * Cherries; if the number is 1, the selected word is Oranges; 
 * and so forth. The program should randomly select a word from this 
 * list three times and display all three of the words.
 * If none of the randomly selected words match, the program will 
 * inform the user that he or she has won $0. If two of the words 
 * match, the program will inform the user that he or she has won two 
 * times the amount entered. If three of the words match, the program
 * will inform the user that he or she has won three times the amount 
 * entered.
 * The program will ask whether the user wants to play again. 
 * If so, these steps are repeated. If not, the program displays 
 * the total amount of money entered into the slot machine and 
 * the total amount won.
 */


import java.util.*;
import java.text.*;

public class SlotMachineSimulation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		
		Random rand = new Random();
		String playAgain = "y";
		int num1, num2, num3;
		num1 = 0; 
		num2 = 0; 
		num3 = 0;
		double moneySpent;
		
		// Input Validation
		do {
			System.out.println("Enter The Amount Of $ You Would Like To Spend: ");
			moneySpent = in.nextDouble(); 
			
			for(int i = 0; i < 1; i ++) { 
				
				num1 = rand.nextInt(5) +1 ; 
				num2 = rand.nextInt(5)+ 1; 
				num3 = rand.nextInt(5 + 1);
				printOut(num1);
				printOut(num2);
				printOut(num3);
				compare(num1,num2,num3,moneySpent);
				
			}
			
			System.out.println("Do You Want To Play Again (Y/N) : ");
			playAgain = text.nextLine();
		 
		}while(playAgain.equalsIgnoreCase("y"));
		in.close();
		text.close();
	}
	
	/*
	 * Prints Out Fruit Depending on Random Generated Number
	 * @param num: Random Generated Number
	 */
		public static void printOut(int num) { 
			
			switch(num) { 
			case 0: 
				System.out.println("Cherries");
			break;
			
			case 1: 
				System.out.println("Oranges");
			break;
			
			case 2: 
				System.out.println("Plums");
			break;
			
			case 3: 
				System.out.println("Bells");
			break;
			
			case 4: 
				System.out.println("Melons");
			break;
			
			case 5: 
				System.out.println("Bars");
			break;
		}
	}	
		
		/*
		 * Determines And Prints Winning Conditions
		 * @param n1 : First Random Generated Number
		 * @param n2 : Second Random Generated Number
		 * @param n3 : Third Random Generated Number
		 * @param n4 : Money Spent User Input
		 */
		
	public static void compare(int n1, int n2, int n3, double n4) { 
		
		// United States Dollar Text Formatting
		DecimalFormat usd = new DecimalFormat("$ ###,###.##");
		double counter = 0;
		
		// Win conditions
		if(n1 == n2 ) 
			counter = n4 *2;
		if(n2 == n3) 
			counter = n4* 2;
		if(n1 == n3)  
			counter = n4 * 2;
		if(n1 == n2 && n1 == n3) 
			counter = n4 *3;

		System.out.println("You Won:");
		
		System.out.println(usd.format(counter));
	}
}
