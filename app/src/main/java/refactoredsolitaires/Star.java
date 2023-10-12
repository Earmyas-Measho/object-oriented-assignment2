/**
 * Class representing a Star.
 */

package refactoredsolitaires;

/**
 * Constructs a new instance of a Star.
 */

public class Star extends HeavenlyBody {
  /**
   * Constructs a new instance of a Star.
   *
   * @param name          the name of the Star
   *
   * @param avgRadiusInKm the average radius of the Star in kilometers
   */

  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Checks if the given radius is a valid average radius for a Star.
   *
   * @param radius the radius to check
   *
   * @return true if the radius is valid, false otherwise
   */

  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius >= 16700;
  }

  /**
   * Returns a string representation of the Star.
   *
   * @return a string representation of the Star
   */

  @Override
  public String toString() {
    return "Star: " + getName() + ", average radius " + getAvgRadiusInKm() + "km";
  }
}