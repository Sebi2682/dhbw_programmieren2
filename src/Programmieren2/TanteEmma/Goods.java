package Programmieren2.TanteEmma;

public final class Goods extends Product implements Comparable<Goods>{
    private final ClassOfGoods classOfGoods;
    private final String unit;

    public Goods(String description, double price, ClassOfGoods classOfGoods, String unit){
      super(description, price);
      this.classOfGoods = classOfGoods;
      this.unit = unit;

    }

    public int compareTo(Goods other){
      return getDescription().compareTo(other.getDescription());
    }

  public ClassOfGoods getClassOfGoods() {
    return classOfGoods;
  }

  public String getUnit() {
    return unit;
  }
}

