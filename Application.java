/**
 * Class for testing ShoppingCart class and its methods
 * @author Fanni Kertesz
 * @version 9/13/23
 */
public class Application
{
	public static void main(String[] args)
	{
		//creating Items
		Item broccoli = new Item("Broccoli", 0.49);
		Item rice = new Item("Rice", 3.59);
		Item salmon = new Item("Salmon", 11.69);
		Item mayo = new Item("Mayonnaise", 2.09);
		Item tea = new Item("Tea", 2.99);
		
		//creating a shopping cart
		ShoppingCart cart = new ShoppingCart();
		
		//testig add, remove, and printCart
		cart.add(broccoli, 1);
		cart.add(rice, 1);
		cart.add(salmon, 1);
		cart.add(mayo, 1);
		cart.add(tea, 3);
		
		cart.printCart();
		
		//testing add and remove
		cart.add(broccoli, 2);
		cart.remove(tea, 1);
		
		cart.printCart();
		
		//testing totalItems, totalPrice, isEmpty, countItem, and checkForItem
		System.out.println("Total Items: " + cart.totalItems());
		System.out.println("Total Price: " + cart.totalPrice());
		System.out.println("Shopping cart empty: " + cart.isEmpty());
		System.out.println("Number of broccolis: " + cart.countItem(broccoli));
		System.out.println("Tea is in the cart: " + cart.checkForItem(tea));
		
		//clearing cart and testing clear and isEmpty
		cart.clear();
		cart.printCart();
		System.out.println("Shopping cart empty: " + cart.isEmpty());
	
		
	}//end main
}//end class
