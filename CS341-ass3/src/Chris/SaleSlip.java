package Chris;

import java.util.ArrayList;
// TODO: Auto-generated Javadoc

/**
 * The Class SaleSlip.
 *
 * @author Chris
 * 
 */
public class SaleSlip {
	
	/** The list. */
	public static ArrayList<String> list = new ArrayList<String>();
	
	/** The total. */
	public static double total;
	
	/** The price xquan. */
	public static double priceXquan;
	
	/** The Quantity. */
	public static double Quantity;
	
	/** The Price. */
	public static double Price;
	
	/** The valid. */
	public static boolean valid;
	
	/**
	 * Adds the to list.
	 *
	 * @param item the item
	 * @param price the price
	 * @param amount the amount
	 */
	public static void addToList(String item, String price, String amount) {
		valid = validCheck(item, price, amount);
		//adds item to the list
		if(valid == true) {
			SaleItem nother = new SaleItem(item, price, amount);
			Price = Double.parseDouble(SaleItem.getPrice());
			Quantity = Double.parseDouble(SaleItem.getAmount());
			priceXquan = Quantity * Price;
			list.add(SaleItem.getItem());
			list.add(String.valueOf(priceXquan));
			list.add(SaleItem.getAmount());
			total = 0;
			for (int i = 1; i <= list.size(); i += 3) {
				total += Double.parseDouble(list.get(i));
				total = round(total, 2);
			}
		}
		
	}

	/**
	 * Valid check.
	 *
	 * @param item the item
	 * @param price the price
	 * @param amount the amount
	 * @return true, if successful
	 */
	public static boolean validCheck(String item, String price, String amount) {
		valid = true; 
		if(item.contains("1")|| item.contains("2")|| item.contains("3")|| item.contains("4")|| item.contains("5")|| item.contains("6")
				||item.contains("7")|| item.contains("8")|| item.contains("9")|| item.contains("0")) {
			valid = false;
		}
		if (price.contains("a") || price.contains("b") || price.contains("c") || price.contains("d") || price.contains("e")
				|| price.contains("f") || price.contains("g") || price.contains("h") || price.contains("i")
				|| price.contains("j") || price.contains("k") || price.contains("l") || price.contains("m")
				|| price.contains("n") || price.contains("o") || price.contains("p") || price.contains("q")
				|| price.contains("r") || price.contains("s") || price.contains("t") || price.contains("u")
				|| price.contains("v") || price.contains("w") || price.contains("x") || price.contains("y")
				|| price.contains("z")) {
			valid = false;
		}
		if (amount.contains("a") || amount.contains("b") || amount.contains("c") || amount.contains("d") || amount.contains("e")
				|| amount.contains("f") || amount.contains("g") || amount.contains("h") || amount.contains("i")
				|| amount.contains("j") || amount.contains("k") || amount.contains("l") || amount.contains("m")
				|| amount.contains("n") || amount.contains("o") || amount.contains("p") || amount.contains("q")
				|| amount.contains("r") || amount.contains("s") || amount.contains("t") || amount.contains("u")
				|| amount.contains("v") || amount.contains("w") || amount.contains("x") || amount.contains("y")
				|| amount.contains("z")) {
			valid = false;
		}
		return valid;
	}
	
	/**
	 * Round.
	 *
	 * @param total the total
	 * @param holder the holder
	 * @return the double
	 */
	public static double round(double total, int holder) {
		double scale = Math.pow(10, holder);
		return Math.round(total * scale)/scale;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public static double getTotal() {
		return total;
	}

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public static ArrayList<String> getList() {
		return list;
	}
	
	/**
	 * Checks if is valid.
	 *
	 * @return true, if is valid
	 */
	public static boolean isValid() {
		return valid;
	}
	
}