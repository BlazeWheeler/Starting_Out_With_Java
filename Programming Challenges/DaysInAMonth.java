/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 399 Problem 9: Days In A Month
 * 
 * @Description Write a class named MonthDays. The class’s 
 * constructor should accept two arguments:
 * An integer for the month (1 5 January, 2 February, etc.).
 * An integer for the year
 * The class should have a method named getNumberOfDays that 
 * returns the number of days in the specified month. 
 * The method should use the following criteria 
 * to identify leap years:
 * Determine whether the year is divisible by 100. If it is, 
 * then it is a leap year if and if only it is divisible by 400.
 * For example, 2000 is a leap year but 2100 is not.
 * If the year is not divisible by 100, then it is a leap year 
 * if and if only it is divisible by 4. For example, 2008 is a 
 * leap year but 2009 is not.
 * Demonstrate the class in a program that asks the user to 
 * enter the month (letting the user enter an integer in the 
 * range of 1 through 12) and the year. The program should 
 * then display the number of days in that month. 
 * Here is a sample run of the program:
 * -------------------------------------
 * Enter a month (1-12): 2 [enter]
 * Enter a year: 2008 [enter]
 * -------------------------------------
 * 29 days
 */

import java.util.*;
public class DaysInAMonth {

	public static void main(String[] args) {
		
		// Scanner
		Scanner in = new Scanner(System.in);
		int currMonth;
		int currYear; 
		
		System.out.println("Enter A Month (1-12): ");
		currMonth = in.nextInt(); 
		
		System.out.println("Enter Year: ");
		currYear = in.nextInt();
		in.close();
		
		// Create Instance Of Object
		MonthDays date1 = new MonthDays(currMonth, currYear);
		
		// Output Data
		System.out.println(date1.getNumOfDays());
	}
}

class MonthDays { 
	
	//Fields
	private int month;
	private int year;
	
	/**
	 * Constructor Accepts Two Arguments For Months And Years
	 * @param m months
	 * @param y years 
	 */
	MonthDays(int m, int y) { 
		this.month = m;
		this.year = y; 
	}

	/**
	 * 
	 * @return month returns month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 
	 * @param m Returns Int Value For Month
	 */
	public void setMonth(int m) {
		this.month = m;
	}

	/**
	 * 
	 * @return year Returns Year 
	 */
	public int getYear() {
		return year;
	}

	/**
	 * 
	 * @param y Year 
	 */
	public void setYear(int y) {
		this.year = y;
	}
	
	/**
	 * Calculates Number Of Days In A Month Including Leap Years
	 * @return numOfDays Returns Number Of Days In A Month
	 */
	public int getNumOfDays() { 
		
		int currYear = year;
		int currMonth = month;
		int numOfDays = 0;
		
		switch(currMonth) { 
		// January 
		case 1 : 
			numOfDays = 31;
			break;
		// February 
		case 2: 
			
			// Leap Year 
			if(currYear % 100 == 0 && currYear % 400 == 0)  
				numOfDays = 29;
			//Leap Year
			else if(currYear % 100 != 0 && currYear % 4 == 0) 
				numOfDays = 29;
			// Else Not  Leap Year 
			else
				numOfDays = 28;
			break;
		// March	
		case 3 : 
			numOfDays = 31;
			break;
		// April
		case 4 : 
			numOfDays = 30;
			break;
		// May
		case 5 : 
			numOfDays = 31;
			break;
		// June
		case 6 : 
			numOfDays = 30;
			break;
		// July
		case 7 : 
			numOfDays = 31;
			break;
		// August 
		case 8 : 
			numOfDays = 31;
			break;
		// September
		case 9 : 
			numOfDays = 30;
			break;
		// October
		case 10 : 
			numOfDays = 31;
			break;
		// November
		case 11 : 
			numOfDays = 30;
			break;
		// December
		case 12 : 
			numOfDays = 31;
			break;
		}
		return numOfDays;
	}
}