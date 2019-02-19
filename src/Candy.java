/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Candy extends DessertItem{
	
	// Weight of the candy (lbs)
	private double weight;
	// Price per pound
	private double pricePerPound;
	// Calories of candy
	private int calories;
	
	// Constructor
	public Candy() {
		name = "Candy";
	}
	
	// Return cost of candy
	@Override
	public double getCost() {
		return weight * pricePerPound;
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
