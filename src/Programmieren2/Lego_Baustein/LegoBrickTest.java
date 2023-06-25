package Programmieren2.Lego_Baustein;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


public class LegoBrickTest {
  static LegoBrick4x2x1 legoBrick4x2x1;
  static LegoBrick2x2x2 legoBrick2x2x2;
  static LegoBrickVolumeComparator legoBrickVolumeComparator;

    @BeforeAll
  static void setup(){
      legoBrickVolumeComparator = new LegoBrickVolumeComparator();
      legoBrick4x2x1 = new LegoBrick4x2x1(1,"Gelb");
      legoBrick2x2x2 = new LegoBrick2x2x2(2,"Gelb");
    }

    @Test
  void VolumeComparatorTest(){
      assertEquals(0, legoBrickVolumeComparator.compare(legoBrick4x2x1, legoBrick2x2x2));
    }
}
