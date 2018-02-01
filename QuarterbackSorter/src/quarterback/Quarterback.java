package quarterback;

public class Quarterback implements Comparable {
	private String name;
	private int numberOfSuperBowlsWon;
	private int careerPassingYards;
	private int careerPassingTouchdowns;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the numberOfSuperBowlsWon
	 */
	public int getNumberOfSuperBowlsWon() {
		return numberOfSuperBowlsWon;
	}
	/**
	 * @param numberOfSuperBowlsWon the numberOfSuperBowlsWon to set
	 */
	public void setNumberOfSuperBowlsWon(int numberOfSuperBowlsWon) {
		this.numberOfSuperBowlsWon = numberOfSuperBowlsWon;
	}
	/**
	 * @return the careerPassingYards
	 */
	public int getCareerPassingYards() {
		return careerPassingYards;
	}
	/**
	 * @param careerPassingYards the careerPassingYards to set
	 */
	public void setCareerPassingYards(int careerPassingYards) {
		this.careerPassingYards = careerPassingYards;
	}
	/**
	 * @return the careerPassingTouchdowns
	 */
	public int getCareerPassingTouchdowns() {
		return careerPassingTouchdowns;
	}
	/**
	 * @param careerPassingTouchdowns the careerPassingTouchdowns to set
	 */
	public void setCareerPassingTouchdowns(int careerPassingTouchdowns) {
		this.careerPassingTouchdowns = careerPassingTouchdowns;
	}
	// Add a constructor that takes name, super bowls won, career passing yds, and career passing TDs
	public Quarterback(String name, int numberOfSuperBowlsWon, int careerPassingYards, int careerPassingTouchdowns) {
		setName(name);
		setNumberOfSuperBowlsWon(numberOfSuperBowlsWon);
		setCareerPassingYards(careerPassingYards);
		setCareerPassingTouchdowns(careerPassingTouchdowns);
	}
	/**
	 * Compare two Quarterback objects
	 * return < 0 if the first is less than the second
	 * return 0 if they are equal 
	 * return > 0 if the first is greater than the second
	 */
	@Override
	public int compareTo(Object arg0) {
		if(this.getCareerPassingTouchdowns() == ((Quarterback)arg0).getCareerPassingTouchdowns()) { 
			return this.getName().compareTo(((Quarterback)(arg0)).getName());
			}
		if(this.getCareerPassingTouchdowns() < ((Quarterback)arg0).getCareerPassingTouchdowns()) {
			return 1;
		} else {
		return -1;
		}
	}
}
