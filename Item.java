/**
 * Item class implementing the Item ADT.
 * @author Fanni Kertesz
 * @version 9/7/23
 */
public class Item implements ItemInterface
{
	private String name;//variable storing name
	private double price;//variable storing the price
	
	/**
	 * empty argument constructor
	 */
	public Item()
	{
		name = "";
		price = 0;
	}//end constructor
	
	/**
	 * preferred argument constructor
	 * @param name of the item
	 * @param price of the item
	 */
	public Item(String name, double price)
	{
		this.name = name;
		this.price = price;
	}//end class
	
	/**
	 * @param  name: new item name
	 */
	public void setName(String name)
	{
		this.name = name;
	}//end setName

	/**
	 * @param price: new price
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}//end setPrice

	/**
	 * @return current name
	 */
	public String getName()
	{
		return name;
	}//end getName

	/**
	 * @return price: current price
	 */
	public double getPrice()
	{
		return price;
	}//end getPrice

}//end class