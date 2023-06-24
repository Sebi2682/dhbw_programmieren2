package Programmieren2.Kassensystem;

public class Item {

  private final Goods goods;
  private int amount;

  public Item(Goods goods, int amount) {
    this.goods = goods;
    this.amount = amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public double getSubTotal() {
    return amount * goods.getPrice();
  }

}
