package Programmieren2.Probeklausuren.Probeklausur2017_Q2;

import java.util.HashMap;

public class Library implements Loanable<Book>{
  private String name;
  private HashMap<Book, Status> books;
  public Library(String name){
    books = new HashMap<Book, Status>();
    this.name = name;
  }

  public HashMap<Book, Status> getBook(String id){
    for(HashMap<Book, Status> entry : books){
      if(entry.getKey().getId().equals(id)) return entry;
    }
    return null;
  }


}
