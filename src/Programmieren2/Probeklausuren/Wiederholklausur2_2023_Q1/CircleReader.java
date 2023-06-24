package Programmieren2.Probeklausuren.Wiederholklausur2_2023_Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleReader {

  public ArrayList<Circle> readCircles(File file) throws FileNotFoundException {
    ArrayList<Circle> circles = new ArrayList<>();
    Scanner sc = new Scanner(file);
    while (sc.hasNextLine()) {
      circles.add(new Circle(Integer.parseInt(sc.nextLine())));
    }
    return circles;
  }
}
