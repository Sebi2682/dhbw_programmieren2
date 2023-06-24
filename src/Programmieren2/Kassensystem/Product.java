package Programmieren2.Kassensystem;

public class Product {

  private final int id;
  private final String description;
  private final String unit;
  private double price;
  private Currency currency;

  public Product(int id, String description, String unit, double price, Currency currency) {
    this.id = id;
    this.description = description;
    this.unit = unit;
    this.price = price;
    this.currency = currency;
  }

  public int getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public String getUnit() {
    return unit;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
}
