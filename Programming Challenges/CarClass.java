
/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 396 Problem 2: Car Class 
 * 
 * @Description Write a class named Car that has the following fields:
 * yearModel. The yearModel field is an int that holds the car’s year model.
 * make. The make field references a String object that holds the 
 * make of the car.
 * speed. The speed field is an int that holds the car’s current speed.
 * In addition, the class should have the following constructor 
 * and other methods.
 * Constructor. The constructor should accept the car’s year model
 * and make as arguments. These values should be assigned to the 
 * object’s yearModel and make fields. The constructor should also 
 * assign 0 to the speed field.    
 * Accessors. Appropriate accessor methods should get the values stored
 * in an object’s yearModel, make, and speed fields.
 * accelerate. The accelerate method should add 5 to the 
 * speed field each time it is called.
 * brake. The brake method should subtract 5 from the speed field
 * each time it is called.
 * Demonstrate the class in a program that creates a Car object, and then 
 * calls the accelerate method five times. After each call to the accelerate 
 * method, get the current speed of the car and display it. 
 * Then call the brake method five times. After each call to the brake method,
 * get the current speed of the car and display it.
 * 
 **/

public class CarClass {

	public static void main(String[] args) {
		
		//Create Object
		Car car1 = new Car(2022, "MODEL S");
		
		//Output Formatting
		System.out.println("You are Traveling "+ car1.getSpeed()+ " MPH");
		
		//For-Loop To Accelerate 5 Times
		for(int i = 0; i < 5; i++) { 
			car1.accelerate();
			System.out.println("Car Accelerated! You are Traveling "
								+ car1.getSpeed()+ " MPH");
		}
		//Output Formatting
		System.out.println("------------------------------------------");
		
		//For-Loop To Break 5 Times
		for(int j = 0; j < 5; j++) { 
			car1.brake();
			System.out.println("Car is Braking ! You are Traveling "
								+ car1.getSpeed()+ " MPH");
		}
	}
}

class Car { 
	// Fields 
	private int yearModel; 
	private String make; 
	private int speed; 
	
	/**
	 * This constructor takes the car’s year model and make as arguments.
	 * Assigns speed To 0; 
	 * @param ym Year Model
	 * @param m	 Make
	 */
	Car(int ym, String m) {  
		
		this.yearModel = ym; 
		this.make = m;
		this.speed = 0;
	}

	//Getters
	public int getYearModel() {
		return yearModel;
	}


	public String getMake() {
		return make;
	}
	

	public int getSpeed() {
		return speed ;
	}
	
	//Setters
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int accelerate() { 
		speed += 5;
		return speed ;
	}
	
	public int brake() {
		speed -= 5;
		return speed;
	}
}
