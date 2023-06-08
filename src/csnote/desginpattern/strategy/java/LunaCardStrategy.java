package csnote.desginpattern.strategy.java;

public class LunaCardStrategy implements PaymentStrategy{

    private String emailId;
    private String password;

    public LunaCardStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "루나");
    }
}
