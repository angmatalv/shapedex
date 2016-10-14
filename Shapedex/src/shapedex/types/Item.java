package shapedex.types;

/**
 * Item class for ShapeDex. Every item in the game will inherit this class.
 * 
 * @author Angel Mate
 * @version 2016-10-14
 */

public class Item {

	/**
	 * Name of the Item.
	 */

	private String name;

	/**
	 * Type of the Item.
	 */

	private String type;

	/**
	 * The price the player will have to pay for this item at a store.
	 */

	private int buyValue;

	/**
	 * The price the player can sell this item for at a store.
	 */

	private int sellValue;

	/**
	 * Constructor for the Item class.
	 * 
	 * @param name
	 *            Name of the Item.
	 * @param type
	 *            Type of the Item.
	 * @param buyValue
	 *            The price the player will have to pay for this item at a
	 *            store.
	 * @param sellValue
	 *            The price the player can sell this item for at a store.
	 */

	public Item(String name, String type, int buyValue, int sellValue) {
		super();
		this.name = name;
		this.type = type;
		this.buyValue = buyValue;
		this.sellValue = sellValue;
	}

	/**
	 * @return The current name of the item.
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The new name of the item.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The current type of the item.
	 */

	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            The new type of the item.
	 */

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return The current price this item can be bought for.
	 */

	public int getBuyValue() {
		return buyValue;
	}

	/**
	 * @param buyValue
	 *            The new price this item can be bought for.
	 */

	public void setBuyValue(int buyValue) {
		this.buyValue = buyValue;
	}

	/**
	 * @return The current price this item can be sold for.
	 */

	public int getSellValue() {
		return sellValue;
	}

	/**
	 * @param sellValue
	 *            The new price this item can be sold for.
	 */

	public void setSellValue(int sellValue) {
		this.sellValue = sellValue;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", type=" + type + ", buyValue=" + buyValue + ", sellValue=" + sellValue + "]";
	}

}
