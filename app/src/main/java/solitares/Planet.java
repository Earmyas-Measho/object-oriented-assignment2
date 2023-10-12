package solitares;

/**
 * Represents a planet in the solar system.
 */

public class Planet {
  private String name;
  private int avgRadiusInKm;

  /**
   * Constructs a new Planet object with the given name and average radius in
   * kilometers.
   *
   * @param name          The name of the planet. Must not be null or an empty
   *                      string.
   *
   * @param avgRadiusInKm The average radius of the planet in kilometers. Must be
   *                      between 2,000 and 200,000.
   *
   * @throws IllegalArgumentException if the name is null or empty or if the
   *                                  average radius is outside of the
   *
   *                                  specified range.
   */

  public Planet(String name, int avgRadiusInKm) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must not be null or empty");
    }
    if (avgRadiusInKm < 2000 || avgRadiusInKm > 200000) {
      throw new IllegalArgumentException("Average radius must be between 2,000 km and 200,000 km");
    }
    this.name = name;
    this.avgRadiusInKm = avgRadiusInKm;
  }

  /**
   * Returns the name of the planet.
   *
   * @return the name of the planet.
   */

  public String getName() {
    return name;
  }

  /**
   * Sets the average radius of the planet in kilometers.
   *
   * @param radius The average radius of the planet in kilometers.
   */

  public void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = radius;
  }

  /**
   * Returns the average radius of the planet in kilometers.
   *
   * @return the average radius of the planet in kilometers.
   */

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * Returns a string representation of the planet.
   *
   * @return a string representation of the planet.
   */

  @Override
  public String toString() {
    return "Planet: " + name + ", average radius " + avgRadiusInKm + "km";
  }
}
