/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Candy extends DessertItem{
	
	// Weight of the candy (lbs)
	private double weight;
	// Price per pound
	private double pricePerPound;
	
	@Override
	public double getCost() {
		return weight * pricePerPound;
	}
}
