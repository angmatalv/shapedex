package shapedex.tools;

import java.util.Random;

/**
 * Dice class for randomized events, such as attacks and lock picking.
 * 
 * @author Angel Mate
 * @version 2016-10-10
 */

public class Dice {

	/**
	 * Arbitrary value to be added to the result of rolling the dice, so that
	 * the smallest number that can be obtained is always greater than zero.
	 */

	private static final int ARBITRARY_VALUE = 1;

	/**
	 * Rolls the dice, with the number of sides given through the parameter.
	 * Since the method uses java.util.Random.nextInt(int bound), we add an
	 * arbitrary number (1 by default) to the result of the roll, so that we
	 * always get values greater than zero, and equal to or lower than the
	 * number of sides.
	 * 
	 * @param size
	 *            The number of sides the dice will have.
	 * @return The result of rolling the dice.
	 */

	public static int roll(int size) {
		Random randomizer = new Random();
		return randomizer.nextInt(size) + ARBITRARY_VALUE;

	}
}
