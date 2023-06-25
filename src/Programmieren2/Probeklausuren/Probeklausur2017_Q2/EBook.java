package Programmieren2.Probeklausuren.Probeklausur2017_Q2;

public class EBook extends Book {

  private FileFormat fileFormat;
  private int fileSize;

  public EBook(Author author, String title, FileFormat fileFormat, int filesize) throws WrongFileSizeException{
    super(author, title);
    if(fileSize <= 0)throw new WrongFileSizeException();

    this.fileFormat = fileFormat;
    this.fileSize = filesize;
  }

  public FileFormat getFileFormat() {
    return fileFormat;
  }

  public int getFileSize() {
      return fileSize;

  }
}
