/**
 * This class contains the main method which runs the application and prints the Solar System.
 */

package refactoredsolitaires;

/**
 * The main method which runs the application and prints the Solar System.
 */

public class App {
  /**
   * The main method which runs the application and prints the Solar System.
   *
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    Star sun = new Star("Sun", 696342);

    final Planet[] planets = {
        new Planet("Mercury", 2439),
        new Planet("Venus", 6051),
        new Planet("Earth", 6371),
        new Planet("Mars", 3389),
        new Planet("Jupiter", 69911),
        new Planet("Saturn", 58232),
        new Planet("Uranus", 25362),
        new Planet("Neptune", 24622)
      };

    final Moon[] moons = {
      new Moon("Moon", 1737),
      new Moon("Phobos", 12),
      new Moon("Io", 1821),
      new Moon("Europa", 1560),
      new Moon("Ganymede", 2634),
      new Moon("Callisto", 2410),
      new Moon("Mimas", 198),
      new Moon("Enceladus", 252),
      new Moon("Tethys", 533),
      new Moon("Dione", 561),
      new Moon("Rhea", 764),
      new Moon("Titan", 2575)
      };

    System.out.println("Solar System:");
    System.out.printf("  Star: %s, average radius %dkm%n%n", sun.getName(), sun.getAvgRadiusInKm());

    System.out.println("  Planets:");
    for (Planet planet : planets) {
      System.out.printf("    Planet: %s, average radius %dkm%n", planet.getName(), planet.getAvgRadiusInKm());
    }
    System.out.println();

    System.out.println("  Some moons:");
    for (Moon moon : moons) {
      System.out.printf("    Moon: %s, average radius %dkm%n", moon.getName(), moon.getAvgRadiusInKm());
    }
  }
}
