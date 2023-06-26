package Programmieren2.Planeten;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PlanetQueries {

  public static void main(String[] args) {
    ArrayList<Planet> planets = Planet.getPlanets();

    planets.stream().filter(m -> m.moons() >= 5).forEach(System.out::println);

    System.out.println(planets.stream().filter(m -> m.type().equals(Type.GAS_PLANET))
        .mapToDouble(m -> m.diameter()).average());

    planets.stream().sorted((p1, p2) -> Double.valueOf(p2.mass()).compareTo(p1.mass()))
        .forEach(
            System.out::println);

    System.out.println(planets.stream().allMatch(m -> m.moons() >= 1));

    planets.stream().collect(Collectors.groupingBy(m -> m.type()))
        .forEach((t, p) -> System.out.println(t + ": " + p));


  }
}
