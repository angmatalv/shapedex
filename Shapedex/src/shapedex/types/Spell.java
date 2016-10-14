package shapedex.types;

/**
 * Spell class for Shapedex.
 * 
 * @author Angel Mate
 * @version 2016-10-10
 *
 */

public class Spell {

	/**
	 * Name of the spell.
	 */

	private String name;

	/**
	 * Type of the spell: FIRE, ICE, ARCANE
	 */

	private String type;

	/**
	 * Base damage dealt by the spell.
	 */

	private int baseDamage;

	/**
	 * Mana cost of the spell.
	 */

	private int manaCost;

	/**
	 * Constructor for Spell instances.
	 * 
	 * @param name
	 *            Name of the spell
	 * @param type
	 *            Type of the spell (FIRE, ICE, ARCANE)
	 * @param baseDamage
	 *            Base damage dealt by the spell
	 * @param manaCost
	 *            Mana cost of the spell
	 */

	public Spell(String name, String type, int baseDamage, int manaCost) {
		this.name = name;
		this.type = type;
		this.baseDamage = baseDamage;
		this.manaCost = manaCost;
	}

	/**
	 * @return The name of the spell.
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The new name of the spell.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The type of the spell.
	 */

	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            The new type of the spell.
	 */

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return The base damage of the spell.
	 */

	public int getBaseDamage() {
		return baseDamage;
	}

	/**
	 * @param baseDamage
	 *            The new base damage of the spell.
	 */

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	/**
	 * @return The mana cost of the spell.
	 */

	public int getManaCost() {
		return manaCost;
	}

	/**
	 * @param manaCost
	 *            The new mana cost of the spell.
	 */

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	@Override
	public String toString() {
		return "Spell [name=" + name + ", type=" + type + ", baseDamage=" + baseDamage + ", manaCost=" + manaCost + "]";
	}

}
