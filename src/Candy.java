/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Candy extends DessertItem{
	
	// Weight of the candy (lbs)
	private double weight;
	// Price per pound
	private double pricePerPound;
   
/**
  * Default Candy constructor
  */
   public Candy() {
      weight = 0;
      pricePerPound = 0.0;
   }
   
/**
  * Initialize Candy data
  */
   public Candy(String name, double weight, double pricePerPound) {
      super.name = name;
      this.weight = weight;
      this.pricePerPound = pricePerPound;
   }
	
	@Override
	public double getCost() {
		return weight * pricePerPound;
	}
}
