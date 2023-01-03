/*--------------------------------------------------------------------------------------
 *  MARK: @@@AUTHOR: Blaze Wheeler @ https://github.com/blazeWheeler
 *  
 *  Write a program that asks the user for the number of males and the number of females 
 *  registered in a class. The program should display the percentage 
 *  of males and females in the class.
 *---------------------------------------------------------------------------------------
 */


import java.util.*;
import java.text.DecimalFormat;
public class MaleAndFemalePercentages {

	
	public static void main(String[] args) {
		
		//Output Format
		
		DecimalFormat percentFormatter = new DecimalFormat("## %");
		
		Scanner in = new Scanner(System.in);
		int males, females; 
		double percentMales, percentFemales;
		
		System.out.println("Enter The Nuber Of Males: ");
		males = in.nextInt(); 
		
		System.out.println("Enter The Nuber Of Females: ");
		females = in.nextInt(); 
		in.close();
		
		// Formula For Percent Of males
		percentMales = males + females; 
		percentMales = males / percentMales; 
		
		// Formula For Percent Of females
				
		percentFemales = males + females; 
		percentFemales = females/ percentFemales; 

	
		System.out.println("Percent Of Males In Class : " + 
					percentFormatter.format(percentMales));
		System.out.println("Percent Of Females In Class : " + 
				percentFormatter.format(percentFemales));
	
		
	}

}
