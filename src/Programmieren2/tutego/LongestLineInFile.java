package Programmieren2.tutego;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;


public class LongestLineInFile {

  public static void main(String args[]) throws IOException {
    String filename = "src/demos/Programmieren2.tutego/family-names";
    Collection<String> names = Files.readAllLines(Paths.get(filename));

    String longestName = "";

    for (String s : names) {
      if (s.length() > longestName.length()) {
        longestName = s;
      }
    }
    System.out.println(longestName + " Länge: " + longestName.length());

    String[] strings = {"1", "234", "333"};
    parseInts(strings);
    parseInts( "1", "234", "333" );                      // [1, 234, 333]
    parseInts( "1", "ll234", "3", null, "99" );          // [1, 0, 3, 0, 99]
    parseInts( "Person", "Woman", "Man", "Camera, TV" ); // [0, 0, 0, 0, 0]


  }

  static int[] parseInts(String... numbers) {
    int[] zahlen = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {

        zahlen[i] = parseIntOrElse(numbers[i],0);

    }
    for(int i : zahlen){
      System.out.print(i);
      System.out.print(", ");
    }
    System.out.println();
    return zahlen;
  }

  private static int parseIntOrElse( String number, int defaultValue ) {
    try {
      return Integer.parseInt( number );
    }
    catch ( NumberFormatException e ) {
      return defaultValue;
    }
  }


}

