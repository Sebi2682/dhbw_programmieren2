package Programmieren2.Probeklausuren.Wiederholklausur2_2023_Q1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ShapesTest {

  private static Shapes shapes;
  private static Rectangle rectangle;
  private static Circle circle;

  @BeforeAll
  void setUp() {
    shapes = new Shapes(new HashMap<Shape, Integer>());
    rectangle = new Rectangle(4, 2);
    circle = new Circle(2);
    try {
      shapes.addEntry(rectangle, 1);
      shapes.addEntry(circle, 1);
    } catch (InvalidAmountException | NullObjectException e) {
      System.out.println(e);
    }
  }

  @Test
  void testAddEntry() {
    assertThrows(NullObjectException.class, () -> shapes.addEntry(null, 1));
    assertThrows(InvalidAmountException.class, () -> shapes.addEntry(circle, 0));
  }

  @Test
  void testGetShapeWithLargestArea() {
    assertEquals(circle(2), shapes.getShapeWithLargestArea());
  }


}
