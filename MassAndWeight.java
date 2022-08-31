/*--------------------------------------------------------------------------------------
 *  MARK: @@@AUTHOR: Blaze Wheeler @ https://github.com/blazeWheeler
 *  
 *  Scientists measure an object’s mass in kilograms and its weight in Newtons. 
 *  If you know the amount of mass that an object has, you can calculate its weight, in Newtons,
 *   with the fol- lowing formula:
 *	Weight 5 Mass 3 9.8
 *	Write a program that asks the user to enter an object’s mass, 
 *	and then calculate its weight. If the object weighs more than 1,000 Newtons,
 *  display a message indicating that it is too heavy.
 *  If the object weighs less than 10 Newtons, 
 *  display a message indicating that the object is too light.
 * 
 *---------------------------------------------------------------------------------------
 */



import java.util.*;

public class MassAndWeight {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in); 
		
		double weight; 
		
		System.out.println("Enter Weight Of The Object");
		weight = in.nextDouble(); 
		in.close();
		
		weight = weight * 9.8; 
		System.out.printf("Object Is %.2f Newtons \n", weight);
		
		if(weight > 1000) 
			System.out.println("Object Is Too Heavy");
		if(weight < 10)
			System.out.println("Object is Too Light");
		
		
		

	}

}
