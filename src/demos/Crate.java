package demos;

public class Crate<T> {

  public T box1;
  public T box2;
  public T box3;
  public T box4;
  public T box5;
  public T box6;

  public void insertBottle(T bottle, int box) throws CrateIndexOutOfBoundException {
    if (box < 1 || box > 6) {
      throw new CrateIndexOutOfBoundException(box);
    }
    switch (box) {
      case 1:
        box1 = bottle;
      case 2:
        box2 = bottle;
      case 3:
        box3 = bottle;
      case 4:
        box4 = bottle;
      case 5:
        box5 = bottle;
      case 6:
        box6 = bottle;
    }
  }

  public T takeBottle(int box) throws CrateIndexOutOfBoundException{
    if (box < 1 || box > 6) {
      throw new CrateIndexOutOfBoundException(box);
    }
    switch (box) {
      case 1:
        return box1;
      case 2:
        return box2;
      case 3:
        return box3;
      case 4:
        return box4;
      case 5:
        return box5;
      default:
        return box6;
    }

  }

}
