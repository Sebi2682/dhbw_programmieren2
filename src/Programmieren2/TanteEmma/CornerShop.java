package Programmieren2.TanteEmma;

import java.util.Map.Entry;
import java.util.TreeMap;

public record CornerShop(String name, TreeMap<Goods, Integer> store) {

  public Entry<Goods, Integer> getEntryByDescription(String description) {
    for (Entry<Goods, Integer> entry : store.entrySet()) {
      if (entry.getKey().getDescription().equals(description)) {
        return entry;
      }
    }
    return null;
  }

  public void buyGoods(Goods goods, int amount) {
    Entry<Goods, Integer> entry = getEntryByDescription(goods.getDescription());
    if (entry != null) {
      entry.setValue(entry.getValue() + amount);
    }
  }

  public void sellGoods(Goods goods, int amount) throws OutOfStockException {
    Entry<Goods, Integer> entry = getEntryByDescription(goods.getDescription());
    if (entry != null) {
      if (entry.getValue() < amount) {
        throw new OutOfStockException();
      }
      entry.setValue(entry.getValue() - amount);
    }
  }
}
