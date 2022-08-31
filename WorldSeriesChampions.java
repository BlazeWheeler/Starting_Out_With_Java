
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 492 Problem 15: World Series Champions
 * 
 * @Description If you have downloaded this book’s source code 
 * (the companion Web site is available at www.pearsonhighered.com/gaddis),
 *  you will find a file named WorldSeriesWinners.txt. 
 * This file contains a chronological list of the winning teams in the World Series from 1903 through 2009. 
 * (The first line in the file is the name of the team that won in 1903,
 *  and the last line is the name of the team that won in 2009. 
 *  Note that the World Series was not played in 1904 or 1994, so those years are skipped in the file.)
 *  Write a program that lets the user enter the name of a team, and then displays the number of 
 *  times that team has won the World Series in the time period from 1903 through 2009.
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WorldSeriesChampions {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in); 
		File file = new File("WorldSeriesWinners.txt");
		Scanner championFile = new Scanner(file);
		String teamName;
		
		ArrayList<String> worldSeries = new ArrayList<>(); 
		
		// Pass Data To Array
		while(championFile.hasNext()) 
			worldSeries.add(championFile.nextLine());
		championFile.close();
		
		// Get Input 
		System.out.println("Enter Name Of Team");
		teamName = in.nextLine();
		in.close();
		
		outputWins(teamName, worldSeries);
	}
	
	/**
	 * Steps Through World Series Champions Array And Outputs Number Of Championships
	 * @param teamName Name Of Team
	 * @param list Names Of Winners Of Every World Series Championship
	 */
	
	public static void outputWins(String teamName, ArrayList<String> list) { 
		
		// Set Accumulator 
		int numOfWins = 0;
		
		// Walk Through Array And Count Number Of Wins
		for(int i = 0; i < list.size(); i++) { 
			
			// Checks Team Name Ignoring Spaces And Capital Letters
			if(teamName.replaceAll("\\s+","").equalsIgnoreCase(list.get(i).replaceAll("\\s+","")))
				numOfWins++;
		}
		System.out.println(teamName + " Number Of Wins: " + numOfWins);
	}
}

