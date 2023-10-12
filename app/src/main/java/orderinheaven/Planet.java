package orderinheaven;

import java.util.ArrayList;
import java.util.List;

/**
 * The Planet class represents a planet in the star system.
 */
public class Planet extends HeavenlyBody {
  private List<Moon> moons;
  private int avgOrbitRadiusInKm;

  /**
   * Constructs a Planet with the given name, average radius, and average orbit
   * radius.
   *
   * @param name               the name of the planet
   *
   * @param avgRadiusInKm      the average radius of the planet in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the planet in
   *                           kilometers
   */

  public Planet(String name, int avgRadiusInKm, int avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    moons = new ArrayList<>();
  }

  /**
   * Adds a moon to the planet with the given name, average radius, and average
   * orbit radius.
   *
   * @param name               the name of the moon
   *
   * @param avgRadiusInKm      the average radius of the moon in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the moon in kilometers
   *
   * @return the moon that was added to the planet
   */

  public Moon addMoon(String name, int avgRadiusInKm, int avgOrbitRadiusInKm) {
    Moon moon = new Moon(name, avgRadiusInKm, avgOrbitRadiusInKm);
    moons.add(moon);
    return moon;
  }

  /**
   * Returns the average orbit radius of the planet in kilometers.
   *
   * @return the average orbit radius of the planet in kilometers
   */

  public int getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  /**
   * Returns the list of moons that orbit the planet.
   *
   * @return the list of moons that orbit the planet
   */

  public List<Moon> getMoons() {
    return new ArrayList<>(moons);
  }

  /**
   * Returns a string representation of the planet.
   *
   * @return a string representation of the planet
   */

  @Override
  public String toString() {
    return "Planet: " + getName() + ", average radius " + getAvgRadiusInKm() + " km, average orbit radius "
        + avgOrbitRadiusInKm + " km";
  }
}
