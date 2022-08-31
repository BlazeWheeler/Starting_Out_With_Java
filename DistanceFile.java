

/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 263 Problem 3: Distance File
 * 
 * @Description Modify the program you wrote for Programming Challenge 2 
 * (Distance Traveled) so it writes the report to a file instead of the
 * screen. Open the file in Notepad or another text editor to confirm
 * the output.
 */

import java.util.Scanner;
import java.io.*;
public class DistanceFile {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in); 
		PrintWriter outputFile = new PrintWriter("DistanceTrav.txt");
		
		int speed, numOfHours; 
		
		System.out.println("Enter Speed Of Vehicle (In MPH): ");
		speed = in.nextInt();
		
		System.out.println("Enter Time Traveled (In Hours): ");
		numOfHours= in.nextInt();
		
		//Input Validation Speed 
		if(speed <= 0) { 
			do { 
				System.out.println("Enter A Postive Number For Speed:");
				speed = in.nextInt();
			}while(speed <= 0);
		}
		
		//Input Validation Hours
		if(numOfHours < 1) { 
			do { 
				System.out.println("Enter A Postive Number For " + 
								   "Hours: ");
				speed = in.nextInt();
			}while(numOfHours < 1);
		}
		in.close();
		
		// Formatting Title Output
		outputFile.println("Hour \t Distance Traveled");
		outputFile.println("--------------------------");
		
		// Loop For Calculations 
		for(int i = 1; i < numOfHours + 1; i++) { 
			outputFile.println(i + "\t\t" + speed * i);
		}
		//Close File
		outputFile.close();
	}
}

