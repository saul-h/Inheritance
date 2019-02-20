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
	
/**
 * Default constructor for Cookie class.
 */
	public Cookie() {
		name = "";
		quantity = 0;
		pricePerDoz = 0;
	}
   
/**
 * Constructs an instance of the Cookie class with the specified name, quantity,
 * price, and calories.
 * @param name Name/type of cookie
 * @param quantity Quantity of cookies
 * @param price Price (in cents) per dozen
 * @param calories Amount of calories
 */
   public Cookie(String name, int quantity, int price, int calories) {
      super.name = name + "(Cookie)";
      this.quantity = quantity;
      this.pricePerDoz = price;
      super.calories = calories;
   }
	
/**
 * Returns the cost of this Cookie(s)
 * @return The cost of Cookie(s) in dollars and cents
 */
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
   
/**
 * 
 *  
 */
   @Override
   public String toString() {
      String lineItem = "";
      lineItem += this.quantity + String.format(" @ %.2f /dz.%n", ((double)this.pricePerDoz / 100.0));
      lineItem += String.format("%-25s%9.2f%n", super.name, this.getCost());
      return lineItem;
   }
}
