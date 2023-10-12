//import lombok.Getter; 
//import lombok.Setter;

//@Getter 
//@Setter
/**
 * Class representing a Heavenly Body.
 */

package refactoredsolitaires;

/**
 * Constructs a new instance of a Heavenly Body.
 */

public abstract class HeavenlyBody {
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
   * @param name          the name of the heavenly body.
   *
   * @param avgRadiusInKm the average radius of the heavenly body in kilometers.
   *
   * @param averageTemperature the average radius of the heavenly body in kilometers.
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
   * @param averageTemperature the average radius of the heavenly body in kilometers.
   */ 
  
  public void setAverageTemperature(double averageTemperature) {
    if (averageTemperature < -218 || averageTemperature > 430) {
      throw new IllegalArgumentException("Temperature must be between -218°C and 430°C.");
    }
    this.averageTemperature = averageTemperature;
  }

  /**
   * Gets the name of the body.
   *
   * @return the name of the body
   */

  public String getName() {
    return name;
  }

  /**
   * Sets the name of the body.
   *
   * @param newName the new name of the body
   *
   * @throws IllegalArgumentException if newName is null or empty
   */

  private void setName(String newName) {
    if (newName == null || newName.isEmpty()) {
      throw new IllegalArgumentException("Name must not be null or empty");
    }
    this.name = newName;
  }

  /**
   * Gets the average radius of the body in kilometers.
   *
   * @return the average radius of the body in kilometers
   */

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * Sets the average radius of the body in kilometers.
   *
   * @param radius the new average radius of the body in kilometers
   *
   * @throws IllegalArgumentException if radius is not a valid average radius
   */

  private void setAvgRadiusInKm(int radius) {
    if (!checkAvgRadiusInKm(radius)) {
      throw new IllegalArgumentException("Invalid average radius");
    }
    this.avgRadiusInKm = radius;
  }

  /**
   * Checks if the given radius is a valid average radius.
   *
   * @param radius the radius to check
   *
   * @return true if the radius is valid, false otherwise
   */

  protected abstract boolean checkAvgRadiusInKm(int radius);

  /**
   * Returns a string representation of the body.
   *
   * @return a string representation of the body
   */

  @Override
  public String toString() {
    return "HeavenlyBody: " + name + ", average radius " + avgRadiusInKm + "km";
  }
}
