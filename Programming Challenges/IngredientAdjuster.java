/*------------------------------------------------------------------------------------
 * MARK: @@@AUTHOR: Blaze Wheeler @ https://github.com/blazeWheeler
 * 
 * A cookie recipe calls for the following ingredients:
 *	• 1.5 cups of sugar
 *	• 1 cup of butter
 *	• 2.75 cups of flour
 * The recipe produces 48 cookies with these amounts of the ingredients.
 * Write a program that asks the user how many cookies he or she wants to make, 
 * and then displays the number of cups of each ingredient needed for 
 * the specified number of cookies.
 *------------------------------------------------------------------------------------
 */



import java.util.*;
import java.text.DecimalFormat;

public class IngredientAdjuster {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat cupsFormatter = new DecimalFormat("#.## Cups ");
		
		 double sugar = 1.5; 
		 double butter = 1.0; 
		 double flour = 2.75; 
		 int userCookies;
		
		System.out.println("Enter Amount Of Cookies");
		userCookies = in.nextInt(); 
		in.close();
		
		// MARK: Prints Recipe For One Batch Of Cookies (48 Cookies)
		if(userCookies <= 48) { 
			
			System.out.println(cupsFormatter.format(sugar) + "Of Sugar");
			System.out.println(cupsFormatter.format(butter) + "Of Butter");
			System.out.println(cupsFormatter.format(flour) + "Of Flour");
			
		// MARK: If Amount Of Cookies Is Above Original Batch	
		} else { 
			
			// @userCookies Now Stores Number Of Batches 
			userCookies = userCookies / 48; 
			
			
		// For Each Batch add amount of ingredient to itself
		// i = 1 because sugar is already is already instantiated as one of itself
			for(int i = 1; i < userCookies; i++) { 
				sugar = sugar + 1.5; 
				butter = butter + 1;
				flour = flour + 2.75;
			}
			System.out.println(cupsFormatter.format(sugar) + "Of Sugar");
			System.out.println(cupsFormatter.format(butter) + "Of Butter");
			System.out.println(cupsFormatter.format(flour) + "Of Flour");
		}

	}

}
