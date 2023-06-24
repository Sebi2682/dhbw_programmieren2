package Programmieren2.Probeklausuren.Wiederholklausur2_2023_Q1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DataQueries {

  private static ArrayList<Data> data = Data.getData();

  static List<Data> a() {
    return data.stream().filter(r -> r.shapeType.equals(ShapeType.RECTANGLE))
        .sorted((r1, r2) -> Integer.compare(r1.percentage, r2.percentage))
        .collect(Collectors.toList());
  }
}
