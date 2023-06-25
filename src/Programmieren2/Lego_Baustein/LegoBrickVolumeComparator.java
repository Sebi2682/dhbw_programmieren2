package Programmieren2.Lego_Baustein;

import java.util.Comparator;

public class LegoBrickVolumeComparator implements Comparator<LegoBrick> {


  public int compare(LegoBrick legoBrick1, LegoBrick legoBrick2) {
    Integer eins = 1;
    Integer zwei = 1;
    for (int i : legoBrick1.getDimensions()) {
      eins *= i;
    }
    for (int i : legoBrick2.getDimensions()) {
      zwei *= i;
    }
    return eins.compareTo(zwei);

  }
}
