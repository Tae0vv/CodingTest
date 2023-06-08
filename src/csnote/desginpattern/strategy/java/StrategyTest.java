package csnote.desginpattern.strategy.java;

public class StrategyTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item A = new Item("A",100);
        Item B = new Item("B",300);

        shoppingCart.addItem(A);
        shoppingCart.addItem(B);

        shoppingCart.pay(new KakaoCardStrategy("123","123","123","123"));
        shoppingCart.pay(new LunaCardStrategy("abc","abc"));
    }
}
