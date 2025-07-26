package org.example.Day_6;
enum Status
{
    success,failure
}
 class Transaction {
    private int  transactionID;
    private String payername;
   private String payeename;
   private double amount;
   private String paymentmethod;
   private  Status status;



    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername;
    }

    public String getPayeename() {
        return payeename;
    }

    public void setPayeename(String payeename) {
        this.payeename = payeename;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
public class TransactionEncaps {
    public static void main(String args[])
    {
        Transaction transaction=new Transaction();
        transaction.setTransactionID(1);
        transaction.setPayeename("karthick");
        transaction.setPayername("bala");
        transaction.setPaymentmethod("cash");
        transaction.setAmount(1200000);
        transaction.setStatus(Status.success);
        System.out.println("Id: "+transaction.getTransactionID()+" Payeename: "+transaction.getPayeename()+" Payername: "+transaction.getPayername()+" payment method: "+transaction.getPaymentmethod()+" Amount: "+transaction.getAmount()+" Status: "+transaction.getStatus());
    }
}
