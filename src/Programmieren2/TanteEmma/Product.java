package Programmieren2.TanteEmma;

public abstract class Product {
  private final String description;
  private double price;

  public Product(String description, double price){
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
