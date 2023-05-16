package Programmieren2;

import Programmieren2.movie.Genre02;
import Programmieren2.movie.Movie03;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BestOfJava105 {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Movie03> movies = new ArrayList<>();

    File file = new File("src/Programmieren2.resources/movies.csv");
    if (file.exists()) {
      System.out.println("hurra se file is da");
    }

    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");
      String title = tokens[0];
      double rating = Double.parseDouble(tokens[1]);
      int runtimeInMinutes = Integer.parseInt(tokens[2]);
      String year = tokens[3];
      int votes = Integer.parseInt(tokens[5]);

      ArrayList<Genre02> genres = new ArrayList<>();
      String[] genreTexts = tokens[4].split(",");
      for (String text : genreTexts) {
        Genre02 genre = Genre02.valueOf(text);
        genres.add(genre);
      }

      Movie03 movie = new Movie03(title, genres, year, runtimeInMinutes, rating, votes);
      movies.add(movie);
      System.out.println(line);

    }

    scanner.close();

    for (Movie03 m : movies) {
      System.out.println(m);
    }
  }
}
