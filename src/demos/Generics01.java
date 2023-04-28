package demos;

public class Generics01 {

  public static void main(String[] args) {

    Crate<Bottle> Kiste = new Crate<Bottle>();
    WineBottle Wein = new WineBottle();
    BeerBottle Bier = new BeerBottle();
  try {
    Kiste.insertBottle(Wein, 2);
    Kiste.insertBottle(Bier, 3);
    Kiste.insertBottle(new WineBottle(), 1);
    Kiste.insertBottle(new BeerBottle(), 4);

    if(Kiste.takeBottle(4) instanceof BeerBottle beerBottle ){
      beerBottle.chugALug();
    }
  }catch(CrateIndexOutOfBoundException e){
    System.out.println(e);
  }
  }

}
