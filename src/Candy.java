/**
 * @author Abel Acosta
 * @author Saul Hernandez
 * Feb 21 2019
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */


/**
 * This is the Candy class which is a child class of the DessertItem class
 * Along with the DessertItem attributes this class has a weight and
 * price per pound attribute
 */
public class Candy extends DessertItem{
	
	// Weight of the candy (lbs)
	private double weight;
	// Price per pound (in cents)
	private int pricePerPound;
	
/**
 * Default constructor for the Candy class.
 */
	public Candy() {
		name = "";
		weight = 0;
		pricePerPound = 0;
	}
   
/**
 * Constructs and instance of the Candy class with the specified name, weight,
 * price and calories.
 * @param name Name of candy
 * @param weight Weight of candy in pounds
 * @param pricePerPound Cost per pound
 * @param calories Amount of calories
 */
   public Candy(String name, double weight, int pricePerPound, int calories)
   {
      super.name = name + "(Candy)";
      this.weight = weight;
      this.pricePerPound = pricePerPound;
      super.calories = calories;
   }
	
/**
 * Returns the cost of this Candy item
 * @return The cost of this Candy in dollars and cents
 */
	@Override
	public double getCost() {
		// Multiply by 100 to convert to dollars
		double c = weight * (double)pricePerPound / 100.0f;
		// Round to nearest cent
		c = Math.round(c * 100.0f);
		return c/100.0f;	// Return in dollars
	}
   
/**
 * Return a string describing this Candy class that is formatted for a receipt
 * @return String with Sundae name, topping and price formatted for receipt
 */
   public String toString()
   {
      String lineItem = "";
      lineItem += String.format("%.2f lbs. @ %.2f /lb.%n", this.weight, (this.pricePerPound / 100.0));
      lineItem += String.format("%-25s%9.2f%n", super.name, this.getCost());
      return lineItem;
   }
}
