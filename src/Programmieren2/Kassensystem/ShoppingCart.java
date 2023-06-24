package Programmieren2.Kassensystem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingCart {

  private final ArrayList<Item> items = new ArrayList<>();

  public ShoppingCart() {

  }

  public void createItem(Goods goods, int amount) {
    items.add(new Item(goods, amount));
  }

  public double getTotal() {
    double total = 0;
    for(Item item :items){
      total += item.getSubTotal();
    }
    return total;
  }
}
