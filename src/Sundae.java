/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Sundae extends IceCream{
	
	// Cost of ice cream topping
	private int costOfTopping;
	// Calories of sundae
	private int calories;
	
	// Constructor
	public Sundae() {
		name = "Sundae";
	}
	
	// Return cost of sundae
	public double getCost() {
		return super.getCost() + costOfTopping;
	}
	
	// Set calorie amount
	public void setCalories(int c) {
		this.calories = c;
	}
	
	// Return calories
	public int getCalories() {
		return this.calories;
	}
}
