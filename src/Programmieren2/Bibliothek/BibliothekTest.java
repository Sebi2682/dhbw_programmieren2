package Programmieren2.Bibliothek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BibliothekTest {

  static Library library;
  static EBook ebook;
  static PaperBook paperBook;
  static PaperBook paperBook2;

  @BeforeAll
  static void setUp() throws WrongFileSizeException {
    library = new Library("Bücherei", new HashMap<>());
    ebook = new EBook(new Author("Hans", "deutsch"), "Der Gebildete", FileFormat.AZW, 100);
    paperBook = new PaperBook(new Author("Peter", "französisch"), "Das Abenteuer", 500);
    paperBook2 = new PaperBook(new Author("Lara", "englisch"), "Die FLucht", 600);
    library.addBook(paperBook2);
    library.addBook(ebook);
    library.addBook(paperBook);
  }


  @Test
  void EBookTest() {
    assertThrows(WrongFileSizeException.class,
        () -> new EBook(new Author("Hans", "deutsch"), "Der Gebildete", FileFormat.AZW, 0));
  }

  @Test
  void getBookByTitleTest() {
    assertEquals(ebook, library.getBookByTitle("Der Gebildete"));
  }

  @Test
  void getPaperBooksByStatusTest() {
    ArrayList<PaperBook> papierBuecher = new ArrayList<>();
    papierBuecher.add(paperBook);
    papierBuecher.add(paperBook2);

    assertEquals(papierBuecher, library.getPaperBooksByStatus(Status.AVAILABLE));
  }
}
