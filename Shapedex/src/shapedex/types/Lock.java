package shapedex.types;

import shapedex.tools.Dice;

/**
 * Lock class for ShapeDex.
 * 
 * @author Angel Mate
 * @version 2016-10-14
 *
 */

public class Lock {

	/**
	 * Difficulty of the Lock.
	 */

	private int difficulty;

	/**
	 * Constructor for the Lock class.
	 * 
	 * @param difficulty
	 *            The starting difficulty of the lock.
	 */

	public Lock() {
		this.difficulty = Dice.roll(20);
	}

	/**
	 * @return The current difficulty of the Lock.
	 */

	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty
	 *            The new difficulty of the Lock.
	 */

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	@Override
	public String toString() {
		return "Lock [difficulty=" + difficulty + "]";
	}

}
