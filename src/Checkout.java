import java.util.ArrayList;

/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Checkout {
	
   //used to store checked out items
	private ArrayList<DessertItem> items;
   //stores tax rate
	private double tax;
	
   /**
    * Constructs a new checkout object with an empty ArrayList of the
    * type DessertItems
    */
	public Checkout() {
		items = new ArrayList<DessertItem>();
	}
	
	/**
    * Adds the DessertItem into the ArrayList in this Checkout class
    * @param item The DessertItem to be added
    */
	public void enterItem(DessertItem item) {
		items.add(item);
	}
	
   /**
    * Clears the ArrayList in this Checkout class
    */
	public void clear() {
		int size = items.size();
		for(int i = 0; i < size; i++) {
			items.remove(0);
		}
	}
	
	/**
    * Returns the number of items in the ArrayList in this
    * Checkout class
    * @return number of items in the ArrayList in this Checkout
    * class
    */
	public int numberOfItems() {
		return items.size();
	}
	
   /**
    * Return the before tax subtotal of all the items in this
    * Arraylist
    * @return The subtotal (before tax) amount in dollars
    * of the items in this ArrayList
    */
	public double totalCost() {
		double total = 0.0f;
		for(DessertItem item: items) {
			total += item.getCost();
		}
		return total;
	}
	
	/**
    * Returns the tax rate
    * @return the tax rate
    */
	public double getTaxRate() {
		return tax;
	}
	
   /**
    * Sets the tax rate
    * @param tax rate (as a decimal for example 9% would be 0.09)
    */
	public void setTaxRate(double t) {
		tax = t;
	}
	
   /**
    * Returns the total tax on items
    * @return the tax on items (in cents)
    */
	public int totalTax() {
		return (int)(tax * totalCost() * 100.0f);
	}
	
   /**
    * Returns a String formatted as a receipt with each items attributes
    * (except calories) listed as well as the tax and total cost in dollars
    * and cents
    * @return a String representing a receipt for the current list of items
    */
	public String toString() {
		String info = 	"Number of items: " + items.size() + "\n" +
						String.format("Total Cost: %.2f%n", totalCost()) +
						"Total Tax: " + (double)totalTax()/100.0 + "\n" + 
						String.format("Cost + Tax: %.2f%n%n", (totalCost() + (totalTax() / 100.0)));
		String title = "A & S Dessert Shoppe\n"+"--------------------\n";
		String body = "";
		for(DessertItem item: items) {
			body += item.toString();
         body += "\n";
		}
      String footer = String.format("%-25s%9.2f%n", "Subtotal", totalCost());
		footer += String.format("%-25s%9.2f%n","Tax", totalTax() / 100.0f);
		footer += String.format("%-25s%9.2f%n","Total Cost", totalCost() + totalTax()/100.0f);
		return info+title+body+footer;
	}

}
