package org.example.Day_7;

import java.util.ArrayList;

class Customer
{
    int cid;
    String name;
    String location;
    Customer(int cid,String name,String location)
    {
        this.cid=cid;
        this.name=name;
        this.location=location;
    }
}
enum AccountType
{
    Savings,FixedDeposit,Loan
}
class Account
{
        int acno;
        AccountType accountType;
        Customer c;
        double balance;
        String bankName;
        Account(int acno,AccountType accountType,Customer c)
        {
            this.acno=acno;
            this.accountType=accountType;
            this.c=c;

        }
        Account()
        {

        }
        void print()
        {
            System.out.println("Bank name: "+bankName+" acno: "+acno+" accounttype: "+accountType+" balance: "+balance+" cid: "+c.cid+" name: "+c.name+" location: "+c.location);
        }
}
interface RBI
{
    //ArrayList <Account> sbiaccounts=new ArrayList<>();
   // ArrayList <Account> iciciaccounts=new ArrayList<>();


    void createAccount(int acno,AccountType accountType,Customer c,double balance);
    double GetInterestRate();
     double GetWithdrawalLimit();

}

class SBI implements RBI
{
   static ArrayList <Account> sbiaccounts=new ArrayList<>();

   public double GetInterestRate()
    {
        return 0.04;
    }
  public   double GetWithdrawalLimit()
    {
        return 1000;
    }
    public   double GetMinimumBalance()
    {
        return 100;
    }

    public void createAccount(int acno,AccountType accountType,Customer c,double balance)
    {
        Account sbiaccount=new Account();
        if(balance>=GetMinimumBalance()) {
            sbiaccount.balance = balance;
            sbiaccount.acno=acno;
            sbiaccount.accountType=accountType;
            sbiaccount.c=c;
            sbiaccount.bankName="SBI";

            sbiaccounts.add(sbiaccount);

            System.out.println("account created!");

        }
        else
            System.out.println("account not created");


    }
    public int getfromsbiaccounts(int acno)
    {

        for(int i=0;i<sbiaccounts.size();i++)
        {
            if(sbiaccounts.get(i).acno==acno)
            {
                return  i;
            }
        }

        return -1;
    }

    public void withdraw(int acno,double amount)
    {
       int i=getfromsbiaccounts(acno);

        if(i!=-1)
        {
            if((sbiaccounts.get(i).balance>amount)&&(sbiaccounts.get(i).balance-amount)>=GetMinimumBalance())
            {

                sbiaccounts.get(i).balance-=amount;
            }
            else
                System.out.println("cannot withdraw");
        }
        else System.out.println("account not found!");

    }
    public void deposit(int acno,double amount)
    {
        int i=getfromsbiaccounts(acno);

        if(i!=-1)
        {
                sbiaccounts.get(i).balance+=amount;
        }
        else System.out.println("account not found!");
    }
}
class ICICI implements RBI
{
    static ArrayList <Account> iciciaccounts=new ArrayList<>();
    public double GetInterestRate()
    {
        return 0.06;
    }
    public   double GetWithdrawalLimit()
    {
        return 1500;
    }
    public   double GetMinimumBalance()
    {
        return 500;
    }
    public void createAccount(int acno,AccountType accountType,Customer c,double balance)
    {
        Account iciciaccount=new Account();
        if(balance>=GetMinimumBalance()) {
            iciciaccount.balance = balance;
            iciciaccount.acno=acno;
            iciciaccount.accountType=accountType;
            iciciaccount.c=c;
            iciciaccount.bankName="ICICI";

            iciciaccounts.add(iciciaccount);

            System.out.println("account created!");

        }
        else
            System.out.println("account not created");


    }
    public int getfromiciciaccounts(int acno)
    {

        for(int i=0;i<iciciaccounts.size();i++)
        {
            if(iciciaccounts.get(i).acno==acno)
            {
                return  i;
            }
        }

        return -1;
    }

    public void withdraw(int acno,double amount)
    {
        int i=getfromiciciaccounts(acno);

        if(i!=-1)
        {
            if((iciciaccounts.get(i).balance>amount)&&(iciciaccounts.get(i).balance-amount)>=GetMinimumBalance())
            {

                iciciaccounts.get(i).balance-=amount;
            }
            else
                System.out.println("cannot withdraw");
        }
        else System.out.println("account not found!");

    }
    public void deposit(int acno,double amount)
    {
        int i=getfromiciciaccounts(acno);

        if(i!=-1)
        {
            iciciaccounts.get(i).balance+=amount;
        }
        else System.out.println("account not found!");
    }

}
public class BankInterface {
    public static void main(String args[])
    {
            Customer customer1=new Customer(1,"murugan","tki");
        Customer customer2=new Customer(3,"karthick","tvl");
            SBI sbi=new SBI();
            sbi.createAccount(6,AccountType.Savings,customer1,3000);
            SBI sbi1=new SBI();
        sbi1.createAccount(7,AccountType.Savings,customer2,5000);
        System.out.println("SBI Accounts:");
        System.out.println("Created Accounts");
        for (Account acc:sbi.sbiaccounts)
            acc.print();
      System.out.println("SBI Interest Rate: "+sbi.GetInterestRate());
      System.out.println("Withdrawal limit: " +sbi.GetWithdrawalLimit());
        System.out.println("Minimum balance limit: " +sbi.GetMinimumBalance());
        sbi.withdraw(6,3000);
        sbi1.withdraw(10,500);
        System.out.println("After withdrawal Accounts");
        for (Account acc:sbi.sbiaccounts)
            acc.print();

        Customer customer3=new Customer(2,"bala","tki");
        ICICI icici=new ICICI();
        icici.createAccount(12,AccountType.FixedDeposit,customer2,6000);
        ICICI icici1=new ICICI();
        icici.createAccount(13,AccountType.Loan,customer3,4000);
        System.out.println("ICICI Accounts:");
        System.out.println("Created Accounts");
        for (Account acc:icici1.iciciaccounts)
            acc.print();
        System.out.println("ICICI Interest Rate: "+icici1.GetInterestRate());
        System.out.println("Withdrawal limit: " +icici1.GetWithdrawalLimit());
        System.out.println("Minimum balance limit: " +icici1.GetMinimumBalance());
        icici1.withdraw(12,3000);
        icici1.withdraw(13,500);
        System.out.println("After withdrawal Accounts");
        for (Account acc:icici1.iciciaccounts)
            acc.print();





    }
}
