package Programmieren2.Warenkorb;

import java.util.ArrayList;

public class ShoppingCart<T extends Sellable> {

  private final ArrayList<Item> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public void addItem(T sellable, int amount) {
    items.add(new Item(sellable, amount));
  }

  public void removeItem(T sellable) {
    for (Item i : items) {
      if (i.sellable.equals(sellable)) {
        items.remove(i);
      }
    }
  }

  public double getTotal() {
    double total = 0;
    for (Item i : items) {
      total += i.getSubTotal();
    }
    return total;
  }

  public class Item {

    private final T sellable;
    private final int amount;

    private Item(T sellable, int amount) {
      this.sellable = sellable;
      this.amount = amount;
    }

    public double getSubTotal() {
      return amount * sellable.price();
    }

    public T getSellable() {
      return sellable;
    }

    public int getAmount() {
      return amount;
    }
  }
}
