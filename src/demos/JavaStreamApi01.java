package demos;

import demos.VideoGameConsoles.Maker;
import demos.VideoGameConsoles.VideoGameConsole;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class JavaStreamApi01 {

  public static void main(String[] args) {
    ArrayList<VideoGameConsole> videoGameConsoles = VideoGameConsoles.getVideoGameConsoles();
    System.out.println(" \n aktuell noch verkauft");
    videoGameConsoles.stream().filter(v -> v.lifespan() == -1).forEach(
        System.out::println);

    System.out.println("\n absteigend nach titel");
    videoGameConsoles.stream().sorted((m1, m2) -> Integer.compare(m2.lifespan(), m1.lifespan()))
        .forEach(System.out::println);

    System.out.println("\n gibt es mehr als 150 mio verkäufe");
    boolean bool = videoGameConsoles.stream().anyMatch(m -> m.soldUnits() > 150);
    System.out.println(bool);

    System.out.println("\n Wurde von allen Konsolen mehr als 50mio verkauft");
    bool = videoGameConsoles.stream().allMatch(m -> m.soldUnits() > 50);
    System.out.println(bool);

    System.out.println("\n alle Konsolen von Nintendo");
    double d = videoGameConsoles.stream().filter(m -> m.maker().equals(Maker.NINTENDO)).count();
    System.out.println(d);

    System.out.println("\n namen nicht mehr verkauft + anzahl");
    videoGameConsoles.stream().filter(m -> m.lifespan() > 0)
        .forEach(m -> System.out.println(m.title() + "(" + (m.soldUnits() / m.lifespan() )+ ")"));

    System.out.println("\n durchschnitt verkaufter konsolen pro Jahr");
    OptionalDouble averae = null;
    averae = videoGameConsoles.stream().filter(m -> m.lifespan() >0 ).mapToDouble(m -> m.soldUnits()/m.lifespan()).average();
    System.out.println(averae);

    System.out.println("\n Konsolen gruppiert nach Herstellern");
    System.out.println(videoGameConsoles.stream().collect(Collectors.groupingBy(
        VideoGameConsole::maker)));

    System.out.println("\n Anzahl verkaufter einheiten in Millionen");
    videoGameConsoles.stream().collect(Collectors.groupingBy(v -> v.maker())).forEach((v1, v2) -> System.out.println(v2));


  }
}
