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
      
      //create Cookie objects
      Cookie defCookie = new Cookie();
		Cookie chocoCookie = new Cookie("ChocolateChip", 10, 499, 500);
      Cookie sugarCookie = new Cookie("Sugar", 15, 429, 550);
      
      ArrayList<DessertItem> cookies = new ArrayList<>();
      cookies.add(defCookie);
      cookies.add(chocoCookie);
      cookies.add(sugarCookie);
      test("COOKIES", cookies);
      
      Candy defCandy = new Candy();
		Candy worms = new Candy("Sour Worms", 0.5, 549, 300);
      Candy gummies = new Candy("Gummy Bears", .25, 599, 275);
      
      ArrayList<DessertItem> candies = new ArrayList<>();
      candies.add(defCandy);
      candies.add(worms);
      candies.add(gummies);
      test("CANDY", candies);
      
      IceCream defIce = new IceCream();
		IceCream vanilla = new IceCream("Vanilla", 199, 160);
      IceCream strawberry = new IceCream("Strawberry", 199, 160);
      
      ArrayList<DessertItem> ice = new ArrayList<>();
      ice.add(defIce);
      ice.add(vanilla);
      ice.add(strawberry);
      test("ICE CREAM", ice);
      
      Sundae defSundae = new Sundae();
		Sundae fudge = new Sundae("Vanilla", "Fudge", 199, 50, 300);
      Sundae split = new Sundae("BananaSplit", "Strawberries", 399, 75, 400);
      
      ArrayList<DessertItem> sundaes = new ArrayList<>();
      sundaes.add(defSundae);
      sundaes.add(fudge);
      sundaes.add(split);
      test("SUNDAES", sundaes);
		
		items.add(chocoCookie);
		items.add(sugarCookie);
		items.add(worms);
      items.add(gummies);
		items.add(vanilla);
		items.add(strawberry);
		items.add(fudge);
		items.add(split);

				
		// Create checkout object
		Checkout checkout = new Checkout();
		checkout.setTaxRate(0.09);
		
		// Enter items to checkout
		for(DessertItem item : items) {
			checkout.enterItem(item);
		}
		
		// Print receipt
      System.out.println("--------------------------------------------");
		System.out.println(checkout);
		
		// TODO: Max Test With Same DessertItem
      //printComparisons((DessertItem)sugarCookie, (DessertItem)chocoCookie);
      //System.out.println(max(sugarCookie, chocoCookie).getName());
      
		// TODO: Max Test With Different DessertItem Types

		System.out.println("The unsorted DessertList is: ");
		for(DessertItem item: items) {
			System.out.println(item.getName() + " has " + item.getCalories() + " calories.");
		}
		System.out.println("--------------------------------------------");
		
		Collections.sort(items);
		System.out.println("The sorted DessertList is: ");
		for(DessertItem item: items) {
			System.out.println(item.getName() + " has " + item.getCalories() + " calories.");
		}
		System.out.println("--------------------------------------------");
	}
   
   private static void test(String testType, ArrayList<DessertItem> d) {
      System.out.println("--------------------------------------------");
      System.out.println(testType + " TEST: \n");
      for (DessertItem i: d) {
         System.out.println(i.toString() + "Calories: " + i.getCalories() + "\n");
      }
   }
   
   private static void printComparisons(DessertItem a, DessertItem b) {
      //TODO 
   }
}
