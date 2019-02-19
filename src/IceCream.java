/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class IceCream extends DessertItem {
	
	// Cost of ice cream (in cents)
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
		// Multiply by 100 to convert into dollars
		double c = cost * 100.0f;
		// Round to nearest cent
		c = Math.round(c*100.0f);
		return c / 100.0f;
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