package Programmieren2;

import Programmieren2.BookCollection.Author;
import Programmieren2.BookCollection.Book;

public class Maps02 {

  public static void main(String[] args)  {
    BookCollection regal = new BookCollection();
    regal.addBook(new Author("Hans"), new Book("Buch1"));
    regal.addBook(new Author("Peter"), new Book("Buch2"));
    regal.addBook(new Author("Sarah"), new Book("Buch3"));
    regal.addBook(new Author("Hans"), new Book("Buch4"));
    regal.addBook(new Author("Hans"), new Book("Buch5"));
    try {
      regal.addAuthor(new Author("Lara"));
    }catch(DuplicateKeyException e){
      System.out.println(e);
    }

    System.out.println(regal.getBookByTitle("Buch3").get());
    System.out.println(regal.getMostDiligentAuthor().get());
  }
}
