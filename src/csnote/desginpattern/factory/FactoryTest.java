package csnote.desginpattern.factory;

public class FactoryTest {
    public static void main(String[] args) {

        Coffee latte = CoffeeFactory.getCoffee("Latte",4000);
        Coffee ame = CoffeeFactory.getCoffee("americano",3000);
        System.out.println("라떼 : " + latte);
        System.out.println("아메 : " + ame);
    }
}
