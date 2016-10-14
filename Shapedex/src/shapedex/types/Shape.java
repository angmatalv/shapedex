package shapedex.types;

/**
 * Shape class for Shapedex.
 * 
 * @author Angel Mate
 * @version 2016-10-10
 *
 */

public class Shape {

	/*
	 * ATTRIBUTES
	 */

	/**
	 * Name of the shape.
	 */

	private String name;

	/**
	 * Elemental affinity of the shape (ARCANE, ICE, FIRE)
	 */

	private String element;

	/**
	 * Rarity of the shape: COMMON, PASSIVE_LEGENDARY, LEGENDARY
	 */

	private String rarity;

	/*
	 * CONSTRUCTOR
	 */

	/**
	 * Constructor for the Shape class.
	 * 
	 * @param name
	 *            Initial name of the shape.
	 * @param element
	 *            Element associated to the shape.
	 * @param rarity
	 *            Rarity of the shape.
	 */

	public Shape(String name, String element, String rarity) {
		this.name = name;
		this.element = element;
		this.rarity = rarity;
	}

	/*
	 * GETTERS AND SETTERS
	 */

	/**
	 * @return The current name of the shape.
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The new name of the shape.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The current element of the shape.
	 */

	public String getElement() {
		return element;
	}

	/**
	 * @param element
	 *            The new element of the shape.
	 */

	public void setElement(String element) {
		this.element = element;
	}

	/**
	 * @return The current rarity of the shape.
	 */

	public String getRarity() {
		return rarity;
	}

	/**
	 * @param rarity
	 *            The new rarity of the shape.
	 */

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	/*
	 * TOSTRING
	 */

	@Override
	public String toString() {
		return "Shape [name=" + name + ", element=" + element + ", rarity=" + rarity + "]";
	}

}
