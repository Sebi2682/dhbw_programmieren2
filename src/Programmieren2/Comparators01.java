package Programmieren2;

import java.util.ArrayList;

public class Comparators01 {

  public static void main(String[] args) {
    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(5, 10));
    coordinates.add(new Coordinate(3, 7));
    coordinates.add(new Coordinate(8, 5));
    coordinates.add(new Coordinate(1, 1));

    coordinates.sort(Coordinate::compareTo);

    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
    System.out.println();
    coordinates.forEach(System.out::println);


  }


}
