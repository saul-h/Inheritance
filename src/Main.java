import java.util.ArrayList;
import java.util.Collections;

/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Main {

	public static void main(String[] args) {
		// Items customer wants to order
		ArrayList<DessertItem> items = new ArrayList<DessertItem>();
		Cookie cookie = new Cookie("Chocolate Chip", 10, 499, 500);
		Candy candy = new Candy("Snickers", 0.5, 549, 214);
		IceCream iceCream = new IceCream("Vanilla", 199, 60);
		Sundae sundae = new Sundae("Hot caramel", 199, 50, 100);
		items.add(cookie);
		items.add(candy);
		items.add(iceCream);
		items.add(sundae);
		
		// TODO: Print item information
		/* Example:
		 	COOKIE TEST:
			0 @ 0.0 /dz.
			                             0.00
			
			17 @ 4.99 /dz.
			ChocChip(Cookie)             7.07
			
			ChocChip(Cookie) calories:250
			
			15 @ 3.99 /dz.
			Oatmeal(Cookie)              4.99
			
			Oatmeal(Cookie) calories:240
		 */
		
		// Create checkout object
		Checkout checkout = new Checkout();
		checkout.setTaxRate(0.09);
		
		// Enter items to checkout
		for(DessertItem item : items) {
			checkout.enterItem(item);
		}
		
		// Print receipt
		System.out.println(checkout);
		
		// TODO: Max Test With Same DessertItem
		
		// TODO: Max Test With Different DessertItem Types

		System.out.println("The unsorted DessertList is: ");
		for(DessertItem item: items) {
			System.out.println(item + " has " + item.getCalories() + " calories.");
		}
		System.out.println("--------------------------------------------");
		
		Collections.sort(items);
		System.out.println("The sorted DessertList is: ");
		for(DessertItem item: items) {
			System.out.println(item + " has " + item.getCalories() + " calories.");
		}
		System.out.println("--------------------------------------------");
	}

}
