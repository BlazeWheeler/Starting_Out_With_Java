/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis & Gofrey Muganda
 * Page: 264 Problem 14: Patient Charges
 * 
 * @Description Write a class named Patient that has fields for the following data:
 * First name, middle name, and last name, Street address, city, state, and ZIP code
 * Phone number, Name and phone number of emergency contact
 * The Patient class should have a constructor that accepts an argument for each field. 
 * The Patient class should also have accessor and mutator methods for each field.
 * Next, write a class named Procedure that represents a medical procedure that has been performed on a patient. 
 * The Procedure class should have fields for the following data:
 * Name of the procedure
 * Date of the procedure
 * Name of the practitioner who performed the procedure
 * Charges for the procedure
 * The Procedure class should have a constructor that accepts an argument for each field. 
 * The Procedure class should also have accessor and mutator methods for each field.
 * Next, write a program that creates an instance of the Patient class, initialized with sample data. 
 * Then, create three instances of the Procedure class, initialized with the following data:
 * 
 * 		Producure #1		Producure #2		Producure #3
 * 		_________________________________________________________________
 *		Procedure Name:		Procedure Name:		Procedure Name:
 *		Physical Exam		X-Ray				Blood Test
 *		Date:				Date:				Date:
 *		1-11-11				1-11-11				1-11-11
 *		Practitioner:		Practitioner:		Practitioner:
 *		Dr. Irvine			Dr. Jamison			Dr. Smith
 *		Charge:				Charge:				Charge:
 *		250.0				500.0				200.0
 *
 * The program should display the patient’s information, information about all three of the procedures, 
 * and the total charges of the three procedures.
 */



public class PatientCharges {

	public static void main(String[] args) {
		
		// Create Patient Instance
		Patient patient1 = new Patient("Jane", "Marie", "Doe", "123 Seasme St", "New York City",
									   "New York", "15102", "(123)-456-7890", "John Smith", 
									   "(098)-765-4321)");
		
		Procedure procedure1 = new Procedure("Physical Exam", "1-11-11", "Dr. Irvine", 250.00);
		Procedure procedure2 = new Procedure("X-Ray", "1-11-11", "Dr. Jamison", 500.00); 
		Procedure procedure3 = new Procedure("Blood Test", "1-11-11", "Dr. Smith", 200.00); 
		
		// Output Patient Information
		System.out.println("\tPatient Information");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(patient1.toString());
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		
		// Output Procedure Information
		
		// Formatting
		System.out.println(" Producure #1\t\tProducure #2\t\tProducure #3");
		System.out.println("_________________________________________________________________");
		
		// Name Of Procedure 
		System.out.println("Procedure Name:" + "\t\tProcedure Name:\t\t" + "Procedure Name:");
		System.out.println(procedure1.getNameOfProd() + "\t\t" + procedure2.getNameOfProd() 
													  + "\t\t\t" + procedure3.getNameOfProd());
		// Date
		System.out.println("Date:" + "\t\t\tDate:\t\t\t" + "Date:");
		System.out.println(procedure1.getDateOfProd() + "\t\t\t" + procedure2.getDateOfProd() 
													  + "\t\t\t" + procedure3.getDateOfProd());
		// Practitioner
		System.out.println("Practitioner:" + "\t\tPractitioner:\t\t" + "Practitioner:");
		System.out.println(procedure1.getNameOfPract() + "\t\t" + procedure2.getNameOfPract() 
		  + "\t\t" + procedure3.getNameOfPract());
		
		// Charges
		System.out.println("Charge:" + "\t\t\tCharge:\t\t\t" + "Charge:");
		System.out.println(procedure1.getProdCharges() + "\t\t\t" + procedure2.getProdCharges() 
				  									   + "\t\t\t" + procedure3.getProdCharges());
	}
}

class Procedure { 
	
	private String nameOfProd,
				   dateOfProd,
				   nameOfPract;
	private double prodCharges;
	
	Procedure(String nameProd, String dateProd, 
			  String namePract, double chargesProd) 
	{ 
		this.nameOfProd = nameProd;
		this.dateOfProd = dateProd;
		this.nameOfPract = namePract; 
		this.prodCharges = chargesProd;
	}

	// Getters & Setters
	public String getNameOfProd() {
		return nameOfProd;
	}

	public void setNameOfProd(String nameOfProd) {
		this.nameOfProd = nameOfProd;
	}

	public String getDateOfProd() {
		return dateOfProd;
	}

	public void setDateOfProd(String dateOfProd) {
		this.dateOfProd = dateOfProd;
	}

	public String getNameOfPract() {
		return nameOfPract;
	}

	public void setNameOfPract(String nameOfPract) {
		this.nameOfPract = nameOfPract;
	}

	public double getProdCharges() {
		return prodCharges;
	}

	public void setProdCharges(double prodCharges) {
		this.prodCharges = prodCharges;
	}
}



/**
 * <h1> Stores Information Of Patient <h1>
 *<h2> Required Fields:<h2>
 * First Name, Middle Name, Last Name, Address, City
 * State, ZIP Code, Patient Contact Number, 
 * Emergency Contact Name, Emergency Contact Number
 * 
 */
class Patient { 
	
	private String firstName,
				   middleName,
				   lastName, 
				   address,
				   city,
				   state, 
				   zipCode,
				   patientPhoneNum,
				   emgContactName,
				   emgNumber;
	
	Patient(String fn, String mn, String ln, String add, String c, 
			String st, String zc, String ppm, String emgName, String emgNum)
	{  
		this.firstName = fn; this.middleName = mn; 
		this.lastName = ln;  this.address = add; 
		this.city = c; 		 this.state = st; 
		this.zipCode = zc;	 this.patientPhoneNum = ppm;
		this.emgContactName = emgName; 
		this.emgNumber = emgNum;
	}
	
	// toString Method 
	public String toString() { 
		return 
			   "Patient Name: " + firstName + " " + middleName + " " + lastName +
			   "\nPatient Address: " + address + "\nState: " + state + 
			   "\nCity: "  + city + "\nZIP Code: " + zipCode +
			   "\nPatient Phone Number: " + patientPhoneNum + 
			   "\nPatient Emergency Contact Name: "+ emgContactName +
			   "\nPatient Emergency Contact Number: " + emgNumber;
	}

	// Getters & Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPatientPhoneNum() {
		return patientPhoneNum;
	}

	public void setPatientPhoneNum(String patientPhoneNum) {
		this.patientPhoneNum = patientPhoneNum;
	}

	public String getEmgContactName() {
		return emgContactName;
	}

	public void setEmgContactName(String emgContactName) {
		this.emgContactName = emgContactName;
	}

	public String getEmgNumber() {
		return emgNumber;
	}

	public void setEmgNumber(String emgNumber) {
		this.emgNumber = emgNumber;
	}
	
}