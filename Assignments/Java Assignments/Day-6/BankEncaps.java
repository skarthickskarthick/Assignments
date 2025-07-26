package org.example.Day_6;
class BankAccount
{
  private   int accountnumber;
   private String accountholdername;
   private double balance;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountholdername() {
        return accountholdername;
    }

    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
       balance+=amount;
       System.out.println("amount deposited");
        System.out.println("Available balance: "+balance);
    }
    public void withdraw(double amount)
    {
        if(amount<=balance) {
            balance -= amount;
            System.out.println("amount withdrawn");

        }
        else {
            System.out.println("no available balance");
        }
        System.out.println("Available balance: "+balance);
    }
}
public class BankEncaps {
    public static void main(String args[])
    {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountnumber(1);
        bankAccount.setAccountholdername("karthick");
        System.out.println("acno: "+bankAccount.getAccountnumber()+" name: "+bankAccount.getAccountholdername());
        bankAccount.setBalance(400);
        bankAccount.withdraw(1000);
        bankAccount.deposit(100);
        bankAccount.withdraw(100);
    }
}
