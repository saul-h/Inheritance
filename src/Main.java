import java.util.ArrayList;

/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Main {

	public static void main(String[] args) {
		// Items customer wants to order
		ArrayList<DessertItem> items = new ArrayList<DessertItem>();
		items.add(new Cookie(10, 499));
		items.add(new Candy(0.5, 549));
		items.add(new IceCream(199));
		items.add(new Sundae(199, 50));
		
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
