package solarsystem;

import java.util.ArrayList;

/**
 * This class represents a Star in the Solar System. A Star has a name and an
 * average radius,
 * and it can have multiple Planets.
 */

public class Star extends HeavenlyBody {
  private ArrayList<Planet> planets;

  /**
   * Constructs a new Star with the given name and average radius.
   *
   * @param name          the name of the Star
   *
   * @param avgRadiusInKm the average radius of the Star in kilometers
   */

  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Star name cannot be null or empty.");
    }
    if (avgRadiusInKm < 200000) {
      throw new IllegalArgumentException("Average radius for a star must be at least 200,000 km.");
    }
    planets = new ArrayList<>();
  }

  /**
   * Adds a new Planet to the Star.
   *
   * @param name               the name of the Planet
   *
   * @param avgRadiusInKm      the average radius of the Planet in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the Planet in
   *                           kilometers
   *
   * @return the newly created Planet
   *
   * @throws IllegalArgumentException if the average orbit radius of the Planet is
   *                                  less than 18,000 km
   */

  public Planet addPlanet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Minimum orbit radius for a planet must be 18,000 km.");
    }
    Planet newPlanet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm);
    planets.add(newPlanet);
    return newPlanet;
  }

  /**
   * Returns an array of all the Heavenly Bodies in the Star's Solar System.
   *
   * @return an array of all the Heavenly Bodies in the Star's Solar System
   */
  public HeavenlyBody[] getHeavenlyBodies() {
    int totalBodies = 1; // 1 for the star itself
    for (Planet planet : planets) {
      totalBodies += 1 + planet.getMoons().size(); // 1 for the planet and the number of moons
    }

    HeavenlyBody[] heavenlyBodies = new HeavenlyBody[totalBodies];
    heavenlyBodies[0] = new Star(getName(), getAvgRadiusInKm());
    int index = 1;
    for (Planet planet : planets) {
      heavenlyBodies[index++] = new Planet(planet.getName(), planet.getAvgRadiusInKm(), planet.getAvgOrbitRadiusInKm());
      for (Moon moon : planet.getMoons()) {
        heavenlyBodies[index++] = new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm());
      }
    }
    return heavenlyBodies;
  }

  /**
   * Returns a string representation of the Star and its Planets.
   *
   * @return a string representation of the Star and its Planets
   */

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Star: ").append(getName()).append(", average radius ").append(getAvgRadiusInKm()).append(" km");
    for (Planet planet : planets) {
      sb.append("\n  ").append(planet.toString());
    }
    return sb.toString();
  }
}
