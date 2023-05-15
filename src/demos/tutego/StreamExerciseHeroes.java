package demos.tutego;

import demos.tutego.Heroes.Hero;
import demos.tutego.Heroes.Hero.Sex;
import java.util.List;
import java.util.function.Consumer;

public class StreamExerciseHeroes {

  public static void main(String[] args) {
    List<Hero> heroes = Heroes.ALL;

    // Aufgabe 1
    Consumer<Hero> csvPrinter =
        hero -> System.out.printf("%s,%s,%s%n",
            hero.name(), hero.sex(), hero.yearFirstAppearance());
    heroes.stream().forEach(csvPrinter);
    System.out.println("-----");

    // Aufgabe 2
    heroes.stream().filter(hero -> hero.yearFirstAppearance() <= 1900).forEach(System.out::println);
    System.out.println("-----");

    //Aufgabe 3 Frage, ob irgendein weiblicher Held nach 1950 (inklusiv) eingeführt wurde.
    heroes.stream().filter(hero -> hero.yearFirstAppearance() >= 1950)
        .filter(hero -> hero.sex().compareTo(
            Sex.FEMALE) > 0).forEach(System.out::println);


  }

}
