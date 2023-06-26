package Programmieren2;

import Programmieren2.VideoGameConsoles.Maker;
import Programmieren2.VideoGameConsoles.VideoGameConsole;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class JavaStreamApi01 {

  //Lösungen in dhbw-java JavaStreamAPI01 (leichte Unterschiede)
  public static void main(String[] args) {
    ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();

    System.out.println(" \n aktuell noch verkauft");
    videoGameConsoles.stream().filter(v -> v.lifespan() == -1).forEach(
        System.out::println);

    System.out.println("\n absteigend nach titel");
    videoGameConsoles.stream().sorted((m1, m2) -> Integer.compare(m2.lifespan(), m1.lifespan()))
        .forEach(System.out::println);

    System.out.println("\n gibt es mehr als 150 mio Verkäufe?");
    boolean bool = videoGameConsoles.stream().anyMatch(m -> m.soldUnits() > 150);
    System.out.println(bool);

    System.out.println("\n Wurde von allen Konsolen mehr als 50mio verkauft?");
    bool = videoGameConsoles.stream().allMatch(m -> m.soldUnits() > 50);
    System.out.println(bool);

    System.out.println("\n alle Konsolen von Nintendo");
    double d = videoGameConsoles.stream().filter(m -> m.maker().equals(Maker.NINTENDO)).count();
    System.out.println(d);

    System.out.println("\n namen nicht mehr verkauft + anzahl");
    videoGameConsoles.stream().filter(m -> m.lifespan() > 0)
        .forEach(m -> System.out.println(m.title() + "(" + (m.soldUnits() / m.lifespan()) + ")"));

    System.out.println("\n durchschnitt verkaufter konsolen pro Jahr");
    OptionalDouble averageConsoles = null;
    averageConsoles = videoGameConsoles.stream().filter(m -> m.lifespan() > 0)
        .mapToDouble(m -> m.soldUnits() / m.lifespan()).average();
    averageConsoles.ifPresentOrElse(System.out::println,
        () -> System.out.println("Der Durchschnitt konnte nicht berechnet werden"));

    System.out.println("\n Konsolen gruppiert nach Herstellern");
    videoGameConsoles.stream().collect(Collectors.groupingBy(
        VideoGameConsole::maker)).forEach((m, v) -> System.out.println(m + ":" + v));

    System.out.println("\n Anzahl verkaufter einheiten in Millionen");
    videoGameConsoles.stream().collect(Collectors.groupingBy(v -> v.maker()))
        .forEach((v1, v2) -> System.out.println(v2));

  }
}
