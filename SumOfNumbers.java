/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 262 Problem 1: Sum Of Numbers
 * 
 * @Description Write a program that asks the user for a positive 
 * nonzero integer value. The program should use a loop to get 
 * the sum of all the integers from 1 up to the number entered. 
 * For example, if the user enters 50, 
 * the loop will find the sum of 1, 2, 3, 4, . . . 50.
 */

import java.util.*;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		int sum = 0;
		
		//Get Input
		System.out.println("Enter A Postive Nonzero Integer: ");
		num = in.nextInt();
		in.close();
		

		while(num >= 1){
			sum += num;
			num--;
		}
		System.out.println(sum);
	}

}
