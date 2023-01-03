/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 265 Problem 12: Bar Chart 
 * 
 * @Description Write a program that asks the user to enter today’s sales
 * for five stores. The program should display a bar chart comparing
 * each store’s sales. Create each bar in the bar chart by displaying
 * a row of asterisks. Each asterisk should represent $100 of sales. 
 * Here is an example of the program’s output:
 * SALES BAR CHART:
 *	Store 1: **********
 *	Store 2: ************
 *	Store 3: ****************** Store 4: ********
 *	Store 5: ****************
 */

import java.util.*;
import java.util.function.*;

public class BarChart {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double input;
	
		
		ArrayList<Double> stores = new ArrayList<Double>();
		
		for(int i = 1; i < 6; i++) { 
			
			switch(i) { 
			
			case 1 :
				System.out.println("Enter Today's Sales For Store " + i + ": ");
				input = in.nextInt()/100; 
				stores.add(input);
				
			break;
			
			case 2 :
				System.out.println("Enter Today's Sales For Store " + i + ": ");
				input = in.nextInt()/100; 
				stores.add(input);
			break;
				
			case 3 :
				System.out.println("Enter Today's Sales For Store " + i + ": ");
				input = in.nextInt()/100; 
				stores.add(input);
			break;
			
			case 4 :
				System.out.println("Enter Today's Sales For Store " + i + ": ");
				input = in.nextInt()/100; 
				stores.add(input);
			break;
			
			case 5 :
				System.out.println("Enter Today's Sales For Store " + i + ": ");
				input = in.nextInt()/100; 
				stores.add(input);
			break;
			
			}
		}
		in.close();
		
		System.out.println();
		System.out.println("SALES BAR CHART");
		
		stores.forEach( new Consumer<Double>() {
			@Override
			public void accept(Double store) { 
					
				for(int j = 1; j < store +1; j++) { 	
						System.out.print("*");
				}
			System.out.println();
			}
		});
	}
}

