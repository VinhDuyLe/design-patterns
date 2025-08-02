package Basics.OOPS;

import java.sql.SQLOutput;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String userName) {
        super(cardNumber, userName);
    }

    @Override
    public void pay() {
        System.out.println("Makeing payment for credit card");
    }
}
