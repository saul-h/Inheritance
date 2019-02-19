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
		int size = items.size();
		for(int i = 0; i < size; i++) {
			items.remove(0);
		}
	}
	
	// Returns number of items
	public int numberOfItems() {
		return items.size();
	}
	
	// Get sub total (before tax)
	public double totalCost() {
		int total = 0;
		for(DessertItem item: items) {
			total += item.getCost();
		}
		return total;
	}
	
	// Returns tax rate for this purchase
	public double getTaxRate() {
		return tax;
	}
	
	public void setTaxRate(double t) {
		tax = t;
	}
	
	// Returns total tax on items in cents
	public int totalTax() {
		return (int)(tax * totalCost() * 100.0f);
	}
	
	//  Returns a String representing a receipt for the current list of items
	public String toString() {
		//TODO
		return null;
	}
	
}
