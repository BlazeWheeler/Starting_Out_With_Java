
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 491 Problem 12: Number Analysis Class 
 * 
 * @Description Write a class with a constructor that accepts a file name as its argument. 
 * Assume the file contains a series of numbers, each written on a separate line. 
 * The class should read the contents of the file into an array, 
 * and then displays the following data:
 * The lowest number in the array
 * The highest number in the array
 * The total of the numbers in the array
 * The average of the numbers in the array
 * This chapter’s source code folder, available at www.pearsonhighered.com/gaddis, 
 * contains a text file named Numbers.txt. This file contains twelve random numbers.
 * Write a program that tests the class by using this file.
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

public class NumberAnalysisClass {

	public static void main(String[] args )throws IOException {
		
		// Create Object
		NumberAnalysis test = new NumberAnalysis("Numbers.txt");
		
		System.out.println("Lowest: " + test.getLowest());
		System.out.println("Highest: " + test.getHighest());
		System.out.printf("Average: %.2f%n", test.getAvg());
		System.out.printf("Total: %.2f%n", test.getTotal());
	}
}


class NumberAnalysis { 
	
	private String numFile;
	
	private ArrayList<Double> list = new ArrayList<>();
	
	/**
	 * Reads The Contents Of The File Into An Array
	 * @param file Name Of File
	 * @throws IOException If File Does Not Exist 
	 */
	
	NumberAnalysis(String file) throws IOException{ 
		this.numFile = file;
		
		File numAnalysis = new File(numFile);
		Scanner inputFile = new Scanner(numAnalysis);
		
		while(inputFile.hasNext()) { 
			
			this.list.add(inputFile.nextDouble());
		}
		inputFile.close();
	}
	
	/**
	 * Calculates And Returns Lowest Element In Array
	 * @return lowest Lowest Element
	 */
	
	public double getLowest() { 
		
		double lowest = list.get(0);

		for(int i = 0; i < list.size(); i++) 
			if(list.get(i) < lowest)  lowest = list.get(i);	
		return lowest;
	}
	
	/**
	 * Calculates And Returns Highest Element In Array
	 * @return highest 
	 */
	
	public double getHighest() { 
		
		double highest = 0; 
		
		for(int i = 0; i < list.size(); i++)
			if(list.get(i) > highest) highest = list.get(i);
		return highest;	
	}

	/**
	 * Calculates And Returns Sum Of All Elements In Array
	 * @return total Sum Of All Elements In Array
	 */
	
	public double getTotal() { 
		double total = 0;
		
		for(int i = 0; i < list.size(); i++)
			total += list.get(i);
		return total;
		
	}
	
	/**
	 * Calculates And Returns Average Of Elements In Array
	 * @return avg Average Of All Elements In Array
	 */
	
	public double getAvg() { 
		
		double avg = 0;
		
		for(int i = 0; i < list.size(); i++)
			avg += list.get(i);
		return avg / list.size();
	}
}