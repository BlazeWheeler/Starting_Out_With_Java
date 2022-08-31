
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 493 Problem 18: Trivia Game
 * 
 * @Description In this programming challenge, you will create a simple trivia game for two players. 
 * The program will work like this:
 * Starting with player 1, each player gets a turn at answering 5 trivia questions. 
 * (There are 10 questions, 5 for each player.) When a question is displayed, four possible answers are also displayed.
 * Only one of the answers is correct, and if the player selects the correct answer, he or she earns a point.
 * After answers have been selected for all of the questions, the program displays the number of points earned by each player 
 * and declares the player with the highest number of points the winner.  
 * You are to design a Question class to hold the data for a trivia question. 
 * The Question class should have String fields for the following data:
 * A trivia question
 * Possible answer 1
 * Possible answer 2
 * Possible answer 3
 * Possible answer 4
 * The number of the correct answer (1, 2, 3, or 4)
 * The Question class should have appropriate constructor(s), accessor, and mutator methods.
 * The program should create an array of 10 Question objects, one for each trivia question. 
 * (If you prefer, you can use an ArrayList instead of an array.)
 * Make up your own trivia questions on the subject or subjects of your choice for the objects.
 */

import java.util.*;

public class TriviaGame {

	public static void main(String[] args) {
		
		// Create Scanner 
		Scanner in = new Scanner(System.in);
		
		// Set Play Store Accumulators 
		int p1Score = 0, p2Score = 0, userAns; 
		
		
		ArrayList<Question> questions = new ArrayList<>(); 
		
		// Ten Question Objects
		questions.add(new Question("When Was Charles Darwin Born?", "1859", "1800", 
								   "1810", "1811" , 1));
		questions.add(new Question("When Was Evolution First Proposed?", "1919", "1800", 
				   "1839", "1859", 4));
		questions.add(new Question("When Was The Human Genome Project Completed?", "1999", "1980", 
				   "2003", "2010" , 3));
		questions.add(new Question("What Is The Most Common Element In The human Body?", "Calcium", "Carbon", 
				   "Oxygen", "Hydrogen" , 3));
		questions.add(new Question("Unlike most other fish, sharks have no ______?", "Gills", "Heart", 
				   "Liver", "Bones" , 4));
		questions.add(new Question("What human organ cleans fifty gallons of blood every day?", "Kidneys", "Heart", 
				   "Stomach", "Liver" , 1));
		questions.add(new Question("Which organ do insects NOT have?", "Lungs", "Stomach", 
				   "Heart", "Brain" , 1));
		questions.add(new Question("What living animal has the heaviest brain?", "Human", "Elephant", 
				   "Sperm Whale", "Rhino" , 3));
		questions.add(new Question("Which of the following has more bones?", "Adult", "All Are The Same", 
				   "Baby", "Teenager" , 3));
		questions.add(new Question("What was the first genetically engineered organism?", "Tabacco", "Sheep", 
				   "Rat", "Corn" , 1));
		
		System.out.println("\t\tPlayer 1\n-------------------------------------------");
		
		// Player 1 Q & A
		for(int i = 0; i < 5; i++) { 
			System.out.println("Question " + (i+1) + ": " + questions.get(i).getQuestion());
			System.out.println("1: " + questions.get(i).getPossibleAns1());
			System.out.println("2: " + questions.get(i).getPossibleAns2());
			System.out.println("3: " + questions.get(i).getPossibleAns3());
			System.out.println("4: " + questions.get(i).getPossibleAns4());
			System.out.print("Your Choice: ");
			userAns = in.nextInt(); 
			System.out.println();
			
			if(userAns == questions.get(i).getCorrectAns())
				p1Score++;
		}
		// Player 2 Q & A
		for(int i = 0; i < 5; i++) { 
			System.out.println("Question " + (i+1) + ": " + questions.get(i).getQuestion());
			System.out.println("1: " + questions.get(i).getPossibleAns1());
			System.out.println("2: " + questions.get(i).getPossibleAns2());
			System.out.println("3: " + questions.get(i).getPossibleAns3());
			System.out.println("4: " + questions.get(i).getPossibleAns4());
			System.out.print("Your Choice: ");
			userAns = in.nextInt(); 
			
			if(userAns == questions.get(i).getCorrectAns())
				p2Score++;
		}
		// Close Scanner
		in.close();
		
		// Output Score
		System.out.println("Player 1 Score: " + p1Score);
		System.out.println("Player 2 Score: " + p2Score);
		System.out.println("-------------------------------------------");
		
		// Win Conditions
		if(p1Score > p2Score)
			System.out.println("Player 1 Wins!");
		if(p1Score < p2Score)
			System.out.println("Player 2 Wins!");
		if(p1Score == p2Score)
			System.out.println("Tie!");
	}

}

class Question { 
	
	private String question, possibleAns1, possibleAns2, possibleAns3, possibleAns4;
	int correctAns;
	
	Question(String question, String possibleAns1, String possibleAns2, 
			 String possibleAns3, String possibleAns4, int correctAns) 
	{ 
		this.question = question; 
		this.possibleAns1 = possibleAns1; 
		this.possibleAns2 = possibleAns2; 
		this.possibleAns3 = possibleAns3; 
		this.possibleAns4 = possibleAns4; 
		this.correctAns = correctAns;
	}

	// Getter And Setters
	
	public String getQuestion() {
		return question;
	}

	
	public String getPossibleAns1() {
		return possibleAns1;
	}

	public void setPossibleAns1(String possibleAns1) {
		this.possibleAns1 = possibleAns1;
	}

	public String getPossibleAns2() {
		return possibleAns2;
	}

	public void setPossibleAns2(String possibleAns2) {
		this.possibleAns2 = possibleAns2;
	}

	public String getPossibleAns3() {
		return possibleAns3;
	}

	public void setPossibleAns3(String possibleAns3) {
		this.possibleAns3 = possibleAns3;
	}

	public String getPossibleAns4() {
		return possibleAns4;
	}

	public void setPossibleAns4(String possibleAns4) {
		this.possibleAns4 = possibleAns4;
	}

	public int getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(int correctAns) {
		this.correctAns = correctAns;
	}
	
}

