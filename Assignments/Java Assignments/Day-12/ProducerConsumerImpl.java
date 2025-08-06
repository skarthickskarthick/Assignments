package org.example.Day_12;

class Create extends Thread
{
    long pin;
    Account account;
    private final Object lock;
    private int[] flag;
    Create(long pin,Account account,Object lock,int[] flag)
    {
        this.account=account;
        this.pin=pin;
        this.flag=flag;
        this.lock=lock;
    }
    public void run()
    {
        try {
            synchronized (lock) {
                while (flag[0]==2||flag[0]==3)
                    lock.wait();
                if (pin == account.pin) {
                    System.out.println("Account verified");
                    flag[0]=2;
                    lock.notifyAll();
                }
                else {
                    System.out.println("Invalid pin!");
                }
            }

        }

      catch (Exception e){}
    }


}
class  Withdraw extends Thread
{
    double amount;
    Account account;
    private final Object lock;
    int[] flag;

    Withdraw(double amount,Account account,Object lock,int[] flag)
    {
        this.amount=amount;
        this.account=account;
        this.lock=lock;
        this.flag=flag;
    }
    public void run()
    {

        try {
            synchronized (lock)
            {
                while (flag[0]==1||flag[0]==3)
                lock.wait();
                if(account.balance>=amount)
                {
                    account.balance-=amount;
                    System.out.println("After withdraw balance: "+account.balance);
                    flag[0]=3;
                    lock.notify();
                }
                else
                    System.out.println("can't withdraw");
            }
        }
        catch (Exception e){}
    }

}
class Checkbalance extends Thread
{
    Account account;
    private final Object lock;
    int[] flag;

    Checkbalance(Account account,Object lock,int[] flag)
    {
        this.account=account;
        this.lock=lock;
        this.flag=flag;
    }
    public void run()
    {

        try {
            synchronized (lock)
            {
                while (flag[0]==1||flag[0]==2)
                    lock.wait();
                System.out.println("Available balance: "+account.balance);
            }
        }
        catch (Exception e){}
    }
}
class Account
{
    long pin;
    double balance;
    Account(long pin,double balance)
    {
        this.pin=pin;
        this.balance=balance;
    }
}
public class ProducerConsumerImpl {
    public static void main(String args[])
    {
        long pin=123;
        double amount=100;
//        //type 2-withdraw 1-deposit 3-check balance
//        int type=2; using type we can extend this code to do the other operations
        Object lock=new Object();
        int flag[]={1};
        Account account=new Account(123,1000);
        Create t1=new Create(pin,account,lock,flag);
        Withdraw t2=new Withdraw(amount,account,lock,flag);
        Checkbalance t3=new Checkbalance(account,lock,flag);
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e){}
        System.out.println("Transaction completed");




    }
}
