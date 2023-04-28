package demos;

import demos.movie.Movie02;
import java.util.ArrayList;

public class BestOfJava103 {

  public static void main(String[] args) {

    Movie02 movie1 = new Movie02("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);
    Movie02 movie2 = new Movie02("John Wick 4", new ArrayList<>(), "2023", 169, 8.4, 61087);

    System.out.println(movie1);
    System.out.println(movie2);

    System.out.println(movie1.equals(movie2));
    System.out.println("movie1.hashCode(): " + movie1.hashCode());
    System.out.println("movie2.hashCode(): " + movie2.hashCode());

    System.out.println("movie1.identityHashCode(): " + System.identityHashCode(movie1));
    System.out.println("movie2.identityHashCode(): " + System.identityHashCode(movie2));

  }
}
