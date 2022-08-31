/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 313 Problem 7: Test Average and Grade
 * 
 * @Description Write a program that asks the user to enter five test 
 * scores. The program should display a letter grade for each score and 
 * the average test score. Write the following methods in the program:
 * calcAverage—This method should accept five test scores as arguments 
 * and return the average of the scores.
 * determineGrade—This method should accept a test score as an argument
 * and return a letter grade for the score, based on the 
 * following grading scale:
 * 		Score        Letter Grade
 * 		-------------------------
 * 		90–100       A
 * 		80–89        B
 * 		70–79        C
 *	    60–69        D    
 * 		Below 60     F
 */

import java.util.*;
import java.text.*;

public class TestAverageAndGrade {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		DecimalFormat percent = new DecimalFormat("#0.00'%'");
		
		double grade1 = 0,
			   grade2 = 0, 
			   grade3 = 0, 
			   grade4 = 0,
			   grade5 = 0,
			   average;
		
		// Get Input 
		for(int i = 1; i < 6; i++) { 
			System.out.println("Enter Grade " + i + ": ");
			if(i == 1)
				grade1 = in.nextInt();
			if(i == 2)
				grade2 = in.nextInt(); 
			if(i == 3)
				grade3 = in.nextInt(); 
			if(i == 4) 
				grade4 = in.nextInt();
			if(i == 5)
				grade5 = in.nextInt();
		}
		in.close();
		
		// Create Array Of All Input Scores
		double grades[] = {grade1, grade2, grade3, grade4, grade5};
		
		//Pass Array To Method And Call
		average = calcAverage(grades);
		
		//Format Table
		System.out.println("Grade \tLetter Grade\t" );
		System.out.println("______________________");
		
		//Output Data To Table
		for(int j = 0; j < grades.length; j++) { 
			System.out.print(j + 1);
			System.out.print("\t" + determineGrade(grades[j])  + "\n");
		}
		
		//Continued Formatting And Outputting  Data
		System.out.println("______________________");
		System.out.println("Average Score: " + percent.format(average));
	}

	/*
	 * Calculates Average Of User Inputed Grades
	 * @param g Array Of All User Inputed Grades 
	 * @return average Average Of All Grades
	 */
	public static double calcAverage(double g[]) { 
		double average = 0;
		
		//Add All Values In Array
		for(int i = 0; i < g.length; i++)  
			average += g[i];
		
		average = average/g.length;
		
		return average;
	}
	/*
	 * Calculates Letter Grade Based On Grading Scale
	 * @param grade individual user inputed score
	 * @return score returns letter grade as a char value
	 */
	public static char determineGrade(double grade) { 
		//Char Place Holder '*'
		char score = '*';
		
		if(grade >= 90)
			score = 'A';
		if(grade >= 80 && grade < 90)
			score = 'B';
		if(grade >= 70 && grade < 80)
			score = 'C';
		if(grade >= 60 && grade < 70)
			score = 'D';
		if(grade < 60)
			score = 'F';
		return score;
			
	}
}
