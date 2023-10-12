package orderinheaven;

/**
 * The Moon class represents a moon in the star system.
 */

class Moon extends HeavenlyBody {
  private double avgOrbitRadiusInKm;

  /**
   * Constructs a Moon with the given name, average radius, and average orbit
   * radius.
   *
   * @param name               the name of the moon
   *
   * @param avgRadiusInKm      the average radius of the moon in kilometers
   *
   * @param avgOrbitRadiusInKm the average orbit radius of the moon in kilometers
   *
   * @throws IllegalArgumentException if the average orbit radius of the moon is
   *                                  less than 60 km
   */

  protected Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Minimum orbit radius for a moon must be 60 km.");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
  }

  /**
   * Returns the average orbit radius of the moon in kilometers.
   *
   * @return the average orbit radius of the moon in kilometers
   */

  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  /**
   * Returns a string representation of the moon.
   *
   * @return a string representation of the moon
   */

  @Override
  public String toString() {
    return "Moon: " + getName() + ", average radius " + getAvgRadiusInKm() + " km, average orbit radius "
        + avgOrbitRadiusInKm + " km";
  }
}
