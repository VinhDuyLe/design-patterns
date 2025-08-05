package Basics.OOPS;

abstract public class Card implements PaymentMethod {
    protected String cardNumber;
    protected String userName;

    public Card(String cardNumber, String userName) {
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getUserName() {
        return userName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    abstract void pay(); //abstract due to don;t know how to implement, now using interface
}
