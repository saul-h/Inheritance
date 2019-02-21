/**
 * @author Abel Acosta
 * @author Saul Hernandez
 * Feb 21 2019
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */
public class IceCream extends DessertItem {
	
	// Cost of ice cream (in cents)
	protected int cost;
	
/**
 * Default constructor for IceCream class
 */
	public IceCream() {
      this.cost = 0;
	}
	
/**
 * Constructs an IceCream object with the name, cost and calories.
 * @param name Flavor of Ice Cream
 * @param cost Cost of Ice Cream in cents
 * @param calories Total calories in Ice Cream item
 */
   public IceCream(String name, int cost, int calories)
   {
      super.name = name + "(IceCream)";
      this.cost = cost;
      super.calories = calories;
   }
	
/**
 * This returns the cost of this Ice Cream item.
 * @return The cost of the item in dollars and cents
 */
	@Override
	public double getCost() {
		// Multiply by 100 to convert into dollars
		double c = cost / 100.0f;
		// Round to nearest cent
		c = Math.round(c*100.0f);
		return c / 100.0f;
	}
   
/**
 * Returns a string describing this IceCream class formatted for a receipt. 
 * @return A string with the flavor/type of IceCream and the price
 */
   @Override
   public String toString() {
      String lineItem = "";
      lineItem += String.format("%-25s%9.2f%n", super.name, this.getCost());
      return lineItem;
   }
}