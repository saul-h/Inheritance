/*
 * Abel Acosta
 * Saul Hernandez
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
	
	public Sundae(int c, int t) {
		name = "Sundae";
		cost = c;
		this.costOfTopping = t;
	}
   
   public Sundae(String name, int c, int t, int calories) {
      super.name = name + "(Sundae)";
      this.cost = c;
      this.costOfTopping = t;
      super.calories = calories;
   }
	
	// Return cost of sundae
	public double getCost() {
		double c = super.getCost() + (double)costOfTopping / 100;
		// Round to nearest cent
		c = Math.round(c * 100.0f);
		return c/100.0f;
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
