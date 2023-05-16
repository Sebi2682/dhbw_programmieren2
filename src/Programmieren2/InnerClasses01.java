package Programmieren2;

public class InnerClasses01 {

  public static void main(String[] args) {
    House house = new House();

    house.addRoom(house.new Room("Wohnzimmer"));
    house.addRoom(house.new Room("Kueche"));
    house.addRoom(house.new Room("Toilette"));
    house.addRoom(house.new Room("Flur"));
    house.addRoom(house.new Room("Schlafzimmer"));

    house.displayRooms();
  }


}
