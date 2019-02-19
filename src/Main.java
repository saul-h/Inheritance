/*
 * Abel Acosta
 * Purpose: This program demonstrates the use of inheritance, polymorphism, and interfaces.
 */

public class Main {

	public static void main(String[] args) {
   
      //testing Cookie class feel free to delete and change
		Cookie c = new Cookie();
      System.out.println("Name " + c.getName());     
      System.out.println("$ " + c.getCost());
      Cookie w = new Cookie("White Choc Mac Nut", 6, 7.99);
      System.out.println("Name " + w.getName());     
      System.out.println("$ " + w.getCost());
	}

}
