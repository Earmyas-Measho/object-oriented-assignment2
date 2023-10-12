package solitares;

/**
 * Class representing a moon in the solar system.
 */

public class Moon {
  private String name;
  private int avgRadiusInKm;

  /**
   * Constructs a new Moon with the specified name and average radius in km.
   *
   * @param name          The name of the moon.
   *
   * @param avgRadiusInKm The average radius of the moon in km.
   *
   * @throws IllegalArgumentException if name is null or empty or if avgRadiusInKm
   *
   *                                  is less than 6 or greater than 10,000.
   */

  public Moon(String name, int avgRadiusInKm) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must not be null or empty");
    }
    if (avgRadiusInKm < 6 || avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("Average radius must be between 6 km and 10,000 km");
    }
    this.name = name;
    this.avgRadiusInKm = avgRadiusInKm;
  }

  /**
   * Returns the name of the moon.
   *
   * @return The name of the moon.
   */

  public String getName() {
    return name;
  }

  /**
   * Sets the average radius of the moon in km.
   *
   * @param radius The average radius of the moon in km.
   */

  public void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = radius;
  }

  /**
   * Returns the average radius of the moon in km.
   *
   * @return The average radius of the moon in km.
   */

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * Returns a string representation of the moon.
   *
   * @return A string representation of the moon.
   */

  @Override
  public String toString() {
    return "Moon: " + name + ", average radius " + avgRadiusInKm + "km";
  }
}
