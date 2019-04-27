package at.mschuster.tools;

/**
 * Represents the template for the output of the game history which the game
 * creates.
 * 
 * @author Freedom
 * @version 1.0
 * @since 1.0
 */

public final class RandomGenerator {

	/**
	 * @param min value.
	 * @param max value.
	 * @return a random number from min number to max number.
	 */
	public static final int getInt(int min, int max) {
		return (int) (Math.random() * max + min);
	}

	/**
	 * @return a name based on a String array.
	 */
	public static final String getName() {
		String[] names = { "Kurt", "Hans", "Fred", "Sepp", "Paul", "Klaus", "Matthias", "Oleander", "Lisa", "Anna" };
		return names[getInt(0, names.length - 1)];
	}

}
