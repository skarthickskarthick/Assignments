package org.example.Day_10;

import java.util.ArrayList;
import java.util.Arrays;

class Account
{
    int accountNumber ;
       String holderName;
       double balance;
       Account(int accountNumber,String holderName,double balance)
       {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
       }
      void  addInterest()
       {
           balance+=balance*0.05;
       }
       void print()
       {
           System.out.println(accountNumber+" "+holderName+" "+balance);
       }
}
public class BankAcounts {
    public static void main(String args[])
    {
        ArrayList<Account> list=new ArrayList<>();
        Account a1=new Account(1,"karthick",1000);
        Account a2=new Account(2,"bala",6000);
        Account a3=new Account(3,"murugan",10000);
        list.addAll(Arrays.asList(a1,a2,a3));
        for(Account a:list)
        {
            a.print();
        }
        System.out.println("After Calculating Interest");
        for (Account a:list)
        {
            a.addInterest();
            a.print();
        }
    }
}
