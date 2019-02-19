import java.util.ArrayList;

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
		
		// Create checkout object
		Checkout checkout = new Checkout();
		checkout.setTaxRate(0.09);
		
		// Enter items to checkout
		for(DessertItem item : items) {
			checkout.enterItem(item);
		}
		
		// Print receipt
		System.out.println(checkout);
	}

}
