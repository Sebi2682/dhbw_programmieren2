package Programmieren2.Kassensystem;

public class Goods extends Product{
  private final ClassOfGoods classOfGoods;

  public Goods(int id, String description, double price, Currency currency, ClassOfGoods classOfGoods){
  this.classOfGoods = classOfGoods;
  }
}
