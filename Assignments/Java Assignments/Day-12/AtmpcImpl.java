package org.example.Day_12;
//atm machine
class  Accountt
{
    long pin;
    double balance;

    Accountt(long pin,double balance)
    {
        this.pin=pin;
        this.balance=balance;
    }
}
class Atmmachine
{
    private final int limit=1;
    private  int typevalue;
    private Accountt account;
    Atmmachine(int typevalue,Accountt account)
    {
        this.typevalue=typevalue;
        this.account=account;
    }
   synchronized public void create(long pin) throws InterruptedException
    {
        while (typevalue!=1)
        {
            wait();
        }
        if(pin==account.pin)
        {
            typevalue++;
            System.out.println("Account verified!");
            notifyAll();
        }
        else
        {
            System.out.println("Invalid pin!");
        }

    }
    synchronized public void withdraw(double amount) throws InterruptedException
    {
        while (typevalue!=2)
        {
            wait();
        }
        if(account.balance>=amount) {
            account.balance -= amount;
            typevalue++;
            System.out.println("Withdrawn amount");
            System.out.println("balance: "+account.balance);
            notifyAll();
        }
        else System.out.println("Unavailable balance");

    }
    synchronized public void checkbalance() throws InterruptedException
    {
        while(typevalue!=3)
        {
            wait();
        }
        System.out.println("Receipt");
        System.out.println("Available balance: "+account.balance);
        notifyAll();
    }

}
class Atmthread extends Thread
{
    Atmmachine atmmachine;
    long pin;

    Atmthread(Atmmachine atmmachine,long pin)
    {
        this.atmmachine=atmmachine;
        this.pin=pin;

    }
    public void run()
    {
        try {
            atmmachine.create(pin);
        }
        catch (InterruptedException e){}
    }
}
class Withdrawthread extends Thread
{
    Atmmachine atmmachine;
   double amount;

    Withdrawthread(double amount,Atmmachine atmmachine)
    {
        this.atmmachine=atmmachine;
       this.amount=amount;

    }
    public void run()
    {
        try {
            atmmachine.withdraw(amount);
        }
        catch (InterruptedException e){}
    }
}
class CheckbalanceThread extends  Thread
{
    Atmmachine atmmachine;


    CheckbalanceThread(Atmmachine atmmachine)
    {
        this.atmmachine=atmmachine;


    }
    public void run()
    {
        try {
            atmmachine.checkbalance();
        }
        catch (InterruptedException e){}
    }

}
public class AtmpcImpl {
    public static void main(String args[])
    {
        int pin=123;
        double amount=100;
        Accountt account=new Accountt(123,1000);
        Atmmachine atmmachine=new Atmmachine(1,account);
        Atmthread t1=new Atmthread(atmmachine,pin);
        Withdrawthread t2=new Withdrawthread(amount,atmmachine);
        CheckbalanceThread t3=new CheckbalanceThread(atmmachine);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){

        }
        System.out.println("Transaction completed!");

    }
}
