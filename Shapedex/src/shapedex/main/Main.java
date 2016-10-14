package shapedex.main;

import shapedex.types.Item;
import shapedex.types.Lock;
import shapedex.types.Shape;
import shapedex.types.Skill;
import shapedex.types.Spell;
import shapedex.types.Warrior;

/**
 * Main class for Shapedex.
 * 
 * @author Angel Mate
 * @version 2016-10-15
 *
 */

public class Main {

	public static void main(String[] args) {
		Warrior conan = new Warrior("Conan", "Human", 100, 25, 15, 5, 2);
		Warrior goblin = new Warrior("Goblin", "Goblin", 35, 10, 5, 5, 5);

		System.out.println(conan);
		System.out.println(goblin);

		Spell arcaneRay = new Spell("Arcane Ray", "ARCANE", 10, 5);
		Spell iceBeam = new Spell("Ice Beam", "ICE", 20, 10);

		conan.learnSpell(arcaneRay);

		conan.learnSpell(iceBeam);

		Shape aldara = new Shape("Aldara", "ICE", "COMMON");
		Shape fireDemon = new Shape("Fire Demon", "FIRE", "COMMON");

		conan.learnShape(aldara);
		conan.learnShape(fireDemon);

		goblin.attackPhysical(conan);

		conan.shapeShift(fireDemon);

		conan.attackSpell(goblin, arcaneRay);

		System.out.println(conan);
		System.out.println(goblin);
		System.out.println("");

		System.out.println(conan.getSpellDex());
		System.out.println(conan.getShapeDex());

		Item redPotion = new Item("Red Potion", "Potion", 10, 5);
		conan.addItem(redPotion);

		System.out.println(conan.getItemDex());
		
		Skill lockPick = new Skill("Lockpick", "LPK", 5);
		
		conan.learnSkill(lockPick);
		System.out.println(conan.getSkillDex());
		
		Lock doorLock = new Lock();
		conan.pickLock(doorLock);
		conan.startSneaking();

	}

}
