package Programmieren2.Kassensystem;

import java.util.ArrayList;

public class CashierSystem {

  private final String name;
  private final ArrayList<Goods> goods = new ArrayList<>();
  private final ArrayList<Cashier> cashiers = new ArrayList<>();
  private int amount;
  private ShoppingCart shoppingcart;
  private Cashier cashier;

  {

  }

  public CashierSystem(String name) {
    this.name = name;
  }

  public void addGoods(Goods goods) {
    this.goods.add(goods);
  }

  public void addCashier(Cashier cashier) {
    cashiers.add(cashier);
  }

  public void login(int id) {

  }

  public void createShoppingCart() {

  }

  public void addItem(int id) {

  }

  public void printBon() {

  }
}
