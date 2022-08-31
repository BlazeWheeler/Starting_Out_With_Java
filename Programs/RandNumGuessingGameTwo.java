import java.util.Random;
import java.util.Scanner;

public class RandNumGuessingGameTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input, randomNum, counter; 
		
		counter = 0;
		
		System.out.println("Guess The Random Number: ");
		input = in.nextInt();
		counter++;
		
		//Create Random Number Objects
		Random rand = new Random();
		
		//Generates Random Number 1 - 10
		randomNum = rand.nextInt(10) + 1; 
		
		// Loop To Check If Guess Is Correct
		while(input != randomNum) { 
			
			if(input < randomNum) { 
				System.out.println("Too Low, Try Again: ");
				input = in.nextInt();
				counter++;
			}
			if(input > randomNum) { 
				System.out.println("Too High, Try Again: ");
				input = in.nextInt();
				counter++;
			}	
		}
		in.close();
		
		//Output
		System.out.println("Correct! The Number Was " + randomNum);
		System.out.println("You Guessed " + counter + " Times");
	}

}
