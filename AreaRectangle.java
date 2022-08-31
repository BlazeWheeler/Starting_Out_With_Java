/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 312 Problem 3: Rectangle Area - Complete The Program
 * 
 * @Description If you have downloaded the book’s source code from 
 * www.pearsonhighered.com/gaddis, you will find a partially written 
 * program named AreaRectangle.java in this chapter’s source code folder.
 * Your job is to complete the program. When it is complete, the program
 * will ask the user to enter the width and length of a rectangle, and 
 * then display the rectangle’s area. The program calls the following 
 * methods, which have not been written:
 * getLength—This method should ask the user to enter the rectangle’s 
 * length, and then return that value as a double.
 * getWidth—This method should ask the user to enter the rectangle’s 
 * width, and then return that value as a double.
 * getArea—This method should accept the rectangle’s length and width 
 * as arguments, and return the rectangle’s area. The area is calculated 
 * by multiplying the length by the width.
 * displayData—This method should accept the rectangle’s length, width, 
 * and area as arguments, and display them in an appropriate 
 * message on the screen.
 */

import java.util.*;
import java.text.*;

public class AreaRectangle {
	
   public static void main(String[] args) {
	  
	   
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
     area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
      
   }
   
   // Public Scanner For All Methods
   public static Scanner in = new Scanner(System.in);
   //Public Decimal Formatter
   public static DecimalFormat display = new DecimalFormat("###.##");
   
   /*
    * Gets User Input For Length
    * @return length Length Of Rectangle
    */
   
   public static double getLength() { 
	   
	   double length;
	   System.out.println("Enter Length: ");
	   length = in.nextDouble();
	   
	   return length; 
   }
   
   /*
    * Gets User Input For Width
    * @return width Width Of Rectangle
    */
   
   public static double getWidth() { 
	   
	   double width;
	   System.out.println("Enter Width: ");
	   width = in.nextDouble();
	   
	   return width; 
   }
   
   /*
    * Calculates Area Of A Rectangle
    * @param l User Inputed Length
    * @param w User Inputed Width
    * @return area Area Of Rectangle
    */
   
   public static double getArea(double l, double w) { 
	   double area; 
	   area = l * w; 
	   return area;
	   
   }
   
   /*
    * Displays Data
    * @param l User Inputed Length
    * @param w User Inputed Width
    * @param a Area Of Rectangle
    */
   
   public static void displayData(double l, double w, double a) { 
	   
	   System.out.println("Length Of Rectangle: " + display.format(l));
	   System.out.println("Width Of Rectangle: " + display.format(w));
	   System.out.println("Area Of Rectangle: " + display.format(a) );
   }
   
}