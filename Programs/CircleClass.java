/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 398  Problem 7: Circle Class
 * 
 * @Description Write a Circle class that has the following fields:
 * radius: a double
 * PI: a final double initialized with the value 3.14159
 * The class should have the following methods:
 * Constructor. Accepts the radius of the circle as an argument.   
 * Constructor. A no argument constructor that sets the radius field to 0.0.
 * getRadius. An accessor method for the radius field.
 * getArea. Returns the area of the circle, which is calculated as
 * area = PI * radius * radius
 * getDiameter. Returns the diameter of the circle, 
 * which is calculated as diameter = radius * 2.
 * getCircumference. Returns the circumference of the circle,
 * which is calculated as circumference = 2 * PI * radius
 * Write a program that demonstrates the Circle class by asking
 * the user for the circle’s radius, creating a Circle object, 
 * and then reporting the circle’s area, diameter, and circumference.
 */

import java.util.*;
import java.text.*;

public class CircleClass {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner in = new Scanner(System.in);
		
		// Decimal Formatter
		DecimalFormat circleFormatter = new DecimalFormat("0.00");
		
		double radius; 
		
		System.out.println("Enter Radius Of Circle: ");
		radius = in.nextDouble();
		in.close();
		
		//Create Circle Object
		Circle circle1 = new Circle(radius);
		
		// Output Object Properties
		System.out.println("Circle Area: " + circleFormatter.format(circle1.getArea()));
		System.out.println("Circle Diameter: " + circleFormatter.format(circle1.getDiameter()));
		System.out.println("Circle Circumference: " + circleFormatter.format(circle1.getCircumference()));
	}
}

class Circle { 
	
	private double radius;
	final private double PI = 3.14159; 
	
	/**
	 * Accepts the radius of the circle as an argument.
	 * @param r radius 
	 */
	
	Circle(double r) { 
		this.radius = r;
	}
	
	/*
	 * No Argument constructor that sets the radius field to 0.0
	 */
	
	Circle(){ 
		this.radius = 0.0;
	}

	/**
	 * Mutator method for the radius field.
	 * @param r radius 
	 */
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	/**
	 * Accessor method for the radius field.
	 * @return r radius 
	 */
	
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Returns the area of the circle
	 */
	
	public double getArea() { 
		return PI * radius * radius;
	}
	
	/**
	 * Returns the diameter of the circle
	 */
	
	public double getDiameter() { 
		return radius * 2;
	}
	
	/**
	 * Returns the circumference of the circle,
	 */
	public double getCircumference() { 
		return 2 * PI * radius;
	}
	
}