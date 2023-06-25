package Programmieren2.Messdaten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MessdatenStreamAPI {

  public static void main(String[] args) {
    ArrayList<MeasurementData> measurementData = MeasurementData.getMeasurementData();

    measurementData.stream().filter((m) -> m.category() == 'F')
        .filter((m) -> m.date().getYear() == 2023)
        .sorted((m1, m2) -> Integer.valueOf(m2.percentage()).compareTo(m1.percentage())).forEach(
            System.out::println
        );

    System.out.println(
        measurementData.stream().filter((m) -> m.category() == 'X').mapToInt(m -> m.percentage())
            .average());

    measurementData.stream().filter(
            m -> m.date().getMonthValue() == 6 || m.date().getMonthValue() == 7
                || m.date().getMonthValue() == 8).filter(m -> m.temperature() >= 30)
        .forEach(System.out::println);

    System.out.println(measurementData.stream().filter(m -> m.country().equals("Deutschland"))
        .filter(m -> m.date().of(2022, 1, 1).equals(true)).anyMatch(m -> m.percentage() >= 50));

    measurementData.stream().collect(Collectors.groupingBy(m -> m.country())).forEach(
        (c, m) -> System.out.println(c + ":" + m.stream().mapToInt(s -> s.percentage()).average()));

    measurementData.stream().map(m -> m.percentage() > 89 ? "90-100"
            : m.percentage() > 79 ? "80-90"
                : m.percentage() > 69 ? "70-80"
                    : m.percentage() > 59 ? "50-60"
                        : m.percentage() > 49 ? "40-50"
                            : m.percentage() > 39 ? "30-40"
                                : m.percentage() > 29 ? "20-30"
                                    : m.percentage() > 19 ? "10-20" : "0-10")
        .collect(Collectors.groupingBy(p -> p))
        .forEach((m, r) -> System.out.println(m + ":" + r.size()));

  }


}
