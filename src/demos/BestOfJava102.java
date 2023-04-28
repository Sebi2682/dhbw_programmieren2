package demos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class BestOfJava102 {

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();

    System.out.println("Jahr: " + now.getYear());
    System.out.println("Monat: " + now.getMonthValue());
    System.out.println("Tag: " + now.getDayOfMonth());
    System.out.println("Tag im Jahr: " + now.getDayOfYear());

    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      int month = random.nextInt(12) + 1;
      System.out.println(month);

      LocalDate date = LocalDate.of(2023, month, 1);

      String season;

      season = switch (month) {
        case 12, 1, 2 -> "Winter";
        case 3, 4, 5 -> "Frühling";
        case 6, 7, 8 -> "Sommer";
        case 9, 10, 11 -> "Herbst";
        default -> "";
      };

      System.out.println(date.getMonth() + ": " + season);

    }

  }
}
