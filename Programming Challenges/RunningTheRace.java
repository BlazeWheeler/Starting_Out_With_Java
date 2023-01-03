
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 190 Problem 11: Running the Race
 * 
 * @Description Write a program that asks for the names of three
 * runner and the time, in minutes, it took each of them to finish
 * a race. The program should display the names of the runners in the
 * order that they finished.
 *
 */



import java.util.*;

public class RunningTheRace {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner inDouble = new Scanner(System.in);
		
		double runner1, runner2, runner3;
		String name1, name2, name3;
		
		//MARK: Getting Input
		System.out.println("Enter The Name Of Runner 1: ");
		name1 = in.nextLine();
		System.out.println("Enter " + name1 + "'s Overall Time (In Minuets): ");
		runner1 = inDouble.nextDouble();
		
		System.out.println("Enter The Name Of Runner 2: ");
		name2 = in.nextLine(); 
		
		System.out.println("Enter " + name2 + "'s Overall Time (In Minuets): ");
		runner2 = inDouble.nextDouble();
		
		System.out.println("Enter The Name Of Runner 3: ");
		name3 = in.nextLine();
		System.out.println("Enter " + name3 + "'s Overall Time (In Minuets): ");
		runner3 = inDouble.nextDouble();
		in.close();
		inDouble.close();
		
		//MARK: IF-ELSE Logic
		// else if not used for clarification purpose 
		
		// FINISHED : NAMES 3 2 1
		if(runner1 > runner2 && runner1 > runner3) { 
			if(runner2 > runner3) { 
				System.out.println("First: "  + name3 + "\n" + 
								   "Secound:" + name2 + "\n" +
								   "Last: "   + name1 + "\n" );
			} 
			// FINISHED : NAMES 2 3 1
			else { 
				if(runner3 > runner2) { 
					System.out.println("First: "  + name2 + "\n" + 
							           "Secound:" + name3 + "\n" +
							           "Last: "   + name1 + "\n" );
				}
			}
		} 	
		
		// FINISHED : NAMES 3 1 2
		if(runner2 > runner1 && runner2 > runner3) { 
			if(runner1 > runner3) { 
				System.out.println("First: "  + name3 + "\n" + 
						   		   "Secound:" + name1 + "\n" +
						   		   "Last: "   + name2 + "\n" );
			} 
			// FINISHED : NAMES 1 3 2
			else { 
				if(runner3 > runner1) { 
					System.out.println("First: "  + name1 + "\n" + 
					   		           "Secound:" + name3 + "\n" +
					   		           "Last: "   + name2 + "\n" );
				}
			}
		}
		// FINISHED : NAMES 2 1 3
		if(runner3 > runner1 && runner3 > runner2) { 
			if(runner1 > runner2) { 
				System.out.println("First: "  + name2 + "\n" + 
				   		           "Secound:" + name1 + "\n" +
				   		           "Last: "   + name3 + "\n" );
			}
			// FINISHED : NAMES 1 2 3
			else { 
				if(runner2 > runner1) { 
					System.out.println("First: "  + name1 + "\n" + 
			   		                   "Secound:" + name2 + "\n" +
			   		                   "Last: "   + name3 + "\n" );
				}
			}
		}
	}
}
