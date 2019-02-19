/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class IceCream extends DessertItem {
	
	// Cost of ice cream
	private int cost;
	// Calories of ice cream
	private int calories;
	
	// Constructor
	public IceCream() {
		name = "Ice Cream";
	}
	
	// Return cost of ice cream
	@Override
	public double getCost() {
		return cost;
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