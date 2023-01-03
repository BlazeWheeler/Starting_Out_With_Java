
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 398 Problem 8: Temperature Class
 * 
 * @Description Write a Temperature class that will hold a
 * temperature in Fahrenheit, and provide methods to get the temperature 
 * in Fahrenheit, Celsius, and Kelvin. The class should have 
 * the following field:
 * ftemp – A double that holds a Fahrenheit temperature.
 * The class should have the following methods:
 * Constructor – The constructor accepts a Fahrenheit temperature 
 * (as a double) and stores it in the ftemp field.
 * setFahrenheit – The setFahrenheit method accepts a Fahrenheit temperature 
 * (as a double) and stores it in the ftemp field.
 * getFahrenheit – Returns the value of the ftemp field, as a 
 * Fahrenheit temperature (no conversion required).
 * getCelsius – Returns the value of the ftemp field converted to Celsius.
 * getKelvin – Returns the value of the ftemp field converted to Kelvin.
 * Use the following formula to convert the Fahrenheit temperature to Celsius:
 * Celsius 5 (5/9) 3 (Fahrenheit 2 32)
 * Use the following formula to convert the Fahrenheit temperature to Kelvin:
 * Kelvin 5 ((5/9) 3 (Fahrenheit 2 32)) 1 273
 */

import java.util.*;

public class TemperatureClass {

	public static void main(String[] args) {
		
		// Scanner 
		Scanner in = new Scanner(System.in);

		double temp;
		// Get Input
		System.out.println("Enter Temperature In Fahrenheit: ");
		temp = in.nextDouble(); 
		in.close();
		// Create Instance Of Object
		Temperature temp1 = new Temperature(temp);
		
		// Output 
		System.out.println("Temperature In Celsius: " + temp1.getCelsius());
		System.out.println("Temperature In Kelvin: " +  temp1.getKelvin());
	}
}

class Temperature { 
	
	private double ftemp; 
	
	/**
	 * The constructor accepts a Fahrenheit temperature
	 * @param ft Fahrenheit
	 */
	Temperature(double ft) { 
		this.ftemp = ft;
	}
	
	/**
	 * 
	 * @return ftemp Fahrenheit
	 */
	public double getFtemp() {
		return ftemp;
	}
	
	/**
	 * 
	 * @param ftemp Fahrenheit 
	 */
	public void setFtemp(double ftemp) {
		this.ftemp = ftemp;
	}
	
	/**
	 * Returns the value of the ftemp field converted to Celsius.
	 */
	public double getCelsius() { 
		
		return  (5d/9d) * (ftemp - 32);
	}
	
	/**
	 * Returns Fahrenheit Converted To Kelvin
	 */
	public double getKelvin() { 

		return ((5d/9d) * (ftemp - 32)) + 273;	
	}
}
