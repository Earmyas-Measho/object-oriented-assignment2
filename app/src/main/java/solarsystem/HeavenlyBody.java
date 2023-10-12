/**
 * Abstract class representing a Heavenly Body.
 */

package solarsystem;

/**
 * The name of the Heavenly Body.
 */

public abstract class HeavenlyBody {
  /**
   * The name of the Heavenly Body.
   */

  private String name;

  /**
   * The average radius of the Heavenly Body in kilometers.
   */

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
   * Returns the name of the Heavenly Body.
   *
   * @return the name of the Heavenly Body
   */

  public String getName() {
    return name;
  }

  /**
   * Sets the name of the Heavenly Body.
   *
   * @param newName the name to set
   */

  private void setName(String newName) {
    this.name = newName;
  }

  /**
   * Returns the average radius of the Heavenly Body in kilometers.
   *
   * @return the average radius of the Heavenly Body in kilometers
   */

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * Sets the average radius of the Heavenly Body in kilometers.
   *
   * @param radius the radius to set
   */

  private void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = checkAvgRadiusInKm(radius);
  }

  /**
   * Checks if the given radius is a valid average radius for a Heavenly Body.
   *
   * @param radius the radius to check
   *
   * @return the given radius if it is valid, or throws an exception if it is not
   */

  protected int checkAvgRadiusInKm(int radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be greater than zero.");
    }
    return radius;
  }

  /**
   * Returns a string representation of the Heavenly Body.
   *
   * @return a string representation of the Heavenly Body
   */

  @Override
  public String toString() {
    return "HeavenlyBody: " + name + ", average radius " + avgRadiusInKm + " km";
  }
}
