package demos;

public class DuplicateKeyException extends Exception {
  public DuplicateKeyException(){
    super("The author is already in the collection");
  }
}
