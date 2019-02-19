/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Cookie extends DessertItem {
	
	// Number of cookies
	private int numberOfCookies;
	// Price per dozen
	private double pricePerDoz;
	// Calories of cookie
	private int calories;
	
	// Constructor
	public Cookie() {
		name = "Cookie";
	}
	
	// Return cost of cookie
	@Override
	public double getCost() {
		return numberOfCookies/12 * pricePerDoz;
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
