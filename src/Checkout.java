import java.util.ArrayList;

/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Checkout {
	
	private ArrayList<DessertItem> items;
	private double tax;
	
	public Checkout() {
		items = new ArrayList<DessertItem>();
	}
	
	// Enters item
	public void enterItem(DessertItem item) {
		items.add(item);
	}
	
	// Clears cash register
	public void clear() {
		//TODO: Clear cash register
	}
	
	// Returns number of items
	public int numberOfItems() {
		return items.size();
	}
	
	// Get sub total (before tax)
	public double totalCost() {
		//TODO: Return sub total of items
		return 0;
	}
	
	// Returns tax rate for this purchase
	public double getTaxRate() {
		//TODO: Return tax - Note: The tax should be rounded to the nearest cent
		return 0;
	}
	
	public void setTaxRate(double t) {
		tax = t;
	}
	
	// Returns total tax on items in cents
	public int totalTax() {
		//TODO
		return 0;
	}
	
	//  Returns a String representing a receipt for the current list of items
	public String toString() {
		//TODO
		return null;
	}
	
}
