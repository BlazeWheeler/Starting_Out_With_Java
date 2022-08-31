/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 398 Problem 7: TestScores Class
 * 
 * @Description Design a TestScores class that has fields to 
 * hold three test scores. The class should have a constructor,
 * accessor and mutator methods for the test score fields,
 * and a method that returns the average of the test scores. 
 * Demonstrate the class by writing a separate program that 
 * creates an instance of the class. The program should ask 
 * the user to enter three test scores, which are stored in 
 * the TestScores object. Then the program should display the 
 * average of the scores, as reported by the TestScores object.
 */



import java.util.*;

public class TestScoresClass {

	public static void main(String[] args) {
		
		// Scanner 
		Scanner in = new Scanner(System.in);
		
		double testScore1,
			   testScore2,
			   testScore3; 
		
		// Get Input
		System.out.println("Enter Test Score 1: ");
		testScore1 = in.nextDouble();
		
		System.out.println("Enter Test Score 2: ");
		testScore2 = in.nextDouble();
		
		System.out.println("Enter Test Score 3: ");
		testScore3 = in.nextDouble();
		in.close();
		
		// Create Test Score Object
		TestScores testScores1 = new TestScores(testScore1, testScore2, testScore3);
		
		// Output Test Scores
		System.out.println("Average Of Test Scores : " + Math.round(testScores1.average()));
	}
}

class TestScores { 
	
	private double testScore1;
	private double testScore2;
	private double testScore3;
	
	/**
	 * Constructor that takes test Scores As Arguments
	 * @param ts1 Test Score 1
	 * @param ts2 Test Score 2
	 * @param ts3 Test Score 3
	 */
	TestScores(double ts1, double ts2, double ts3){ 
		this.testScore1 = ts1; 
		this.testScore2 = ts2; 
		this.testScore3 = ts3; 
	}
	
	/**
	 * Returns Average Of Test Scores
	 */
	public double average() { 
		
		return (testScore1 + testScore2 + testScore3) / 3;
	}
}