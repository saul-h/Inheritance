/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class IceCream extends DessertItem {
	
	// Cost of ice cream (in cents)
	protected int cost;
	
	// Constructor
	public IceCream() {
		name = "Ice Cream";
	}
	
	public IceCream(int cost) {
		name = "Ice Cream";
		this.cost = cost;
	}
   
   public IceCream(String name, int cost, int calories)
   {
      super.name = this.name + "(IceCream)";
      this.cost = cost;
      super.calories = calories;
   }
	
	// Return cost of ice cream
	@Override
	public double getCost() {
		// Multiply by 100 to convert into dollars
		double c = cost / 100.0f;
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