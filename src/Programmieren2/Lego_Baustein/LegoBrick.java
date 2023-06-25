package Programmieren2.Lego_Baustein;

public abstract class LegoBrick extends Lego{
  private final int[] dimensions;
  private final String color;

  public int[] getDimensions() {
    return dimensions;
  }

  public String getColor() {
    return color;
  }

  public LegoBrick(int id, int[] dimensions, String color){
    super(id);
    this.dimensions = dimensions;
    this.color = color;
  }
}
