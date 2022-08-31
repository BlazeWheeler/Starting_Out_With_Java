/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 493 Problem 17: Phone Book ArrayList
 * 
 * @Description Write a class named PhoneBookEntry that has fields for a person’s name and phone number. 
 * The class should have a constructor and appropriate accessor and mutator methods.
 * Then write a program that creates at least five PhoneBookEntry objects and stores them in an ArrayList. 
 * Use a loop to display the contents of each object in the ArrayList.
 */


import java.util.*;


public class PhoneBookArrayList {

	public static void main(String[] args) {
		
		// Create Array List And Objects 
		ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
		phoneBook.add(new PhoneBookEntry("Jane", 1234567890 ));
		phoneBook.add(new PhoneBookEntry("David" , 41233356));
		phoneBook.add(new PhoneBookEntry("Jeff" , 41456789));
		phoneBook.add(new PhoneBookEntry("Alexa" , 487384889));
		phoneBook.add(new PhoneBookEntry("Jim" , 487384872));
		
		// Format Output
		System.out.println("Name\tPhone Number");
		System.out.println("--------------------");
		
		// Output Object Elements 
		for(int i = 0; i < phoneBook.size(); i++) { 
			System.out.print(phoneBook.get(i).getName() + ":\t " + phoneBook.get(i).getPhoneNumber());
			System.out.println();
		}
	}
}

class PhoneBookEntry { 
	 
	 private String name; 
	 private int phoneNumber;
	
	PhoneBookEntry(String name, int num){ 
		
		this.name = name; 
		this.phoneNumber = num;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
