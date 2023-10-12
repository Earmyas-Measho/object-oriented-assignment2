package orderinheaven;

import java.util.Arrays;

/**
 * The App class implements the orderInHeaven method which sorts and prints the
 * heavenly bodies in the star system and the main method which creates and
 * orders the solar system.
 */

public class App {
  /**
   * Sorts the heavenly bodies in the star system and prints them.
   *
   * @param star the star system
   */

  public static void orderInHeaven(Star star) {
    HeavenlyBody[] heavenlyBodies = star.getHeavenlyBodies();
    Arrays.sort(heavenlyBodies);

    for (HeavenlyBody hb : heavenlyBodies) {
      printHeavenlyBody(hb);
    }
  }

  /**
   * Prints a heavenly body.
   *
   * @param hb the heavenly body to be printed
   */

  public static void printHeavenlyBody(HeavenlyBody hb) {
    System.out.println("Heavenly Body: " + hb.getName() + ", average radius " + hb.getAvgRadiusInKm() + "km");
  }

  /**
   * The main method creates and orders the solar system.
   *
   * @param args command line arguments
   */

  public static void main(String[] args) {
    solarSystem();
  }

  /**
   * Creates the solar system.
   */
  public static void solarSystem() {
    Star sun = new Star("Sun", 696342);

    Planet earth = sun.addPlanet("Earth", 6371, 63710000);
    earth.addMoon("Moon", 1737, 1737000);

    Planet mars = sun.addPlanet("Mars", 3389, 33890000);
    mars.addMoon("Phobos", 12, 12000);
    mars.addMoon("Deimos", 6, 6000);

    Planet jupiter = sun.addPlanet("Jupiter", 69911, 699110000);
    jupiter.addMoon("Io", 1821, 1821000);
    jupiter.addMoon("Europa", 1560, 1560000);
    jupiter.addMoon("Ganymede", 2634, 2634000);
    jupiter.addMoon("Callisto", 2410, 2410000);

    Planet saturn = sun.addPlanet("Saturn", 58232, 582320000);
    saturn.addMoon("Mimas", 198, 198000);
    saturn.addMoon("Enceladus", 252, 252000);
    saturn.addMoon("Tethys", 533, 533000);
    saturn.addMoon("Dione", 561, 561000);
    saturn.addMoon("Rhea", 764, 764000);
    saturn.addMoon("Titan", 2575, 2575000);
    orderInHeaven(sun);
  }
}
