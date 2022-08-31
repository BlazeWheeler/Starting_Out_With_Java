/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 185 Problem 6: Time Calculator
 * 
 * @Description There are 60 seconds in a minute. 
 * If the number of seconds entered by the user is greater 
 * than or equal to 60, the program should display the number of minutes 
 * in that many seconds.There are 3,600 seconds in an hour. 
 * If the number of seconds entered by the user is greater 
 * than or equal to 3,600, the program should display the number 
 * of hours in that many seconds. There are 86,400 seconds in a day. 
 * If the number of seconds entered by the user is greater 
 * than or equal to 86,400, the program should display the number of 
 * days in that many seconds.
 */


import java.util.*;

public class TimeCalculator {

	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		int seconds, numOfMin, numOfHours, numOfDays; 
		
		//Get Input
		System.out.println("Enter A Number Of Seconds: ");
		seconds = in.nextInt();
		in.close();
		 
		// Calculations
		numOfMin = seconds/60; 
		numOfHours = seconds/3600; 
		numOfDays = seconds/86400;
		
		// IF-Else-Logic/Output
		if(seconds >= 60 && seconds < 3600) 
			System.out.println(numOfMin + " Minute(s)");
		
		if(seconds >= 3600 && seconds < 86000)
			System.out.println(numOfHours + " Hour(s)");
		
		if(seconds > 86000)
			System.out.println(numOfDays + " Day(s)");
		
		
	}

}
