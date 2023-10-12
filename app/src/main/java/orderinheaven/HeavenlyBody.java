package orderinheaven;

/**
 * The HeavenlyBody class is the abstract base class for all heavenly bodies in
 * the star system.
 */
public abstract class HeavenlyBody implements Comparable<HeavenlyBody> {
  private String name;
  private int avgRadiusInKm;
  private double averageTemperature;

  /**
   * Constructs a HeavenlyBody with the given name and average radius.
   *
   * @param name          the name of the heavenly body
   *
   * @param avgRadiusInKm the average radius of the heavenly body in kilometers
   */
  protected HeavenlyBody(String name, int avgRadiusInKm) {
    this(name, avgRadiusInKm, 0); // You can set a default value for averageTemperature here
  }

  /**
   * Constructs a HeavenlyBody with the given name and average radius.
   *
   * @param name               the name of the heavenly body.
   *
   * @param avgRadiusInKm      the average radius of the heavenly body in
   *                           kilometers.
   *
   * @param averageTemperature the average radius of the heavenly body in
   *                           kilometers.
   */

  protected HeavenlyBody(String name, int avgRadiusInKm, double averageTemperature) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
    setAverageTemperature(averageTemperature);
  }

  /**
   * Returns the name of the heavenly body.
   *
   * @return the averageTemprature
   */

  public double getAverageTemperature() {
    return averageTemperature;
  }

  /**
   * Constructs a HeavenlyBody with the given name and average radius.
   *
   * @param averageTemperature the average radius of the heavenly body in
   *                           kilometers.
   */

  public void setAverageTemperature(double averageTemperature) {
    if (averageTemperature < -218 || averageTemperature > 430) {
      throw new IllegalArgumentException("Temperature must be between -218°C and 430°C.");
    }
    this.averageTemperature = averageTemperature;
  }

  /**
   * Returns the name of the heavenly body.
   *
   * @return the name of the heavenly body
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the heavenly body.
   *
   * @param newName the new name of the heavenly body
   */
  private void setName(String newName) {
    this.name = newName;
  }

  /**
   * Returns the average radius of the heavenly body in kilometers.
   *
   * @return the average radius of the heavenly body in kilometers
   */
  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * Sets the average radius of the heavenly body in kilometers.
   *
   * @param radius the average radius of the heavenly body in kilometers
   */

  private void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = checkAvgRadiusInKm(radius);
  }

  /**
   * Checks if the average radius of the heavenly body is greater than zero.
   *
   * @param radius the average radius of the heavenly body in kilometers
   *
   * @return the average radius of the heavenly body in kilometers if it is
   *         greater than zero
   *
   * @throws IllegalArgumentException if the average radius of the heavenly body
   *                                  is not greater than zero
   */

  protected int checkAvgRadiusInKm(int radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be greater than zero.");
    }
    return radius;
  }

  /**
   * Compares this heavenly body to another based on their average radius.
   *
   * @param other the other heavenly body to be compared to
   *
   * @return a negative integer, zero, or a positive integer as this heavenly
   *         body's average radiusis less than, equal to, or greater than the other heavenly body's
   *         average radius
   */

  @Override
  public int compareTo(HeavenlyBody other) {
    return Integer.compare(this.avgRadiusInKm, other.avgRadiusInKm);
  }

  /**
   * Returns a string representation of the heavenly body.
   *
   * @return a string representation of the heavenly body
   */

  @Override
  public String toString() {
    return "HeavenlyBody: " + name + ", average radius " + avgRadiusInKm + " km";
  }
}
