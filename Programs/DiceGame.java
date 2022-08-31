/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 267 Problem 21: Dice Game
 * 
 * @Description Write a program that plays a simple dice game between
 * the computer and the user. When the program runs, a loop should 
 * repeat 10 times. Each iteration of the loop should do the 
 * following:
 * Generate a random integer in the range of 1 through 6. This is 
 * the value of the computer’s die. Generate another random integer 
 * in the range of 1 through 6. This is the value of the user’s die.
 * The die with the highest value wins. (In case of a tie, there is no
 * winner for that particular roll of the dice.)
 * As the loop iterates, the program should keep count of the number 
 * of times the computer wins, and the number of times that the user 
 * wins. After the loop performs all of its iterations, the program 
 * should display who was the grand winner, the computer or the user.
 */

import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		int compNum,userNum,tieNum,compScore,userScore; 
		
		//Set Accumulators 
		compScore = 0; 
		userScore = 0;
		tieNum = 0;
	
		System.out.println("------------------------------");
		System.out.println("\tDICE GAME");
		System.out.println("------------------------------");
		
		for(int i = 0; i < 10; i++) { 
			compNum = rand.nextInt(6)+1; 
			userNum = rand.nextInt(6)+1; 
			
			if(compNum > userNum)
				compScore++; 
			if(compNum < userNum)
				userScore++; 
			if(compNum == userNum)
				tieNum++;
		}
		
	System.out.println("\tCOMPUTER WINS: " + compScore + "\n" + 
					   "\tUser Wins: " + userScore);
	System.out.println("\tNumber Of Draws: " + tieNum);
	System.out.println("------------------------------");

	if(compScore > userScore)
	System.out.println("Computer Is The Grand Winner");
	if(compScore < userScore)
		System.out.println("User Is The Grand Winner");
	if(compScore == userScore)
		System.out.println("It's A Draw");
	}

}
