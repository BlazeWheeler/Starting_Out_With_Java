
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 494 Problem 16: Lo shu Magic square
 * 
 * @Description The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown in Figure 7-31. 
 * The Lo Shu Magic Square has the following properties:
 * The grid contains the numbers 1 through 9 exactly.
 * The sum of each row, each column, and each diagonal all add up to the same number.
 * This is shown in Figure 7-32. 
 * In a program you can simulate a magic square using a two-dimensional array.
 * Write a method that accepts a two-dimensional array as an argument,
 * and determines whether the array is a Lo Shu Magic Square. 
 * Test the function in a program.
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Magic8Ball {

	public static void main(String[] args ) throws IOException {
		
		File eightBall = new File("8_ball_responses.txt");
		Scanner in = new Scanner(System.in);
		Scanner fileIn = new Scanner(eightBall);
		Random randResponse = new Random();
		int  userChoice = 0;
		
		ArrayList<String> responses = new ArrayList<>();
		
		// Pass Data To ArrayList
		while(fileIn.hasNext())  
			responses.add(fileIn.nextLine());
		
		// Close Scanners
		in.close();
		fileIn.close();

		System.out.println("Magic 8 Ball\n");
		
		// Create Loop With Sentinel Value
		while(userChoice != -99) { 
			System.out.print("Enter 1 To Shake | Enter -99 To Exit: ");
			userChoice = in.nextInt();
			// Exit Program Gracefully
			if(userChoice == -99)
				System.exit(0);
			System.out.println(responses.get(randResponse.nextInt(responses.size())));
		}
	}
}
