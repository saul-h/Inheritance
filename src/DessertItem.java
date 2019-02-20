/*
 * @author Abel Acosta
 * @author Saul Hernandez
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
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
     * first item is returned.
     */
    public static DessertItem max(DessertItem item1, DessertItem item2) {
        if (item1.compareTo(item2) > 0) {
            return item1;
        } else if (item1.compareTo(item2) < 0) {
            return item2;
        }
        return item1; //item and item2 are equal in calories
    }

    /**
     * Returns the amount of calories in this item subtracted by
     * the amount of calories in DessertItem o. Used to make comparison.
     * @param o DessertItem being compared to this DessertItem
     * @return The amount of calories in this DessertItem subtracted
     * from the amount of calories in the argument (DessertItem)
     */
    public int compareTo(DessertItem o) {
        return calories - o.getCalories();
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
     * Returns the name of the dessert
     */
    public String toString() {
        return name;
    }
   
   /**
    * Returns the amount of calories in this DessertItem
    * @return the amount of calories in this DessertItem
    */
   public int getCalories() {
       return calories;
   }
}
