package Programmieren2.Warenkorb;

public record ShoppingPortal(String user, ShoppingCart<Product> shoppingCart) {

  public void addProductToShoppingCart(Product product, int amount) {
    shoppingCart.addItem(product, amount);
  }

  public void removeProductFromShoppingCart(Product product) {
    shoppingCart.removeItem(product);
  }

  public void clearShoppingCart() {
    int i = 0;
    while (!shoppingCart.getItems().isEmpty()) {
      shoppingCart.getItems().remove(i);
      i++;
    }
  }
}
