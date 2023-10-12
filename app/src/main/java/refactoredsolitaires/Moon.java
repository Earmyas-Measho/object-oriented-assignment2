/**
 * Class representing a Moon.
 */

package refactoredsolitaires;

/**
 * Constructs a new instance of a Moon.
 */

public class Moon extends HeavenlyBody {
  /**
   * Constructs a new instance of a Moon.
   *
   * @param name          the name of the Moon
   *
   * @param avgRadiusInKm the average radius of the Moon in kilometers
   */

  public Moon(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Checks if the given radius is a valid average radius for a Moon.
   *
   * @param radius the radius to check
   *
   * @return true if the radius is valid, false otherwise
   */

  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius >= 6 && radius <= 10000;
  }

  /**
   * Returns a string representation of the Moon.
   *
   * @return a string representation of the Moon
   */

  @Override
  public String toString() {
    return "Moon: " + getName() + ", average radius " + getAvgRadiusInKm() + "km";
  }
}
