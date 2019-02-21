/**
 * @author Abel Acosta
 * @author Saul Hernandez
 * Feb 21 2019
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// Items customer wants to order
		ArrayList<DessertItem> items = new ArrayList<DessertItem>();
      
      //create Cookie objects
      Cookie defCookie = new Cookie();
		Cookie chocoCookie = new Cookie("ChocolateChip", 10, 499, 500);
      Cookie sugarCookie = new Cookie("Sugar", 15, 429, 550);
      
      //make ArrayList of cookies to test Cookie toString() methods
      ArrayList<DessertItem> cookies = new ArrayList<>();
      cookies.add(defCookie);
      cookies.add(chocoCookie);
      cookies.add(sugarCookie);
      test("COOKIES", cookies);
      
      //create Candy instances including default to test
      Candy defCandy = new Candy();
		Candy worms = new Candy("Sour Worms", 0.5, 549, 300);
      Candy gummies = new Candy("Gummy Bears", .25, 599, 275);
      
      //make ArrayList of candies to test Candy toString() methods
      ArrayList<DessertItem> candies = new ArrayList<>();
      candies.add(defCandy);
      candies.add(worms);
      candies.add(gummies);
      test("CANDY", candies);
      
      //create IceCream instances including default to test
      IceCream defIce = new IceCream();
		IceCream vanilla = new IceCream("Vanilla", 199, 160);
      IceCream strawberry = new IceCream("Strawberry", 199, 160);
      
      //make ArrayList of ice cream to test Ice Cream toString() methods
      ArrayList<DessertItem> ice = new ArrayList<>();
      ice.add(defIce);
      ice.add(vanilla);
      ice.add(strawberry);
      test("ICE CREAM", ice);
      
      //create Sundae instances including default to test
      Sundae defSundae = new Sundae();
		Sundae fudge = new Sundae("Vanilla", "Fudge", 199, 50, 300);
      Sundae split = new Sundae("BananaSplit", "Strawberries", 399, 75, 400);
      
      //make ArrayList of sundaes to test Sundae toString() methods
      ArrayList<DessertItem> sundaes = new ArrayList<>();
      sundaes.add(defSundae);
      sundaes.add(fudge);
      sundaes.add(split);
      test("SUNDAES", sundaes);
		
      //add nondefault objects to ArrayList to test displaying the receipt
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
      
      //System.out.println(max((DessertItem)sugarCookie, (DessertItem)chocoCookie).getName());
      
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
   
   private void printComparisons(DessertItem a, DessertItem b) {
      //TODO make max() method work and compare a and b to see which has the higher calories
   }
}
