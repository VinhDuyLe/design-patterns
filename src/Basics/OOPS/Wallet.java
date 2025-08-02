package Basics.OOPS;

public class Wallet implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Wallet payment method");
    }
}
