package demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BookCollection {
  private HashMap<Author, List<Book>> collection = new HashMap<>();
  List<Book> books = new ArrayList<>();

  public void addAuthor(Author author) throws DuplicateKeyException{
    if(collection.containsKey(author)){
      throw new DuplicateKeyException();
    }
    collection.put(author, books);

  }

  public void addBook(Author author, Book book){
      if(collection.containsKey(author)){
        collection.get(author).add(book);
      }else{
        collection.put(author, books);
        collection.get(author).add(book);
      }
  }

  public Author getMostDiligentAuthor(){
    Author author = null;
    int anzahl = 0;
    for (Entry<Author, List<Book>> entry : collection.entrySet()) {
      if(entry.getValue().size()> anzahl){
        author = entry.getKey();
      }
    }
    return author;
  }

  public Book getBookByTitle(String Title){
    for (Entry<Author, List<Book>> entry : collection.entrySet()) {
     for(Book b : entry.getValue()){
       if(b.title.equals(Title)){
         return b;
       }
     }
    }
    return null;
  }

  public record Author(String name){};
  public record Book(String title){};
}
