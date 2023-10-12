package solitares;

/**
 * The `Star` class represents a star in the solar system.
 *
 * @author earmyas measho
 */

public class Star {
  private String name;
  private int avgRadiusInKm;

  /**
   * Creates a new `Star` object with the specified name and average radius.
   *
   * @param name          the name of the star
   *
   * @param avgRadiusInKm the average radius of the star in kilometers
   *
   * @throws IllegalArgumentException if the name is null or empty or the average
   *                                  radius is less
   *
   *                                  than 16,700 km
   */

  public Star(String name, int avgRadiusInKm) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must not be null or empty");
    }
    if (avgRadiusInKm < 16700) {
      throw new IllegalArgumentException("Average radius must not be less than 16,700 km");
    }
    this.name = name;
    this.avgRadiusInKm = avgRadiusInKm;
  }

  /**
   * Returns the name of the star.
   *
   * @return the name of the star
   */

  public String getName() {
    return name;
  }

  /**
   * Sets the average radius of the star.
   *
   * @param radius the new average radius of the star in kilometers
   */

  public void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = radius;
  }

  /**
   * Returns the average radius of the star.
   *
   * @return the average radius of the star in kilometers
   */

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * Returns a string representation of the star.
   *
   * @return a string representation of the star in the format "Star: name,
   *         average radius radius km"
   */

  @Override
  public String toString() {
    return "Star: " + name + ", average radius " + avgRadiusInKm + "km";
  }
}
