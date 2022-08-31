/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 317 Problem 17: Rock, Paper, Scissors Game
 * 
 * @Description Write a program that lets the user play the game of Rock,
 * Paper, Scissors against the computer. The program should work as 
 * follows. 
 * 1. When the program begins, a random number in the range of 
 * 1 through 3 is generated. If the number is 1, then the computer has
 * chosen rock. If the number is 2, then the computer has chosen paper.
 * If the number is 3, then the computer has chosen scissors. 
 * (Don’t display the computer’s choice yet.)
 * 2. The user enters his or her choice of “rock”, “paper”, or 
 * “scissors” at the keyboard. (You can use a menu if you prefer.)
 * 3. The computer’s choice is displayed.
 * 4. A winner is selected according to the following rules:
 * If one player chooses rock and the other player chooses scissors, 
 * then rock wins. (The rock smashes the scissors.)
 * If one player chooses scissors and the other player chooses paper, 
 * then scissors wins. (Scissors cuts paper.)
 * If one player chooses paper and the other player chooses rock, 
 * then paper wins. (Paper wraps rock.)
 * If both players make the same choice, the game must be played 
 * again to determine the winner.
 * Be sure to divide the program into methods that perform each major task.
 */


import java.util.*;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		Random rand = new Random();
		
		String userChoice;
		boolean winCondition;
		int user = 0, 
			computer; 
		
		System.out.println("Choose Rock, Paper, Or Scissors");
		userChoice = in.nextLine().toLowerCase();
		
		// Generate Random Num For Computer Choice
		computer = rand.nextInt(3) + 1;
		
		// Assigns User String Input To Int
		user = stringToInt(userChoice);
		
		// If There Is A Tie
		while(user == computer) { 
			
			System.out.println(userChoice + " Ties " + userChoice );
			System.out.println("---------------------------------");
			userChoice = in.nextLine().toLowerCase();
			// Assigns New User String Input To Int
			user = stringToInt(userChoice);	
			// Generate New  Random Num For Computer Choice
			computer = rand.nextInt(3) + 1;
		}
		in.close();
		// Calculates if User Wins The Game
		winCondition = win(userChoice, computer);
		// Prints Output Of Win WOnditons 
		printOutput(winCondition,computer, userChoice );
				
	}
	
	/*
	 * Converts String -> Integer Following Instructions Of Prompt
	 * @param uc User Choice
	 * @return user returns Integer Equivalent 
	 */
	
	public static int stringToInt(String uc) { 
		int user = 0;
		if(uc.equalsIgnoreCase("rock"))
			user = 1;
		if(uc.equalsIgnoreCase("paper"))
			user = 2;
		if(uc.equalsIgnoreCase("scissors"))
			user = 3;
		return user;
		
	}
	
	/*
	 * Converts Number -> String Following Instructions Of Prompt
	 * @param cc Computer Choice
	 * @return computer returns String Equivalent 
	 */
	
	public static String intToString(int cc) { 
		String computer = " ";
		switch(cc) { 
		case 1: computer = "rock"; break;
		case 2: computer = "paper"; break;
		case 3: computer = "scissors"; break;
			
		}	
		return computer;
	}
	
	/*
	 * Calculates Win Or Loss In Rock Paper Scissors 
	 * @param cc Computer Choice 
	 * @param uc User Choice 
	 * @return userWin Returns True If User Won False If User Lost
	 */
	
	public static boolean win(String uc, int cc) { 
		boolean userWin = false;
		
		switch(uc) { 
			
		case "rock": 
			if(cc == 1) userWin = false;
			if(cc == 2) userWin = false;
			if(cc == 3) userWin = true;
		break;
			
		case "paper": 
			if(cc == 1) userWin = true;
			if(cc == 2) userWin = false;
			if(cc == 3) userWin = false;
		break;
			
		case "scissors": 
			if(cc == 1) userWin = false;
			if(cc == 2) userWin = true;
			if(cc == 3) userWin = false;
		break;
		
		}
		return userWin;
	}
	
	/*
	 * Prints Output / Explains Win 
	 * @param w Value That Determines If User Won
	 * @param cc Computer Choice 
	 * @param uc User Choice 
	 */
	
	public static void printOutput(boolean w, int cc, String uc) { 
		String output = " ";
		
		output = intToString(cc);
		
		if(w == true)  
			System.out.println("You Win: " + uc + " Beats " + output );
		
		if(w == false)  
			System.out.println("You Lost: " + output + " Beats " + uc);
	}
}
