/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 492 Problem 13: Array Operations
 * 
 * @Description If you have downloaded this book’s source code 
 * (the companion Web site is available at www.pearsonhighered.com/gaddis),
 * you will find the following files in the Chap- ter 07 folder:
 * GirlNames.txt – This file contains a list of the 200 most popular names given to girls
 * born in the United States for the years 2000 through 2009.
 * BoyNames.txt – This file contains a list of the 200 most popular names given to boys born in the 
 * United States for the years 2000 through 2009.
 * Write a program that reads the contents of the two files into two separate arrays,
 * or ArrayLists. The user should be able to enter a boy’s name, a girl’s name, or both,
 * and the application will display messages indicating whether the names were among 
 * the most popular.
 */


import java.util.*;
import java.io.*;
public class NameSearch {

	public static void main(String[] args) throws IOException {
		
		// Create Array Lists 
		ArrayList<String> boyList = new ArrayList<>(); 
		ArrayList<String> girlList = new ArrayList<>();
		String name;
		
		// Create Files
		File boyNames = new File("BoyNames.txt");
		File girlNames = new File("GirlNames.txt");
		
		// Input Scanner 
		Scanner in = new Scanner(System.in);
		// File Scanners 
		Scanner boyNameIn = new Scanner(boyNames); 
		Scanner girlNameIn = new Scanner(girlNames);
		
		// Pass ArrayLists Names Data 
		while(boyNameIn.hasNext())  
			boyList.add(boyNameIn.nextLine());
		
		while(girlNameIn.hasNext())
			girlList.add(girlNameIn.nextLine());
		
		// Close Scanners
		in.close();
		boyNameIn.close();
		girlNameIn.close();
		
		// Get Input
		System.out.printf("Enter Name: ");
		name = in.nextLine();
		
		// Output Name Popularity Conditions
		if(checkBoys(name,boyList) == true || checkGirls(name,girlList) == true)
			System.out.println(name + " Is Popular");
		else
			System.out.println(name + " Is Not Popular");
	}
	
	/**
	 * Checks List Of Popular Names And Returns True If Name Is In List
	 * @param name Name Inputed By User
	 * @param boys Array List Popular Of Boy Names
	 * @return isPopular Returns True If Name Is In List
	 */
	
	public static boolean checkBoys(String name, ArrayList<String> boys) { 
		
		boolean isPopular = false;
		
		for(int i = 0; i < boys.size(); i++) { 
			
			if(name.equalsIgnoreCase(boys.get(i)))
				isPopular = true;
		}
		return isPopular;
	}
	
	/**
	 *  Checks List Of Popular Names And Returns True If Name Is In List
	 * @param name Name Inputed By User
	 * @param girls Array List Of Popular Girl Names
	 * @return isPopular Returns True If Name Is In List
	 */
	
	public static boolean checkGirls(String name, ArrayList<String> girls) { 
		
		boolean isPopular = false;
		
		for(int i = 0; i < girls.size(); i++) { 
			
			if(name.equalsIgnoreCase(girls.get(i)))
				isPopular = true;
		}
		return isPopular;
	}
}
