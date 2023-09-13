/**
 * Interface for defining ShoppingCart ADT.
 * @author Fanni Kertesz
 * @version 08/31/23
 */
public interface ShoppingCartInterface<T>
{
	/**
	 * sums total number of items in cart
	 * @return total number of items
	 */
	public int totalItems();
	
	/**
	 * sums total price of items in cart
	 * @return total price of items
	 */
	public double totalPrice();
	
	/**
	 * checks if cart is empty
	 * @return true if empty, false if not empty
	 */
	public boolean isEmpty();
	
	/**
	 * adds a new item to the cart
	 * @param item: Item object added
	 * @param number: number of item added
	 */
	public void add(Item item, int number);
	
	/**
	 * removes a certain number of a certain item from the cart
	 * @param item to be removed
	 * @param number of items to be removed
	 */
	public void remove(Item item, int number);
	
	/**
	 * clears the cart so it's empty
	 */
	public void clear();
	
	/**
	 * counts how many of a certain item is in the cart
	 * @param item to be counted
	 * @return number of the item
	 */
	public int countItem(Item item);
	
	/**
	 * checks if an item is in the cart
	 * @param item to be checked
	 * @return true it is in cart, false if it isn't in cart
	 */
	public boolean checkForItem(Item item);
	
	/**
	 * prints out the contents of the cart formatted nice to
	 * the system's output (screen)
	 */
	public void printCart();

}//end interface
