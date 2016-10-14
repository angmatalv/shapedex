package shapedex.types;

/**
 * Skill class for ShapeDex.
 * 
 * @author Angel Mate
 * @version 2016-10-14
 */

public class Skill {

	/**
	 * Name of the skill.
	 */

	private String name;

	/**
	 * Short name of the skill (three letters).
	 */

	private String shortName;

	/**
	 * Points of the skill.
	 */

	private int points;

	/**
	 * Constructor for the Skill class.
	 * 
	 * @param name
	 *            The name of the skill.
	 * @param shortName
	 *            The short name of the skill.
	 * @param points
	 *            The points of the skill.
	 */

	public Skill(String name, String shortName, int points) {
		super();
		this.name = name;
		this.shortName = shortName;
		this.points = points;
	}

	/**
	 * 
	 * @return The current name of the skill.
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The new name of the skill.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The current short name of the skill.
	 */

	public String getShortName() {
		return shortName;
	}

	/**
	 * 
	 * @param shortName
	 *            The new short name of the skill.
	 */

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * 
	 * @return The current points of the skill.
	 */

	public int getPoints() {
		return points;
	}

	/**
	 * 
	 * @param points
	 *            The new points of the skill.
	 */

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Skill [name=" + name + ", shortName=" + shortName + ", points=" + points + "]";
	}

}
