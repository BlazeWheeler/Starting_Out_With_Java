/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 397 Problem 3: Personal Information Class
 * 
 * @Description Design a class that holds the following personal data: name,
 * address, age, and phone num- ber. Write appropriate accessor and mutator 
 * methods. Demonstrate the class by writing a program that creates three 
 * instances of it. One instance should hold your information, and 
 * the other two should hold your friends’ or family members’ information.
 *     
 */


public class PersonalInformationClass {

	public static void main(String[] args) {
		
		//Creating Objects
		Person prsn1 = new Person("Blaze Wheeler", "123 Sesame St.",
								  	22, "123-456-7890");

		Person prsn2 = new Person("Steve P. Jobs", "321 Apple Dr.",
									56 , "999-999-9999");
		
		Person prsn3 = new Person("Elon R. Musk", "456 Tesla Ave.",
				  					51, "098-765-4321");
		//Format Table Output
		System.out.println("Name\t\t\tAge\t\t Address\t\tPhone Number");
		System.out.println("---------------------------------------------"
									+ "----------------------------------");
		prsn1.display();
		prsn2.display();
		prsn3.display();
	}

}

class Person { 
	
	//Fields
	private String name; 
	private String address;
	private int age; 
	private String phoneNumber;
	
	/**
	 * Constructor accepts Personal Data: 
	 * 
	 * @param add Address
	 * @param age Age 
	 * @param num Telephone Number
	 */
	
	Person(String n, String add, int age, String num){ 
		this.name = n;
		this.address = add; 
		this.age = age; 
		this.phoneNumber = num;
	}

	//Getters
	/**
	 * Name Getter
	 * @return name Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Telephone Number Getter
	 * @return phoneNuber TelePhone Number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Age Getter
	 * @return age Age
	 */

	public int getAge() {
		return age;
	}
	
	/**
	 *  Address getter
	 * @return address address
	 */
	public String getAddress() {
		return address;
	}

	//Setters
	/**
	 * Address Setter
	 * @param address address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Name Setter
	 * @param setName Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Age Setter
	 * @param phoneNumber Age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Phone Number Setter
	 * @param phoneNumber Telephone Number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Prints All Fields In Person Class
	 */
	public void display() { 
		
		System.out.println(name + "\t\t" + age + "\t\t"
							  + address + "\t\t" + phoneNumber);
	}
}
