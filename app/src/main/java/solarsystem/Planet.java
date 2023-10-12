/**
 * Class representing a Planet.
 */

package solarsystem;

import java.util.ArrayList;

/**
 * planet class with heavenlybody extenede.
 */

public class Planet extends HeavenlyBody {

  /**
   * The average orbit radius of the Planet in kilometers.
   */

  private double avgOrbitRadiusInKm;

  /**
   * A list of Moons orbiting the Planet.
   */

  private ArrayList<Moon> moons;

  /**
   * Constructs a new instance of a Planet.
   *
   * @param name               the name of the Planet
   *
   * @param avgRadiusInKm      the average radius of the Planet in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the Planet in
   *                           kilometers
   */

  public Planet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Planet name cannot be null or empty.");
    }
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Minimum orbit radius for a planet must be 18,000 km.");
    }
    if (avgRadiusInKm < 2000 || avgRadiusInKm > 2000000) {
      throw new IllegalArgumentException("Average radius for a planet must be between 2,000 and 2,000,000 km.");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    moons = new ArrayList<>();
  }

  /**
   * Constructs a new instance of a Planet with the specified name, average
   * radius, average orbit radius, and list of moons.
   *
   * @param name               the name of the Planet
   *
   * @param avgRadiusInKm      the average radius of the Planet in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the Planet in
   *                           kilometers
   *
   * @param moons              the list of moons orbiting the Planet
   *
   * @throws IllegalArgumentException if the name is null or empty, if the average
   *                                  orbit radius is less than 18,000 km, or if
   *                                  the average radius is not between 2,000 and
   *                                  2,000,000 km.
   */

  public Planet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm, ArrayList<Moon> moons) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Planet name cannot be null or empty.");
    }
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Minimum orbit radius for a planet must be 18,000 km.");
    }
    if (avgRadiusInKm > 2000000) {
      throw new IllegalArgumentException("Maximum radius for a planet must be 2,000,000 km.");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    this.moons = new ArrayList<>(moons);
  }

  /**
   * Adds a new Moon to the Planet's list of Moons.
   *
   * @param name               the name of the Moon
   *
   * @param avgRadiusInKm      the average radius of the Moon in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the Moon in kilometers
   *
   * @return the new Moon that was added
   */

  public Moon addMoon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    if (avgRadiusInKm > getAvgRadiusInKm() / 2) {
      throw new IllegalArgumentException("A moon cannot have a radius larger than half of its planet's radius.");
    }
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Minimum orbit radius for a moon must be 60 km.");
    }
    Moon newMoon = new Moon(name, avgRadiusInKm, avgOrbitRadiusInKm);
    moons.add(newMoon);
    return newMoon;
  }

  /**
   * Returns the average orbit radius of the Planet in kilometers.
   *
   * @return the average orbit radius of the Planet in kilometers
   */

  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  /**
   * Returns an array of HeavenlyBodies orbiting the Planet, including the Planet
   * itself.
   *
   * @return an array of HeavenlyBodies orbiting the Planet
   */

  public HeavenlyBody[] getHeavenlyBodies() {
    HeavenlyBody[] heavenlyBodies = new HeavenlyBody[moons.size() + 1];
    heavenlyBodies[0] = new Planet(getName(), getAvgRadiusInKm(), avgOrbitRadiusInKm);
    for (int i = 0; i < moons.size(); i++) {
      Moon moon = moons.get(i);
      heavenlyBodies[i + 1] = new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm());
    }
    return heavenlyBodies;
  }

  /**
   * Returns the list of Moons orbiting the Planet.
   *
   * @return the list of Moons orbiting the Planet
   */
  public ArrayList<Moon> getMoons() {
    return new ArrayList<>(moons);
  }

  /**
   * Returns a string representation of the Planet and its Moons.
   *
   * @return a string representation of the Planet and its Moons
   */

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Planet: ").append(getName()).append(", average radius ").append(getAvgRadiusInKm())
        .append(" km, average orbit radius ").append(avgOrbitRadiusInKm).append(" km");
    for (Moon moon : moons) {
      sb.append("\n  ").append(moon.toString());
    }
    return sb.toString();
  }
}
