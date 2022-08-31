/**@author Blaze R. Wheeler
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 397 Problem 4: Retail Item Class
 * 
 * @Description Write a class named RetailItem that holds data about an 
 * item in a retail store. The class should have the following fields:
 * description. The description field references a String object that 
 * holds a brief description of the item.
 * nitsOnHand. The unitsOnHand field is an int variable that holds the
 * number of units currently in inventory.
 * price. The price field is a double that holds the item’s retail price.
 * Write a constructor that accepts arguments for each field, 
 * appropriate mutator methods that store values in these fields, 
 * and accessor methods that return the values in these fields. 
 * Once you have written the class, write a separate program 
 * that creates three RetailItem objects and stores 
 * the following data in them: 
 * 						Description		Units On Hand	Price
 * 			------------------------------------------------------   
 * 			Item #1 	Jacket			12				59.95
 * 			Item #2		Jeans			40			    34.95
 * 		 	Item #3		Shirt			20			    24.95
 */


public class RetailItemClass {

	public static void main(String[] args) {
		
		// Create Item Objects
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		
		RetailItem item2 = new RetailItem("Jeans", 40, 34.95);
		
		RetailItem item3 = new RetailItem("Shirt", 20,  24.95);
		
		//Output Table Formatting 
		System.out.println("\t\tDescription\tUnits on Hand\tPrice");
		System.out.println("-------------------------------------------------------");
		
		//Output Item 1
		System.out.print("Item #1 " );
		item1.display();
		
		//Output Item 2
		System.out.print("Item #2 " );
		item2.display();
		
		//Output Item 3
		System.out.print("Item #3 " );
		item3.display();
	}
}

class RetailItem { 
	// Fields
	private String description; 
	private int unitsOnHand; 
	private double price; 
	
	/**
	 * Constructor that accepts arguments for each field
	 * @param desc Item Description
	 * @param units Unit(s) Of Item(s) On Hand
	 * @param p Price Of Item
	 */
	
	RetailItem(String desc, int units, double p) { 
		this.description = desc; 
		this.unitsOnHand = units;
		this.price = p;
	}

	public String getDescription() {
		return description;
	}
	/**
	 * Description Getter
	 * @return description Description Of Item 
	 */
	/**
	 * Description Setter
	 * @param description Description Of Item 
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Units On Hand Getter
	 * @return unitsOnHand Units Of Item On Hand
	 */
	
	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	/**
	 * Units On Hand Setter
	 * @param unitsOnHand Units Of Item On Hand
	 */
	
	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}
	
	/**
 	* Price Getter
 	* @return price Item Price
 	*/
	
	public double getPrice() {
		return price;
	}
	
	/**
	 * Price Setter
	 * @param price Item Price
	 */
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Prints All Oject's Fields In Table Format
	 */
	
	public void display() { 
		System.out.println("\t" + description + "\t\t" + unitsOnHand 
								  + "\t\t" +"$" + price); 
	}
}
