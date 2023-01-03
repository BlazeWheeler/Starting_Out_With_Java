/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 396 Problem 1: Employee Class
 * 
 * @Description Write a class named Employee that has 
 * the following fields:
 * name. The name field references a String object that holds 
 * the employee’s name.
 * idNumber. The idNumber is an int variable that holds the 
 * employee’s ID number.
 * department. The department field references a String object 
 * that holds the name of the department where the employee works.
 * department. The department field references a String object that 
 * holds the name of the department where the employee works.
 * position. The position field references a String object that 
 * holds the employee’s job title.
 * The class should have the following constructors:
 * A constructor that accepts the following values as arguments
 * and assigns them to the appropriate fields: employee’s name,
 * employee’s ID number, department, and position.
 * A constructor that accepts the following values as arguments 
 * and assigns them to the appropriate fields: employee’s name 
 * and ID number. The department and position fields should be 
 * assigned an empty string ("").
 * A no argument constructor that assigns empty strings ("") to 
 * the name, department, and position fields, and 0 
 * to the idNumber field.
 * Write appropriate mutator methods that store values in these 
 * fields and accessor methods that return the values in these 
 * fields. Once you have written the class, write a separate
 * program that creates three Employee objects to hold the 
 * following data:
 *	Name			ID Number	Department		Position
 * 	-----------------------------------------------------------
 * 	Susan Meyers	47899		Accounting		Vice President
 *	Mark Jones 		39119		IT 				Programmer 
 * 	Joy Rogers		81774		Manufacturing	Engineer
 * The program should store this data in the three objects and 
 * then display the data for each employee on the screen.
 * 
 */
public class EmployeeClass {

	public static void main(String[] args) {
		
		//Creating And Instantiating  Employee Objects
		Employee emp1 = new Employee("Susan Meyers", 47899, 
									 "Accounting", "Vice President");
		
		Employee emp2 = new Employee("Mark Jones", 39119, 
				 					 "IT", "Programmer");
		
		Employee emp3 = new Employee("Joy Rogers", 81774, 
				 					 "Manufacturing", "Engineer");
		
		//Employee Table Formatting 
		System.out.println("Name\tID Number\tDepartment\tPosition");
		System.out.println("-------------------------------------------------------");
		
		//Output Employee 1 Fields
		System.out.println(emp1.getName() + "\t" + emp1.getIdNumber()
						   				  + "\t" + emp1.getDepartment()
						   				  + "\t" + emp1.getPosition());
		//Output Employee 2 Fields
		System.out.println(emp2.getName() + "\t" + emp2.getIdNumber()
			  							  + "\t" + emp2.getDepartment()
			  							  + "\t\t" + emp2.getPosition());
		//Output Employee 3 Fields
		System.out.println(emp3.getName() + "\t" + emp3.getIdNumber()
										  + "\t" + emp3.getDepartment()
										  + "\t" + emp3.getPosition());
	}

}

class Employee { 
	//Fields
	private String name; 
	private int idNumber; 
	private String department; 
	private String position;
	
	 /**
		* A no argument constructor that assigns empty strings
		* And integers to 0
		* @param n name
		* @param id idNumber
		* @param d department 
		* @param p position
		**/
	
	Employee(){ 
		name = ""; 
		idNumber = 0; 
		department = "";
		position = "";
	}
	
   /**
	* A constructor that accepts the following values as arguments 
	* and assigns them to the appropriate fields
	* @param n name
	* @param id idNumber
	* @param d department 
	* @param p position
	**/
	
	Employee(String n, int id, String d, String p){ 
		name = n; 
		idNumber = id; 
		department = d; 
		position = p;
		
	}
	
	/**
	 * A constructor that accepts the following values as arguments
	 * and assigns them to the appropriate fields: 
	 * employee’s name and ID number. The department and position
	 * fields should be assigned an empty string ("").
	 * @param n name
	 * @param id idNumber
	 **/
		
	Employee(String n , int id){ 
		this.name = n; 
		this.idNumber = id;
		this.department = "";
		this.position = "";
		
	}
	
	//Setters
	public void setName(String n) { 
		this.name = n;
	}
	
	public void setId(int id) { 
		this.idNumber = id;
	}
	
	public void setDepartment(String d) { 
		this.department = d;
	}
	
	public void setPosition(String p) { 
		this.position = p;
	}

	//Getters
	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	
	public String getPosition() {
		return position;
	}
}
