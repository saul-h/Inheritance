/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public abstract class DessertItem implements Comparable<DessertItem>{

  protected String name;
  protected int calories;

/**
 * Null constructor for DessertItem class
 */
  public DessertItem() {
	  this("");
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
  
  public String toString() {
	  return name;
  }
  
  public int getCalories() {
     return calories;
  }

}