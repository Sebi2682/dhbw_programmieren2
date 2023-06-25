package Programmieren2.Probeklausuren.Probeklausur2017_Q2;

import java.io.Serializable;
import java.util.UUID;

public abstract class Book implements Serializable {

  private String id;
  private Author author;
  private String title;

  public Book(Author author, String title) {
    id = UUID.randomUUID().toString();
    this.author = author;
    this.title = title;
  }

  public String getId() {
    return id;
  }

  public Author getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public static class Author{
    private String name;
    private String nationality;

    public Author(String name, String nationality){
      this.name = name;
      this.nationality = nationality;
    }

    public String getName(){return name}
    public String getNationality(){return nationality}

  }
}
