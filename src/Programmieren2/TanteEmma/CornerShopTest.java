package Programmieren2.TanteEmma;

import static Programmieren2.TanteEmma.ClassOfGoods.BAKERY_PRODUCTS;
import static Programmieren2.TanteEmma.ClassOfGoods.DAIRY_PRODUCTS;
import static Programmieren2.TanteEmma.ClassOfGoods.FRUITS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.sun.jdi.connect.Connector.IntegerArgument;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CornerShopTest {

  CornerShop cornerShop;
  Goods good1;

  @BeforeEach
  void setUp() {
    good1 = new Goods("Butter", 2.5, DAIRY_PRODUCTS, "5");

    cornerShop = new CornerShop("Laden", new TreeMap<>());
    cornerShop.store().put(good1, 10);
    cornerShop.store().put(new Goods("Milch", 1.3, DAIRY_PRODUCTS, "4"), 5);

    cornerShop.store().put(new Goods("Brot", 5, BAKERY_PRODUCTS, "3"), 2);

    cornerShop.store().put(new Goods("Banane", 0.5, FRUITS, "2"), 7);

    cornerShop.store().put(new Goods("Chips", 1, BAKERY_PRODUCTS, "1"), 3);

  }

  @Test
  public void getEntryByDescriptionTest() {
    assertEquals(good1, cornerShop.getEntryByDescription("Butter").getKey());
    assertEquals(10, cornerShop.getEntryByDescription("Butter").getValue());
  }

  @Test
  public void buyGoodsTest() {
    cornerShop.buyGoods(good1, 1);
    assertEquals(11, cornerShop.getEntryByDescription("Butter").getValue());

  }

  @Test
  public void sellGoodsThrowsThrowsOutOfStockException(){
    assertThrows(OutOfStockException.class,() -> cornerShop.sellGoods(good1, 12));
  }

  @Test
  public void sellGoodsTest() throws OutOfStockException{
    cornerShop.sellGoods(good1, 1);
    assertEquals(9,cornerShop.getEntryByDescription("Butter").getValue());
  }


}
