package Programmieren2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

public class BookCollection {

  // List<Book> books = new ArrayList<>();
  private HashMap<Author, List<Book>> collection = new HashMap<>();

  public void addAuthor(Author author) throws DuplicateKeyException {
    if (collection.containsKey(author)) {
      throw new DuplicateKeyException();
    }
    collection.put(author, new ArrayList<>());

  }

  public void addBook(Author author, Book book) {
    if (!collection.containsKey(author)) {
      collection.put(author, new ArrayList<>());
    }
    collection.get(author).add(book);
  }

  public Optional<Author> getMostDiligentAuthor() {
    Author author = null;
    int anzahl = 0;
    for (Entry<Author, List<Book>> entry : collection.entrySet()) {
      if (entry.getValue().size() > anzahl) {
        author = entry.getKey();
        anzahl = entry.getValue().size();
      }
    }
    assert author != null;
    return Optional.of(author);
  }

  public Optional<Book> getBookByTitle(String Title) {
    for (Entry<Author, List<Book>> entry : collection.entrySet()) {
      for (Book b : entry.getValue()) {
        if (b.title.equals(Title)) {
          return Optional.of(b);
        }
      }
    }
    return Optional.empty();
  }

  public record Author(String name) {

  }

  ;

  public record Book(String title) {

  }

  ;
}
