package Programmieren2.movie;

import java.util.ArrayList;
import java.util.Objects;

public class Movie02 {

  private final String title;
  private final ArrayList<String> genres;
  private final String year;
  private final int runtimeInMinutes;
  private final double rating;
  private final int votes;


  public Movie02(String title, ArrayList<String> genres, String year, int runtimeInMinutes,
      double rating,
      int votes) {
    super();
    this.title = title;
    this.genres = genres;
    this.year = year;
    this.runtimeInMinutes = runtimeInMinutes;
    this.rating = rating;
    this.votes = votes;
  }

  public String getTitle() {
    return title;
  }

  public ArrayList<String> getGenres() {
    return genres;
  }

  public String getYear() {
    return year;
  }

  public int getRuntimeInMinutes() {
    return runtimeInMinutes;
  }

  public double getRating() {
    return rating;
  }

  public int getVotes() {
    return votes;
  }

  @Override
  public String toString() {
    return "Movie02{" +
        "title='" + title + '\'' +
        ", genres=" + genres +
        ", year='" + year + '\'' +
        ", runtimeInMinutes=" + runtimeInMinutes +
        ", rating=" + rating +
        ", votes=" + votes +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movie02 movie02 = (Movie02) o;
    return runtimeInMinutes == movie02.runtimeInMinutes
        && Double.compare(movie02.rating, rating) == 0 && votes == movie02.votes
        && Objects.equals(title, movie02.title) && Objects.equals(genres,
        movie02.genres) && Objects.equals(year, movie02.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, genres, year, runtimeInMinutes, rating, votes);
  }
}

