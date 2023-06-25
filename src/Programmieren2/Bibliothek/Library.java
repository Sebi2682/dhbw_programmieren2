package Programmieren2.Bibliothek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public record Library(String name, HashMap<Book, Status> books) {

  public void addBook(Book book) {
    books.put(book, Status.AVAILABLE);
  }

  public Book getBookByTitle(String title) {
    for (Entry<Book, Status> entry : books.entrySet()) {
      if (entry.getKey().getTitle().equals(title)) {
        return entry.getKey();
      }
    }
    return null;
  }

  public ArrayList<PaperBook> getPaperBooksByStatus(Status status) {
    ArrayList<PaperBook> paperBooks = new ArrayList<>();
    for(Entry<Book,Status> entry : books.entrySet()){
      if(entry.getValue().equals(status)){
        if(entry.getKey()instanceof PaperBook) {
          paperBooks.add((PaperBook) entry.getKey());
        }
      }
    }
    return paperBooks;
  }


}
