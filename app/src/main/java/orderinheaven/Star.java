package orderinheaven;

import java.util.ArrayList;

/**
 * The Star class represents a star in the star system.
 */

class Star extends HeavenlyBody {
  private ArrayList<Planet> planets;

  /**
   * Constructs a Star with the given name and average radius.
   *
   * @param name          the name of the star
   *
   * @param avgRadiusInKm the average radius of the star in kilometers
   */

  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    planets = new ArrayList<>();
  }

  /**
   * Adds a planet to the star with the given name, average radius, and average
   * orbit radius.
   *
   * @param name               the name of the planet
   *
   * @param avgRadiusInKm      the average radius of the planet in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the planet in
   *                           kilometers
   *
   * @return the planet that was added to the star
   */

  public Planet addPlanet(String name, int avgRadiusInKm, int avgOrbitRadiusInKm) {
    Planet planet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm);
    planets.add(planet);
    return planet;
  }

  /**
   * Returns an array of all the heavenly bodies in the star system, including the
   * star and all of its planets and moons.
   *
   * @return an array of all the heavenly bodies in the star system
   */

  public HeavenlyBody[] getHeavenlyBodies() {
    int totalHeavenlyBodies = planets.size() + 1;

    // Count the moons
    for (Planet planet : planets) {
      totalHeavenlyBodies += planet.getMoons().size();
    }

    HeavenlyBody[] heavenlyBodies = new HeavenlyBody[totalHeavenlyBodies];
    heavenlyBodies[0] = new Star(getName(), getAvgRadiusInKm());

    int index = 1;
    for (Planet planet : planets) {
      heavenlyBodies[index++] = new Planet(planet.getName(), planet.getAvgRadiusInKm(), planet.getAvgOrbitRadiusInKm());

      // Add moons
      for (Moon moon : planet.getMoons()) {
        heavenlyBodies[index++] = new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm());
      }
    }

    return heavenlyBodies;
  }

  /**
   * Returns a string representation of the star and all of its planets.
   *
   * @return a string representation of the star and all of its planets
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
