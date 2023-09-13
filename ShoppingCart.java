/**
 * Class for defining ShoppingCart implementing its interface.
 * @author Fanni Kertesz
 * @version 09/11/23
 */
public class ShoppingCart implements ShoppingCartInterface
{
	private ArrayBag cart;//ArrrayBag variable storing the items
	private double prices = 0.0;//variable containing the total price
	
	/**
	 * empty-argument constructor
	 */
	public ShoppingCart()
	{
		cart = new ArrayBag();
	}//end constructor
	
	/**
	 * preferred constructor
	 * @param size: preferred initial cart size
	 */
	public ShoppingCart(int size)
	{
		cart = new ArrayBag(size);
	}//end constructor
	
	/**
	 * method to get the total number of items in the cart
	 * @return number of total items
	 */
	public int totalItems()
	{
		return cart.getCurrentSize();
	}//end totalItems

	/**
	 * method to get the total price of the items in the cart
	 * @return total price
	 */
	public double totalPrice()
	{
		return prices;
	}//end totalPrice 

	/**
	 * method checks if the cart is empty
	 * @return corresponding boolean value
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}//end isEmpty

	/**
	 * method to add item(s) to the cart
	 * @param item: item to be added
	 * @param number: number of this item to be added
	 */
	@SuppressWarnings("unchecked")
	public void add(Item item, int number)
	{
		for(int i = 0; i<number; i++)
		{
			cart.add(item);
			prices += item.getPrice();
		}
	}//end add
	
	/**
	 * method to remove item(s) from the cart
	 * @param item: item to be removed
	 * @param number: number of this item to be removed
	 */
	@SuppressWarnings("unchecked")
	public void remove(Item item, int number)
	{
		for(int i = 0; i<number; i++)
		{
			cart.remove(item);
			prices -= item.getPrice();
		}
	}//end remove

	/**
	 * method removes all items from the cart
	 */
	public void clear()
	{
		cart.clear();
		prices = 0;
	}//end clear

	/**
	 * counts the frequency of an item in the cart
	 * @param item to be checked
	 * @return number of this item in the cart
	 */
	@SuppressWarnings("unchecked")
	public int countItem(Item item)
	{
		return cart.getFrequencyOf(item);
	}//end countItem

	/**
	 * checks if an item is in the cart (at least one)
	 * @param item to be checked
	 * @return true if in cart, false if not
	 */
	@SuppressWarnings("unchecked")
	public boolean checkForItem(Item item)
	{
		return cart.contains(item);
	}//end checkForItem

	/**
	 * prints the cart to the system output with item names, prices,
	 * and total items and price
	 */
	public void printCart()
	{
		Object[] arrayCart = cart.toArray();
		int n = arrayCart.length;
		
		StringBuilder sb = new StringBuilder();
		sb.append("Shopping Cart:\n");
		for(int i = 0; i<n; i++)
		{
			sb.append(((Item)arrayCart[i]).getName() + ".........$");
			sb.append(((Item)arrayCart[i]).getPrice()+ "\n");
		}
		sb.append("Total (" + n + "): $" + prices);
		System.out.println(sb);
	}//end printCart

	
}//end class