package org.example.Day_7;
interface PaymentGateway
{
    double balance=1000;
    void pay(double amount);
}
class CreditCardPayment implements PaymentGateway
{
    static double creditbalance=balance;
    @Override
    public void pay(double amount) {
       creditbalance+=amount;
        System.out.println("CreditCardPayment: "+creditbalance);
    }

}
class DebitCardPayment implements PaymentGateway
{
    static double debitbalance=balance;
    @Override
    public void pay(double amount) {
        debitbalance+=amount;
        System.out.println("DebitCardPayment: "+debitbalance);
    }
}
class UPIPayment implements PaymentGateway
{
    static double upibalance=balance;
    @Override
    public void pay(double amount) {
        upibalance+=amount;
        System.out.println("UPIPayment: "+upibalance);
    }
}
public class PaymentInterface {
    public static void main(String args[])
    {
        CreditCardPayment creditCardPayment=new CreditCardPayment();
        creditCardPayment.pay(1000);
        creditCardPayment.pay(500);
        DebitCardPayment debitCardPayment=new DebitCardPayment();
        debitCardPayment.pay(600);
        debitCardPayment.pay(100);
        UPIPayment upiPayment=new UPIPayment();
        upiPayment.pay(500);
        upiPayment.pay(600);

    }
}
