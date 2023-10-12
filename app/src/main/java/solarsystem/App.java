/**
 * Main application class for the Solar System.
 */

package solarsystem;

/**
 * Main method for the Solar System application.
 */

public class App {
  /**
   * Main method for the Solar System application.
   *
   * @param args command line arguments
   */

  public static void main(String[] args) {
    solarSystem();
  }

  /**
   * Creates and displays the Solar System.
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

    System.out.println(sun);
  }
}
