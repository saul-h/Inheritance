/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Cookie extends DessertItem {
	
   
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
		pricePerDoz = 0;
	}
	
	public Cookie(int quantity, int price) {
	      super.name = "Cookie";
	      this.quantity = quantity;
	      this.pricePerDoz = price;
	}
   
   public Cookie(String name, int quantity, int price, int calories) {
      super.name = name + "(Cookie)";
      this.quantity = quantity;
      this.price = price;
      super.calories = calories;
   }
	
	// Return cost of cookie
	@Override
	public double getCost() {
		double q = (double)quantity / 12.0f;
		double p = (double)pricePerDoz;
		// Multiply by 100 to convert to dollars
		double c = (q * p / 100.0f);
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
