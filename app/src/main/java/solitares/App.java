package solitares;

/**
 * The entry point of the program.
 * Creates objects that represent the solar system and prints them out.
 */

public class App {
  /**
   * The entry point of the program.
   * Creates objects that represent the solar system and prints them out.
   *
   * @param args The command-line arguments passed to the program.
   */

  public static void main(String[] args) {
    // Create the star
    Star sun = new Star("Sun", 696342);

    // Create the planets
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

    // Create the moons
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

    // Print the solar system
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
