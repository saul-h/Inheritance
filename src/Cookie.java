/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Cookie extends DessertItem {
	
   
/**
 * Initializes Cookie data
 */
   public Cookie(int quantity, double price) {
      super.name = "Cookie";
      this.quantity = quantity;
      this.price = price;
}
	// Number of cookies
	private int quantity;
	// Price per dozen (in cents)
	private int pricePerDoz;
	// Calories of cookie
	private int calories;
	
	// Constructor
	public Cookie() {
		name = "Cookie";
    quantity = 0;
    price = 0.0;
	}
	
	// Return cost of cookie
	@Override
	public double getCost() {
		// Multiply by 100 to convert to dollars
		double c = numberOfCookies/12 * pricePerDoz * 100.0f;
		// Round to nearest cent
		c = Math.round(c*100.0f);
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
