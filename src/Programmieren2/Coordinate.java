package Programmieren2;

public class Coordinate implements Comparable<Coordinate> {

  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public double getDistanceToOriginPoint() {
    return Math.hypot(x, y);
  }


  @Override
  public int compareTo(Coordinate o) {
    return Double.valueOf(this.getDistanceToOriginPoint()).compareTo(o.getDistanceToOriginPoint());
  }

  @Override
  public String toString() {
    return "Coordinate [x=" + x + ", y=" + y + ", getDistanceToOriginPoint()="
        + getDistanceToOriginPoint() + "]";
  }
}
