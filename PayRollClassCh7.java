/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 488 Problem 2: Payroll Class
 * 
 * @Description Write a Payroll class that uses the following arrays as fields:
 * employeeId. An array of seven integers to hold employee identification numbers. 
 * The array should be initialized with the following numbers:
 *  5658845 4520125 7895122 8777541
 *  8451277 1302850 7580489
 * hours. An array of seven integers to hold the number of hours worked by each employee
 * payRate. An array of seven doubles to hold each employee’s hourly pay rate
 * wages. An array of seven doubles to hold each employee’s gross wages
 * The class should relate the data in each array through the subscripts.
 * For example, the number in element 0 of the hours array should be the number of hours 
 * worked by the employee whose identification number is stored in element 0 of the employeeId array. 
 * That same employee’s pay rate should be stored in element 0 of the payRate array.
 * In addition to the appropriate accessor and mutator methods, the class should have 
 * a method that accepts an employee’s identification number as an argument and returns 
 * the gross pay for that employee.
 * Demonstrate the class in a complete program that displays each employee number 
 * and asks the user to enter that employee’s hours and pay rate. It should then display 
 * each employee’s identification number and gross wages.
 * Input Validation:
 *  Do not accept negative values for hours or numbers less than 6.00 for pay rate.
 */

import java.util.*;

public class PayRollClassCh7 {

	public static void main(String[] args) {
		
		// Create Scanner 
		Scanner in = new Scanner(System.in);
		
		// Employee's Identification Numbers
		int empId[] = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
		
		int empHours[] = new int[empId.length];
		double payRateArr[] = new double [empId.length];
		double payRate;
		
		// Create Payroll Object
		Payrollch7 payRollObj1 = new Payrollch7(empId);
		
		// Get And Store Input 
		for(int i = 0; i < empId.length; i++) { 
			System.out.println("Enter Number Of Hours Worked By Employee "
							   + empId[i] + ": ");
			empHours[i] = in.nextInt(); 
			
			System.out.println("Enter Pay Rate For Employee " + empId[i] + ": ");
			payRate = in.nextDouble();
			payRateArr[i] = payRate;
			
			// Input Validation For Pay Rate
			while(payRate < 6.00) { 
				System.out.println("Enter A Pay Rate Above " + payRate);
				payRate = in.nextDouble();
			}
		}
		in.close();
		payRollObj1.setHours(empHours);
		payRollObj1.setPayRate(payRateArr);
		
		//Output 
		for(int i = 0; i < empId.length; i++) { 
			System.out.print("Employee Number: " + empId[i]);
			// Pass Employee Number To getGrossPay
			System.out.printf(" Gross Pay: $ %.2f", payRollObj1.getGrossPay(empId[i]));
			System.out.println();
		}
	}
}

/**
 * Chapter 7 Payroll Class
 */

class Payrollch7 { 
	
	private int[] employeeId;
	private int[] hours; 
	private double[] payRate; 
	private double[] wages;
	
	Payrollch7(int[] empArr) { 
		this.employeeId = empArr;
	}
	
	/**
	 * Calculates And Returns Employee's Gross Pay
	 * @param empId Identification Of Number Employee
	 * @return grossPay Returns Gross Pay Of Employee
	 */
	public double getGrossPay(int empId) { 
		
		double grossPay = 0;
		for(int i = 0; i < employeeId.length; i++) { 
			
			if(employeeId[i] == empId)  
				grossPay = hours[i] * payRate[i];
		}
		return grossPay;
	}
	
	// Getters
	public int[] getEmployeeId() {
		return employeeId;
	}

	public int[] getHours() {
		return hours;
	}
	
	public double[] getPayRate() {
		return payRate;
	}

	public double[] getWages() {
		return wages;
	}

	// Setters
	public void setEmployeeId(int[] employeeId) {
		this.employeeId = employeeId;
	}

	public void setHours(int[] hours) {
		this.hours = hours;
	}

	
	public void setPayRate(double[] payRate) {
		this.payRate = payRate;
	}

	
	public void setWages(double[] wages) {
		this.wages = wages;
	}
}

