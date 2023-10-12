/**
 * Class representing a Planet.
 */

package refactoredsolitaires;

/**
 * Constructs a new instance of a Planet.
 */

public class Planet extends HeavenlyBody {
  /**
   * Constructs a new instance of a Planet.
   *
   * @param name          the name of the Planet
   *
   * @param avgRadiusInKm the average radius of the Planet in kilometers
   */

  public Planet(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Checks if the given radius is a valid average radius for a Planet.
   *
   * @param radius the radius to check
   *
   * @return true if the radius is valid, false otherwise
   */

  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius >= 2000 && radius <= 200000;
  }

  /**
   * Returns a string representation of the Planet.
   *
   * @return a string representation of the Planet
   */

  @Override
  public String toString() {
    return "Planet: " + getName() + ", average radius " + getAvgRadiusInKm() + "km";
  }
}
