package shapedex.types;

import java.util.ArrayList;

import shapedex.tools.*;

/**
 * Warrior class for Shapedex.
 * 
 * @author Angel Mate
 * @version 2016-10-14
 *
 */

public class Warrior {

	/*
	 * ATTRIBUTES
	 */

	/**
	 * Name of the Warrior.
	 */

	private String name;

	/**
	 * Race of the Warrior.
	 */

	private String race;

	/**
	 * Health points of the Warrior.
	 */

	private int healthPoints;

	/**
	 * Physical damage dealt by the Warrior.
	 */

	private int physDamage;

	/**
	 * Magic and ability damage dealt by the Warrior.
	 */

	private int magicDamage;

	/**
	 * Resistance to physical attacks.
	 */

	private int physResistance;

	/**
	 * Resistance to magic and ability attacks.
	 */

	private int magicResistance;

	/**
	 * Spell index of the Warrior instance.
	 */

	private ArrayList<Spell> spellDex;

	/**
	 * Shape index of the Warrior instance.
	 */

	private ArrayList<Shape> shapeDex;

	/**
	 * Current shape of the Warrior.
	 */

	private Shape currentShape;

	/**
	 * Item index of the Warrior instance.
	 */

	private ArrayList<Item> itemDex;

	/**
	 * Skill index of the Warrior instance.
	 */

	private ArrayList<Skill> skillDex;

	/*
	 * CONSTRUCTOR
	 */

	/**
	 * Constructor for the Warrior class. Creates an empty SpellDex and ShapeDex
	 * for the Warrior instance as well.
	 * 
	 * @param name
	 *            Name of the Warrior.
	 * @param race
	 *            Race of the Warrior.
	 * @param healthPoints
	 *            Health points of the Warrior.
	 * @param physDamage
	 *            Physical damage dealt by the Warrior.
	 * @param magicDamage
	 *            Magic and ability damage dealt by the Warrior.
	 * @param physResistance
	 *            Resistance to physical attacks.
	 * @param magicResistance
	 *            Resistance to magic and ability attacks.
	 */

	public Warrior(String name, String race, int healthPoints, int physDamage, int magicDamage, int physResistance,
			int magicResistance) {

		this.name = name;
		this.race = race;
		this.healthPoints = healthPoints;
		this.physDamage = physDamage;
		this.magicDamage = magicDamage;
		this.physResistance = physResistance;
		this.magicResistance = magicResistance;
		this.spellDex = new ArrayList<Spell>();
		this.shapeDex = new ArrayList<Shape>();
		shapeDex.add(new Shape(race, "FIRE", "COMMON"));
		this.currentShape = shapeDex.get(0);
		this.itemDex = new ArrayList<Item>();
		this.skillDex = new ArrayList<Skill>();
	}

	/*
	 * GETTERS AND SETTERS
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getPhysDamage() {
		return physDamage;
	}

	public void setPhysDamage(int physDamage) {
		this.physDamage = physDamage;
	}

	public int getMagicDamage() {
		return magicDamage;
	}

	public void setMagicDamage(int magicDamage) {
		this.magicDamage = magicDamage;
	}

	public int getPhysResistance() {
		return physResistance;
	}

	public void setPhysResistance(int physResistance) {
		this.physResistance = physResistance;
	}

	public int getMagicResistance() {
		return magicResistance;
	}

	public void setMagicResistance(int magicResistance) {
		this.magicResistance = magicResistance;
	}

	public ArrayList<Spell> getSpellDex() {
		return spellDex;
	}

	public void setSpellDex(ArrayList<Spell> spellDex) {
		this.spellDex = spellDex;
	}

	public ArrayList<Shape> getShapeDex() {
		return shapeDex;
	}

	public void setShapeDex(ArrayList<Shape> shapeDex) {
		this.shapeDex = shapeDex;
	}

	public Shape getCurrentShape() {
		return currentShape;
	}

	public void setCurrentShape(Shape currentShape) {
		this.currentShape = currentShape;
	}

	public ArrayList<Item> getItemDex() {
		return itemDex;
	}

	public void setItemDex(ArrayList<Item> itemDex) {
		this.itemDex = itemDex;
	}

	public ArrayList<Skill> getSkillDex() {
		return skillDex;
	}

	public void setSkillDex(ArrayList<Skill> skillDex) {
		this.skillDex = skillDex;
	}

	/*
	 * METHODS
	 */

	/**
	 * Attempts to physically attack another warrior. A dice is rolled and the
	 * message "'this' attempts to attack 'target'!" is shown. The attack misses
	 * if the dice result is smaller than 5, and will then print "Attack
	 * missed!".
	 * 
	 * Otherwise, the attack damage is calculated: ((diceResult + this
	 * physDamage) - (target physResistance)) and the sum is subtracted from the
	 * opposing warrior's health. If its health variable reaches zero or below,
	 * it is changed to 0 and a message saying "Opponent slain!" will be
	 * printed.
	 * 
	 * @param target
	 *            The warrior that should receive the attack.
	 */

	public void attackPhysical(Warrior target) {
		int diceResult = Dice.roll(20);

		System.out.println(this.getName() + " attempts to attack " + target.getName() + "!");
		if (diceResult >= 5) {
			int damage = ((diceResult + this.physDamage) - target.getPhysResistance());
			System.out.println(this.getName() + " deals " + damage + " points of damage to " + target.getName() + "!");

			target.setHealthPoints(target.getHealthPoints() - damage);

			if (target.getHealthPoints() <= 0) {
				target.setHealthPoints(0);
				System.out.println("Opponent slain!");
			}
		} else {
			System.out.println("Attack missed!");
		}

	}

	/**
	 * Attempts to use a spell to attack another warrior. If the spell to use is
	 * not contained within the Warrior's SpellDex, the following message is
	 * shown: "'this' does not know the spell _spellName_ !"
	 * 
	 * If the spell is contained within the SpellDex, a dice is rolled and the
	 * message "'this' throws the spell _spellName_ at 'target'!" is shown. The
	 * attack misses if the dice result is smaller than 10, and will then print
	 * "Spell attack missed!".
	 * 
	 * Otherwise, the attack damage is calculated: ((diceResult + this
	 * magicDamage + spell base damage) - (target magicResistance)) and the sum
	 * is substracted from the opposing warrior's health. If its health variable
	 * reaches zero or below, it is changed to 0 and a message saying "Opponent
	 * slain!" will be printed.
	 * 
	 * @param target
	 *            The enemy Warrior to receive the spell attack.
	 * @param spell
	 *            The spell to throw at the enemy Warrior.
	 */

	public void attackSpell(Warrior target, Spell spell) {

		int diceResult = Dice.roll(20);

		if (this.spellDex.contains(spell)) {
			System.out
					.println(this.getName() + " throws the spell " + spell.getName() + " at " + target.getName() + "!");
			if (diceResult >= 10) {
				int damage = ((diceResult + this.magicDamage + spell.getBaseDamage()) - target.getPhysResistance());
				System.out.println(
						this.getName() + " deals " + damage + " points of damage to " + target.getName() + "!");

				target.setHealthPoints(target.getHealthPoints() - damage);

				if (target.getHealthPoints() <= 0) {
					target.setHealthPoints(0);
					System.out.println("Opponent slain!");
				}
			} else {
				System.out.println("Spell attack missed!");
			}
		} else {
			System.out.println(this.getName() + " does not know the spell " + spell.getName() + "!");
		}

	}

	/**
	 * Adds a new Spell to the Warrior's SpellDex, as long as it is not
	 * contained already within its SpellDex.
	 * 
	 * @param newSpell
	 *            The Spell to be learned.
	 */

	public void learnSpell(Spell newSpell) {
		if (this.spellDex.contains(newSpell)) {
			System.out.println(this.getName() + " already knows the spell " + newSpell.getName() + "!");
		} else {
			this.spellDex.add(newSpell);
			System.out.println(this.getName() + " has learned the spell " + newSpell.getName() + "!");
		}
	}

	/**
	 * Adds a new Shape to the Warrior's ShapeDex, as long as it is not
	 * contained already within its ShapeDex.
	 * 
	 * @param newShape
	 *            The Shape to be learned.
	 */

	public void learnShape(Shape newShape) {
		if (this.getShapeDex().contains(newShape)) {
			System.out.println(this.getName() + " already owns the shape " + newShape.getName() + "!");
		} else {
			this.shapeDex.add(newShape);
			System.out.println(this.getName() + " has learned the shape " + newShape.getName() + "!");
		}
	}

	/**
	 * Adds a new Skill to the Warrior's SkillDex, as long as it is not
	 * contained already within its SkillDex.
	 * 
	 * @param newSkill
	 *            The Skill to be learned.
	 */

	public void learnSkill(Skill newSkill) {
		if (this.getSkillDex().contains(newSkill)) {
			System.out.println(this.getName() + " already knows the skill " + newSkill.getName() + "!");
		} else {
			this.skillDex.add(newSkill);
			System.out.println(this.getName() + " has learned the skill " + newSkill.getName() + "!");
		}
	}

	/**
	 * Switches to the shape given through parameter, as long as it is not the
	 * current shape.
	 * 
	 * @param newShape
	 *            Shape to switch to.
	 */

	public void shapeShift(Shape newShape) {
		if (this.getCurrentShape() == newShape) {
			System.out.println(this.getName() + " is already in that shape!");
		} else {
			this.setCurrentShape(newShape);
			System.out.println(this.getName() + " has shapeshifted to " + newShape.getName() + "!");
		}
	}

	/**
	 * Adds a new item to the warrior's ItemDex.
	 * 
	 * @param newItem
	 *            The new item to be added.
	 */

	public void addItem(Item newItem) {
		this.itemDex.add(newItem);
		System.out.println(this.getName() + " has collected the item: " + newItem.getName());
	}

	/**
	 * @param targetLock
	 *            The lock to be picked.
	 */

	public void pickLock(Lock targetLock) {
		System.out.println(
				this.getName() + " attempts to pick the lock (Lock Level: " + targetLock.getDifficulty() + ")");
		int diceResult = Dice.roll(20);
		System.out.println("The result of your roll is: " + diceResult);
		if (diceResult >= targetLock.getDifficulty()) {
			System.out.println("The lock was picked and the door opened!");
		} else {
			System.out.println("Lockpick failed!");
		}

	}

	@Override
	public String toString() {
		return "Warrior [name=" + name + ", race=" + race + ", healthPoints=" + healthPoints + ", physDamage="
				+ physDamage + ", magicDamage=" + magicDamage + ", physResistance=" + physResistance
				+ ", magicResistance=" + magicResistance + ", currentShape=" + currentShape + "]";
	}

}
