/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 400 Problem 11: Freezing and Boiling Points
 * 
 * @Description The following table lists the freezing and 
 * boiling points of several substances: 
 * 
 * 		Substance   	 Freezing Point		Boiling Point
 * 		----------------------------------------------------
 *		Ethyl Alcohol 		–173				 172 
 *		Oxygen 				–362				–306
 *		Water				 32					 212
 *
 * Design a class that stores a temperature in a temperature 
 * field and has the appropriate accessor and mutator methods 
 * for the field. In addition to appropriate constructors, the 
 * class should have the following methods:
 * 
 * isEthylFreezing. This method should return the boolean value 
 * true if the temperature stored in the temperature field is at
 * or below the freezing point of ethyl alcohol. 
 * Otherwise, the method should return false.
 * 
 * isEthylBoiling. This method should return the boolean value 
 * true if the temperature stored in the temperature field is 
 * at or above the boiling point of ethyl alcohol.
 * Otherwise, the method should return false.
 * 
 * isOxygenFreezing. This method should return the boolean value
 * true if the temperature stored in the temperature field is 
 * at or below the freezing point of oxygen. 
 * Otherwise, the method should return false.
 * 
 * isOxygenBoiling. This method should return the boolean value 
 * true if the temperature stored in the temperature field is at
 * or above the boiling point of oxygen.
 * Otherwise, the method should return false.
 * 
 * isWaterFreezing. This method should return the boolean value
 * true if the temperature stored in the temperature field is 
 * at or below the freezing point of water. 
 * Otherwise, the method should return false.
 * 
 * isWaterBoiling. This method should return the boolean value 
 * true if the temperature stored in the temperature field is at
 * or above the boiling point of water. 
 * Otherwise, the method should return false.
 * Write a program that demonstrates the class. The program should
 * ask the user to enter a temperature, and then display a list
 * of the substances that will freeze at that temperature and those 
 * that will boil at that temperature. For example, if the 
 * temperature is –20 the class should report that water will 
 * freeze and oxygen will boil at that temperature.
 */

import java.util.*;

public class FreezingAndBoilingPoints {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner in = new Scanner(System.in); 
		// Temperature Value
		int temp;
		
		System.out.println("Enter Temp: ");
		temp = in.nextInt();
		in.close();
		
		// Create Instance Of isTemp Class
		isTemp userTemp = new isTemp(temp);
		
		//Output
		userTemp.output(temp);
	}
}

class isTemp { 
	
	private double temp;
	
	isTemp(){ 
		this.temp = 0.0;
	}
	
	isTemp(double t){ 
		this.temp = t;
	}
	
	/**
	 * Gets Temperature
	 * @return temp Temperature 
	 */
	
	public double getTemp() { 
		return temp;
	}
	
	/**
	 * Sets Temperature
	 * @param t Temperature
	 */
	
	public void setTemp(double t) { 
		this.temp = t;
	}
	
	/**
	 * Determines If Ethyl Alcohol Temperature is Freezing
	 * @param t Temperature 
	 * @return isFreezing Returns True If Ethyl Temperature Is Freezing
	 */
	
	public boolean isEthylFreezing(double t) { 
		boolean isFreezing = false;  
		if(t <= -173 ) 
			isFreezing = true;
		return isFreezing;
	}
	
	/**
	 * Determines If Ethyl Alcohol Temperature is Boiling
	 * @param t Temperature 
	 * @return isBoiling Returns True If Ethyl Temperature Is Freezing
	 */
	
	public boolean isEthylBoiling(double t) { 
	 	boolean isBoiling = false;  
		if(t >= 172 ) 
			isBoiling = true;
		return isBoiling;
	}
	
	/**
	 * Determines If Oxygen Temperature is Freezing
	 * @param t Temperature 
	 * @return isFreezing Returns True If Oxygen Temperature Is Freezing
	 */
	
	public boolean isOxygenFreezing(double t) { 
		boolean isFreezing = false;  
		if(t <= -362 ) 
			isFreezing = true;
		return isFreezing;
	}
	
	/**
	 * Determines If Oxygen Temperature is Boiling
	 * @param t Temperature
	 * @return isBoiling Returns True If Oxygen Temperature Is Boiling
	 */
	
	public boolean isOxygenBoiling(double t) { 
	 	boolean isBoiling = false;  
		if(t >= -306) 
			isBoiling = true;
		return isBoiling;
	}
	
	/**
	 * Determines If Water Temperature Is Freezing
	 * @param t Temperature
	 * @return isFreezing Returns True If Water Temperature Is Boiling
	 */
	
	public boolean isWaterFreezing(double t) { 
		boolean isFreezing = false;  
		if(t <= 32 ) 
			isFreezing = true;
		return isFreezing;
	}
	
	/**
	 * Determines If Water Temperature Enough To Boil
	 * @param t
	 * @return isBoiling Returns True If Water Temperature Is Boiling
	 */
	
	public boolean isWaterBoiling(double t) { 
	 	boolean isBoiling = false;  
		if(t >= 212) 
			isBoiling = true;
		return isBoiling;
	}
	
	/**
	 * Calls All Checking Methods And Prints Substance That Freeze Or Boil
	 * At Inputed Temperature
	 * @param t Temperature 
	 */
	
	public void output(double t) { 
	
		System.out.println("Freezing: ");
		
		if(isEthylFreezing(t) == true)  
			System.out.println("Ethyl Alcohol");
		if(isOxygenFreezing(t) == true )
			System.out.println("Oxygen");
		if(isWaterFreezing(t) == true )
			System.out.println("Water");
		
		System.out.println("Boiling: ");
		
		if(isEthylBoiling(t) == true)
			System.out.println("Ethyl Alcohol");
		if(isOxygenBoiling(t) == true )
			System.out.println("Oxygen");
		if(isWaterBoiling(t) == true )
			System.out.println("Water");
	}
}