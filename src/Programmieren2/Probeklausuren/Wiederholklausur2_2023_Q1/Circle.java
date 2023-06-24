package Programmieren2.Probeklausuren.Wiederholklausur2_2023_Q1;

public record Circle(int r) implements Shape {
  public double getArea(){
    return Math.PI*r*r;
  }

  public int compareTo(Shape other){
    return Double.valueOf(getArea()).compareTo(other.getArea());
  }


}
