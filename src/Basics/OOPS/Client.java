package Basics.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        ps.addPaymentMethod("VinhDebitCard", new DebitCard("5678", "ABC DE"));
        ps.addPaymentMethod("VinhCreditCard", new CreditCard("1234", "ABC DE"));
        ps.addPaymentMethod("VinhUPI", new UPI("VinhUPI123"));

        ps.makePayment("VinhUPI");
        ps.makePayment("VinhDebitCard");


    }
}
