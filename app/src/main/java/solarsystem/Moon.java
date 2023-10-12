/**
 * Class representing a Moon.
 */

package solarsystem;

/**
 * The moon class with the abstract class extended.
 */

public class Moon extends HeavenlyBody {
  /**
   * The average orbit radius of the Moon in kilometers.
   */

  private double avgOrbitRadiusInKm;

  /**
   * Constructs a new instance of a Moon.
   *
   * @param name               the name of the Moon
   *
   * @param avgRadiusInKm      the average radius of the Moon in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the Moon in kilometers
   */

  public Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty.");
    }
    if (avgRadiusInKm < 10) {
      throw new IllegalArgumentException("Minimum radius for a moon must be 10 km.");
    }
    if (avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("Maximum radius for a moon must be 10000 km.");
    }
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Minimum orbit radius for a moon must be 60 km.");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
  }

  /**
   * Returns the average orbit radius of the Moon in kilometers.
   *
   * @return the average orbit radius of the Moon in kilometers
   */

  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  /**
   * Returns a string representation of the Moon.
   *
   * @return a string representation of the Moon
   */

  @Override
  public String toString() {
    return "Moon: " + getName() + ", average radius " + getAvgRadiusInKm() + " km, average orbit radius "
        + avgOrbitRadiusInKm + " km";
  }
}
