/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 263 Problem 7: Hotel Occupancy
 * 
 * @Description A hotel’s occupancy rate is calculated as follows:
 * Occupancy rate 5 Number of rooms occupied 4 Total number of rooms
 * Write a program that calculates the occupancy rate for 
 * each floor of a hotel.A loop should then iterate once for 
 * each floor.During each iteration, the loop should ask the user
 * for the number of rooms on the floor and the number of them 
 * that are occupied.After all the iterations, the program should 
 * display the number of rooms the hotel has, the number of them 
 * that are occupied, the number that are vacant, and the occupancy
 * rate for the hotel. 
 * Input Validation: Do not accept a value less than 1 for the 
 * number of floors. Do not accept a number less than 10 for 
 * the number of rooms on a floor.  
 */


import java.util.*;
import java.text.DecimalFormat;

public class HotelOccupancy {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		DecimalFormat percent = new DecimalFormat("% ##");
		
		int numOfFloors, numOfRooms, rooms, occupiedRooms, vacantRooms;
		double occupancyRate;
		
		System.out.println("Enter The Number Of Floors In The Hotel");
		numOfFloors = in.nextInt(); 
		
		// Input Validation For Floors
		if(numOfFloors < 1 ) { 
			do {
				System.out.println("Enter A Postive Number");
				numOfFloors = in.nextInt(); 
			}while(numOfFloors < 1);
		}
		
		//Setting Accumulators
		occupiedRooms = 0;
		numOfRooms = 0;
		
		for(int i = 1; i < numOfFloors+1; i ++) { 
			
			System.out.println("Enter Number Of Rooms On Floor " + i);
			rooms = in.nextInt();
			
			//Input Validation For Rooms
			if(rooms < 10) { 
				do { 
					System.out.println("Enter A Number Of Rooms " + 
									   "Greater Than " + rooms);
					rooms = in.nextInt();
				}while(rooms < 10);
			}
			// Add Rooms For Each Iteration 
			numOfRooms += rooms;
			
			System.out.println("Enter The Number Of Occupied Rooms");
			rooms = in.nextInt(); 
			
			// Add OccupiedRooms For Each Iteration 
			occupiedRooms += rooms;
		}
		in.close();
		
		// Calculations 
		vacantRooms = numOfRooms - occupiedRooms;
		//Parse Ints -> Doubles to Output Percents
		occupancyRate = Double.valueOf(occupiedRooms) / Double.valueOf(numOfRooms);
		
		//OutPut Data
		System.out.println("Total Number Of Rooms: " + numOfRooms);
		System.out.println("Number Of Occupied Rooms:  " + occupiedRooms);
		System.out.println("Number Of Vacant Rooms: " + vacantRooms);
		System.out.println("Occupancy Rate " + percent.format(occupancyRate));
		
		

	}

}
