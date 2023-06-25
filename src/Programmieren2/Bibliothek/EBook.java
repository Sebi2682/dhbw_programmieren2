package Programmieren2.Bibliothek;

public final class EBook extends Book {
  private final FileFormat fileFormat;
  private final int fileSize;

  public EBook(Author author, String title, FileFormat fileFormat, int fileSize) throws WrongFileSizeException{
    super(author, title);
    this.fileFormat = fileFormat;
    if(fileSize <= 0){
      throw new WrongFileSizeException();
    }
      this.fileSize = fileSize;
  }

  public FileFormat getFileFormat() {
    return fileFormat;
  }

  public int getFileSize() {
    return fileSize;
  }
}
