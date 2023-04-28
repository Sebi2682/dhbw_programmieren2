package demos;

public class CrateIndexOutOfBoundException extends Exception {
  public CrateIndexOutOfBoundException(int box) {
    super("there is no Crate with the number: " + box);
  }
}
