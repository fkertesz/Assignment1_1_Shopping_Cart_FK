/**
 * Interface for defining Item ADT.
 * @author Fanni Kertesz
 * @version 08/31/23
 */
public interface ItemInterface
{
	/**
	 * setter for new item name
	 * @param  name: new item name
	 */
	public void setName(String name);
	
	/**
	 * setter for new price
	 * @param price: new price
	 */
	public void setPrice(double price);
	
	/**
	 * getter for current name
	 * @return current name
	 */
	public String getName();
	
	/**
	 * getter for current price
	 * @return current price
	 */
	public double getPrice();


}//end interface