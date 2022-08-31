
/*------------------------------------------------------------------------------------
 * MARK: @@@AUTHOR: Blaze Wheeler @ https://github.com/blazeWheeler
 * 
 * Write a program that plays a word game with the user. 
 * The program should ask the user to enter the following:
 *	• His or her name
 *	• His or her age
 *	• The name of a city
 *	• The name of a college 
 *  • A profession
 *	• A type of animal
 *	• A pet’s name
 * After the user has entered these items, the program should display the following story,
 * inserting the user’s input into the appropriate locations:
 * There once was a person named NAME who lived in CITY. At the age of AGE, 
 * NAME went to college at COLLEGE. NAME graduated and went to work as a PROFESSION. 
 * Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived happily ever after!
 * -----------------------------------------------------------------------------------
 */


import java.util.*; 


public class WordGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		String name, age, college, city, profession, animal, petName;
		
		//MARK: Retrieve User Input
		System.out.println("Enter Your Name: ");
		name = in.nextLine(); 
		
		System.out.println("Enter Your Age: ");
		age = in.nextLine();
		
		System.out.println("Enter Your City: ");
		city = in.nextLine(); 
		
		System.out.println("Enter Your College:");
		college = in.nextLine(); 
		
		
		System.out.println("Enter Your Profession");
		profession = in.nextLine(); 
		
		System.out.println("Enter An Animal");
		animal = in.nextLine();
		
		System.out.println("Enter A Pet Name: "); 
		petName = in.nextLine();
		in.close();
		
		//MARK: Print Out Input In Word Game String
		System.out.println("There once was a person named " + 
		 upperCaseFirst(name)+ " who lived in " +  upperCaseFirst(city) + ".\nAt the age of "+ age + ", " + 
		 upperCaseFirst(name) + " went to " + college + ". \n" +  upperCaseFirst(name) + " graduated and went to work as a " + 
		 profession + ". Then, " +  upperCaseFirst(name) + " adopted a(n) " + animal + " named " +  upperCaseFirst(petName) +
		 "  \nThey both lived happily ever after!" );

	}
	//MARK: Method To Capitalize First Letter When Needed 
	public static String upperCaseFirst(String val) {
	      char[] arr = val.toCharArray();
	      arr[0] = Character.toUpperCase(arr[0]);
	      return new String(arr);
	   }

}
