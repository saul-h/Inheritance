/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Candy extends DessertItem{
	
	// Weight of the candy (lbs)
	private double weight;
	// Price per pound (in cents)
	private int pricePerPound;
	// Calories of candy
	private int calories;
	
	// Constructor
	public Candy() {
		name = "Candy";
	}
	
	// Return cost of candy
	@Override
	public double getCost() {
		// Multiply by 100 to convert to dollars
		double c = weight * pricePerPound * 100.0f;
		// Round to nearest cent
		c = Math.round(c * 100.0f);
		return c/100.0f;	// Return in dollars
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
