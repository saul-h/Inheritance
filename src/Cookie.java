/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Cookie extends DessertItem {
	
   //number of cookies
   private int quantity;
   //price per dozen
   private double price;
   
/**
 * Default constructor for Cookie class
 */
   public Cookie() {
      quantity = 0;
      price = 0.0;
   }
/**
 * Initializes Cookie data
 */
   public Cookie(String name, int quantity, double price) {
      super.name = name;
      this.quantity = quantity;
      this.price = price;
   }
   
   @Override
	public double getCost() {
		return ((double) quantity / 12) * price;
	}
}
