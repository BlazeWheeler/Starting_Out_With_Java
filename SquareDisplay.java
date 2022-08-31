/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 266 Problem 20: Bank Charges
 * 
 * @Description Write a program that asks the user for a positive 
 * integer no greater than 15. The program should then display a 
 * square on the screen using the character ‘X’. The number entered 
 * by the user will be the length of each side of the square. 
 * For example, if the user enters 5, the program should display 
 * the following:
 * XXXXX
 * XXXXX 
 * XXXXX
 * XXXXX 
 * XXXXX
 *
 */

import java.util.*;
public class SquareDisplay {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		int input; 
		
		System.out.println("Enter A Number No Greater Than 15: ");
		input = in.nextInt(); 
		
		//Input Validation 
		while(input > 15) { 
			System.out.println("Enter A Number No Greater Than 15: ");
			input = in.nextInt(); 
		}
		in.close();
		
		//Output Loop
		for(int i = 0; i < input ; i++) { 
			System.out.println("X");
			for(int j = 0; j < input ; j++) { 
				System.out.print("X");
			}
		}
		System.out.print("X");
	}

}
