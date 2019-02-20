/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Sundae extends IceCream {

   // Cost of ice cream topping
	private int costOfTopping;
   // Name of topping Sundae comes with
	private String topping;
/**
 * Default constructor for Sundae class.
 */
	public Sundae() {
		super.name = "";
      this.costOfTopping = 0;
      this.topping = "";
	}

/**
 * Constructs a Sundae item with the specified name of Sundae, type of topping,
 * cost of IceCream, cost of topping and the amount of calories.
 * @param name Name/flavor of Sundae
 * @param topping Topping on Sundae
 * @param cost Cost of Ice Cream in cents
 * @param costOfTopping Cost of toppings in cents
 * @param calories Total amount of Calories in Sundae
 */
   public Sundae(String name, String topping, int cost, int costOfTopping, int calories) {
      super.name = name + "(Sundae)";
      this.topping = topping + "(Topping)";
      this.cost = cost;
      this.costOfTopping = costOfTopping;
      super.calories = calories;
   }
	
/**
 * Returns the cost of this Sundae item
 * @return Cost of this Sundae in dollar and cents
 */
	public double getCost() {
		double c = super.getCost() + (double)costOfTopping / 100;
		// Round to nearest cent
		c = Math.round(c * 100.0f);
		return c/100.0f;
	}
/**
 * Return a string formatted for a receipt
 * @return String with Sundae name, topping and price formatted for receipt
 */
   @Override
   public String toString() {
      String lineItem = "";
      lineItem += super.name + " with \n";
      lineItem += String.format("%-25s%9.2f%n", this.topping, this.getCost());
      return lineItem;
   }
}
