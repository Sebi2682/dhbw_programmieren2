package Programmieren2.Bibliothek;

public final class PaperBook extends Book{
  private final int pages;

  public PaperBook(Author author, String title, int pages){
    super(author, title);
    this.pages = pages;
  }

  public int getPages() {
    return pages;
  }
}
