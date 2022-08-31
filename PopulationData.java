/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 492 Problem 14: Population Data
 * 
 * @Description If you have downloaded this book’s source code 
 * (the companion Web site is available at www.pearsonhighered.com/gaddis), 
 * you will find a file named USPopulation.txt in the Chapter 07 folder. 
 * The file contains the midyear population of the United States, in thousands, 
 * during the years 1950 through 1990. The first line in the file contains the population for 1950,
 * the second line contains the population for 1951, and so forth.
 * Write a program that reads the file’s contents into an array. 
 * The program should display the following data:
 * The average annual change in population during the time period
 * The year with the greatest increase in population during the time period
 * The year with the smallest increase in population during the time period
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

public class PopulationData {

	public static void main(String[] args) throws IOException {
		
		
		// Create File And Scanners
		File usPopulation = new File("USPopulation.txt");
		Scanner fileIn = new Scanner(usPopulation);
		
		ArrayList<Double> popData = new ArrayList<>(); 
		
		// Pass Data To ArrayList
		while(fileIn.hasNext()) { 
			
			double token1 = fileIn.nextDouble();
			popData.add(token1);
		}
		
		fileIn.close();
		
		System.out.printf("Average Annual Change: %.2f%n", getAnnualChangeAvg(popData));
		System.out.printf("Highest Annual Change: %.2f%n", getGreatestIncrease(popData));
		System.out.printf("Lowest Annual Increase: %.2f%n", getSmallestIncrease(popData));
	}
	
	/**
	 * Calculates Least Amount Of Change In A Time Period 
	 * @param arrList arrList List Of Populations
	 * @return minIncrease Least Amount Of Population Changes
	 */
	
	public static double getSmallestIncrease(ArrayList<Double> arrList) { 
		
		double curr = 0;
		double minIncrease = arrList.get(0);
		int j = 0; 

		for(int i = 0; i < arrList.size(); i++) { 
			j++;
			if(arrList.size() > j) { 
				curr = arrList.get(j) - arrList.get(i);
				
				if(curr < minIncrease)
					minIncrease = curr;
			}	
		}
		return minIncrease;
	}
	
	
	/**
	 * Calculates Greatest Amount Of Change In A Time Period 
	 * @param arrList List Of Populations
	 * @return maxIncrease Greatest Amount Of Population Changes
	 */

	public static double getGreatestIncrease(ArrayList<Double> arrList) { 
		
		double curr = 0;
		double maxIncrease = 0;
		int j = 0; 

		for(int i = 0; i < arrList.size(); i++) { 
			j++;
			if(arrList.size() > j) { 
				curr = arrList.get(j) - arrList.get(i);
				
				if(curr > maxIncrease)
					maxIncrease = curr;
			}	
		}
		return maxIncrease;
	}
	
	
	/**
	 * Calculates Average annual Change In Population During A Time Period
	 * @param arrList List Of Populations
	 * @return annualChangeAvg Average Change In Population
	 */
	
	public static double getAnnualChangeAvg(ArrayList<Double> arrList) { 
		
		double annualChangeAvg = 0;
		double annualChange = 0;
		int j = 0; 

		for(int i = 0; i < arrList.size(); i++) { 
			j++;
			if(arrList.size() > j) { 
				annualChange = arrList.get(j) - arrList.get(i);
				annualChangeAvg += annualChange;
			}	
		}
		annualChangeAvg = annualChangeAvg / arrList.size();
		
		return annualChangeAvg;
	}
}
