/**
 * @author Abel Acosta
 * @author Saul Hernandez
 * Feb 21 2019
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */
 
/**
 * This is the DessertItem class. It serves as the parent class
 * to the IceCream, Cookie, Sundae, and Candy classes. It has
 * name and calories attribute
 */
public abstract class DessertItem implements Comparable<DessertItem> {

   //all dessert items have a name
   protected String name;
   //all dessert items have calories
   protected int calories;

   /**
    * Returns the item which is greater in calories.
    * @param item1 first DessertItem
    * @param item2 second DessertItem
    * @return the DessertItem with the highest calories. If
    * the two items have the same amount of calories then the
    * first parameter item is returned.
    */
   public static DessertItem max(DessertItem item1, DessertItem item2) {
      if (item1.compareTo(item2) > 0) {
         return item1;
      } else if (item1.compareTo(item2) < 0) {
         return item2;
      }
      return item1; //item1 and item2 are equal in calories
   }
  
   /**
    * Returns the amount of calories in this item subtracted by
    * the amount of calories in DessertItem o. Used to make comparison.
    * @param o DessertItem being compared to this DessertItem
    * @return The amount of calories in this DessertItem subtracted
    * from the amount of calories in the argument (DessertItem)
    */
   public int compareTo(DessertItem o) {
      return this.calories - o.getCalories();
   }

   /**
    * Null constructor for DessertItem class
    */
   public DessertItem() {
      this("");
      this.calories = 0;
   }

   /**
    * Initializes DessertItem data
    */
   public DessertItem(String name) {
      this.name = name;
   }

   /**
    * Returns name of DessertItem
    * @return name of DessertItem
    */
   public final String getName() {
      return name;
   }

   /**
    * Returns cost of DessertItem
    * @return cost of DessertItem
    */
   public abstract double getCost();

   /**
    * Returns the name and amount of calories of the dessert
    * @return dessert name and amount of calories
    */
   public String toString() {
      return this.name + " Calories: " + this.calories;
   }
  
  /**
   * Returns the amount of calories in this DessertItem
   * @return the amount of calories in this DessertItem
   */
   public int getCalories() {
      return calories;
   }
}
