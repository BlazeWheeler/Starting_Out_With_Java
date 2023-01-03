/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 397 Problem 5: Payroll Class 
 * 
 * @Description Design a Payroll class that has fields for an employee’s
 * name, ID number, hourly pay rate, and number of hours worked. 
 * Write the appropriate accessor and mutator methods and a constructor
 * that accepts the employee’s name and ID number as arguments.
 * The class should also have a method that returns the employee’s gross
 * pay, which is calculated as the number of hours worked multiplied
 * by the hourly pay rate. Write a program that demonstrates 
 * the class by creating a Payroll object, then asking the user to enter the data
 * for an employee. The program should display the amount of 
 * gross pay earned.
 */


import java.util.*;
import java.text.*;

public class PayrollClass {

	public static void main(String[] args) {
		
		String name; 
		int empId;
		int	hoursWorked; 
		double hourlyWage; 
		
		//Scanner
		Scanner in = new Scanner(System.in);
		DecimalFormat usd = new DecimalFormat("$ 0.00");
		
		//Get Input
		System.out.println("Enter Employee Name: ");
		name = in.nextLine(); 
		
		System.out.println("Enter Employee ID: "); 
		empId = in.nextInt(); 
		
		System.out.println("Enter Hours Worked: ");
		hoursWorked = in.nextInt(); 
		
		System.out.println("Enter Hourly Wage: ");
		hourlyWage = in.nextDouble(); 
		in.close();
		
		//Create Employee Payroll Object
		Payroll emp1 = new Payroll(name, empId); 
		
		//Set Wage And Hours Worked
		emp1.setHoursWorked(hoursWorked);
		emp1.setHourlyPay(hourlyWage);
		
		//Output And Format Gross Pay
		System.out.println(emp1.getName() +"'s Gross Pay: " 
		+ usd.format(emp1.grossPay()));
	}
}

class Payroll { 
	
	private String name;  
	private int idNumber; 
	private int hoursWorked; 
	private double hourlyPay; 
	
	Payroll(String n, int id){ 
		this.name = n; 
		this.idNumber = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public double grossPay() { 
		
		return hoursWorked * hourlyPay;
	}
}

