package Programmieren2;

import java.util.Optional;

public class Crate<T extends Bottle> {

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
      case 1 -> box1 = bottle;
      case 2 -> box2 = bottle;
      case 3 -> box3 = bottle;
      case 4 -> box4 = bottle;
      case 5 -> box5 = bottle;
      default -> box6 = bottle;
    }
  }

  public Optional<T> takeBottle(int box) throws CrateIndexOutOfBoundException {
    if (box < 1 || box > 6) {
      throw new CrateIndexOutOfBoundException(box);
    }
    return switch (box) {
      case 1 -> Optional.of(box1);
      case 2 -> Optional.of(box2);
      case 3 -> Optional.of(box3);
      case 4 -> Optional.of(box4);
      case 5 -> Optional.of(box5);
      default -> Optional.of(box6);
    };

  }

}
