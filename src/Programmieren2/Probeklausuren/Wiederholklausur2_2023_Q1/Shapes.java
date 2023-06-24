package Programmieren2.Probeklausuren.Wiederholklausur2_2023_Q1;

import java.util.HashMap;

public record Shapes(HashMap<Shape, Integer> entries) {
  public void addEntry(Shape shape, int amount) throws NullObjectException, InvalidAmountException{
    if(shape == null) throw new NullObjectException;
    if(amount <= 0) throw new InvalidAmountException;
    entries.put(shape, amount);

  }

  public Shape getShapeWithLargestArea(){
    Shape shape = null;
    double area = 0;
    for(Entry<Shape, Integer> entry : entries.entrySet()){
      if(entry.getKey().getArea() > area){
        area = entry.getKey().getArea();
        shape == entry.getKey();
    }
    return shape;
  }

}
