package Chris;


// TODO: Auto-generated Javadoc
/**
 * The Class SaleItem.
 * @author Chris
 * 
 */
public class SaleItem {
	
	/** The item. */
	public static String item;
	
	/** The price. */
	public static String price;
	
	/** The amount. */
	public static String amount;
	
	/**
	 * Instantiates a new sale item.
	 *
	 * @param item the item
	 * @param price the price
	 * @param amount the amount
	 */
	public SaleItem(String item, String price, String amount) {
		this.item = item;
		this.price = price;
		this.amount = amount;
	}

	/**
	 * Gets the item.
	 *
	 * @return the item
	 */
	public static String getItem() {
		return item;
	}

	/**
	 * Sets the item.
	 *
	 * @param item the new item
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public static String getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public static String getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
