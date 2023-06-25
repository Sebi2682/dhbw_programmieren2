package Programmieren2.Warenkorb;

import java.util.ArrayList;

public class ShoppingCart<T extends Sellable> {
    private final ArrayList<Item> items = new ArrayList<>();

    class Item<T extends Sellable>{
        private final T sellable;
        private final int amount;

        private Item(T sellable, int amount){
            this.sellable = sellable;
            this.amount = amount;
        }

        public double getSubTotal(){
            return amount * sellable.price();
        }

        public T getSellable() {
            return sellable;
        }

        public int getAmount() {
            return amount;
        }
    }

    public ShoppingCart(){

    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(T sellable, int amount){

    }

    public void removeItem(T sellable){

    }

    public double getTotal(){
        return 0;
    }
}
