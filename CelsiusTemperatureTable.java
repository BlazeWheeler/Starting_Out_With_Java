/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 313 Problem 6: Celsius Temperature Table
 * 
 * @Description The formula for converting a temperature from
 * Fahrenheit to Celsius is: 
 *    							 5
 *						    C = --- * (F - 32)
 *      						 9 
 * Where F is the Fahrenheit temperature and C is the Celsius temperature.
 * Write a method named celsius that accepts a Fahrenheit temperature as 
 * an argument. The method should return the temperature, converted to 
 * Celsius. 
 * Demonstrate the method by calling it in a loop that displays a table 
 * of the Fahrenheit temperatures 0 through 20 and their Celsius
 * equivalents. 
 */

import java.text.*;
public class CelsiusTemperatureTable {

	public static void main(String[] args) {
		
		// Decimal Formatter
		DecimalFormat tempature = new DecimalFormat("##.##");
		
		double celOutput;  
	
		// Table Formatting
		System.out.println("Celsius Temperature Table");
		System.out.println("--------------------------");
		System.out.println("Fahrenheit\t Celsius ");
		System.out.println("_________________________");
		
		// loop to print 0° - 20°
		for(double i = 0.0; i < 20 + 1; i++) { 
			
			// i = fahrenheit
			System.out.print(i + "°");
			celOutput = celsius(i);
			//More Table Formatting
			System.out.print("\t " +"  |" +"\t" + tempature.format(celOutput) + "°");
			System.out.println();
		}
	}
	
	/*
	 * Convert F° -> C°
	 *   	 5
	 *	C = --- * (F - 32)
	 *       9 
	 * @param temp Temperature In Fahrenheit
	 * @return celsiusVar variable to Store F° -> C°    
	 */
	public static double celsius(double temp) { 
		
		double celsiusVar;
		celsiusVar = 5d/9d;
		temp = temp - 32; 
		celsiusVar = temp * celsiusVar;
		
		return celsiusVar;
		
	}

}
