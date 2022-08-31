/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 489 Problem 6: Driver's License Exam 
 * 
 * @Description The local Driver’s License Office has asked you to write a program
 * that grades the written portion of the driver’s license exam. 
 * The exam has 20 multiple choice questions. Here are the correct answers:
 * 1. B 2. D 3. A 4. A 5. C
 * 11. B 12. C 13. D 14. A 15. D
 * 16. C 17. C 18. B 19. D 20. A
 * A student must correctly answer 15 of the 20 questions to pass the exam
 * Write a class named DriverExam that holds the correct answers to the exam in an array field
 * The class should also have an array field that holds the student’s answers. 
 * The class should have the following methods:
 * passed. Returns true if the student passed the exam, or false if the student failed
 * totalCorrect. Returns the total number of correctly answered questions
 * totalIncorrect. Returns the total number of incorrectly answered questions
 * questionsMissed. An int array containing the question numbers of the questions that the student missed
 * Demonstrate the class in a complete program that asks the user to enter a student’s answers,
 * and then displays the results returned from the DriverExam class’s methods.
 * Input Validation: Only accept the letters A, B, C, or D as answers.
 */

import java.util.*;

public class DriversLicenseExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char studentArr[] = new char[20];
		char studentAns; 
		
		// Get Input
		for(int i = 0; i < 20; i++) { 
			System.out.println("Enter Answer " + (i + 1));
			studentAns = in.next().charAt(0);
			// Work Around Case Sensitivity 
			studentAns = Character.toUpperCase(studentAns);
			
			// Input Validation A - D
			while(Character.toString(studentAns).matches("^[A-D]*$") == false) { 
				System.out.println("Enter Answer A - D: ");
				studentAns = in.next().charAt(0);
				// Work Around Case Sensitivity
				studentAns = Character.toUpperCase(studentAns);
			}
			studentArr[i] = studentAns ;
		}
		in.close();
		
		// Create Object
		DriverExam student1 = new DriverExam(studentArr);
		
		// Check Total Correct
		student1.totalCorrect();
		// Output
		System.out.println("Total Correct: " + student1.getTotalCorrect());
		
		// Output Test Conditions 
		if(student1.passed() == true)
			System.out.println("PASSED");
		if(student1.passed() == false)
			System.out.println("Failed");
	}
}

class DriverExam { 
	
	private char answers[] = {'B','D','A','A','C','A','B','A','C','D',
							  'B','C','D','A','D','C','C','B','D','A'};
	private char studentAnswers[];
	
	private int totalCorrect = 0;
	private boolean pass = false;
	
	DriverExam(char studentArr[]){ 
		
		this.studentAnswers = studentArr;
	}
	
	/**
	 * Calculates If Student Passed Or Not
	 * @return pass
	 */
	
	public boolean passed() { 
		
		if(totalCorrect / 20 >= 0.75)
			pass = true;
		return pass;
	}
	
	/**
	 * Calculates Total Correct
	 */
	
	public void totalCorrect() { 
		
		for(int i = 0; i < studentAnswers.length; i++ ) { 
			if(studentAnswers[i] == answers[i])
				totalCorrect ++;
		}
	}
	
	// Getter
	public int getTotalCorrect() { 
		return totalCorrect;
	}
}
