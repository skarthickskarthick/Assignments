package org.example.Day_7;
class Customerr
{
    int cusid;
    String name;
    String location;
    Customerr(int cusid,String name,String location)
    {
        this.cusid=cusid;
        this.name=name;
        this.location=location;
    }

}

enum AccountTypee
{
    Savings,FixedDeposit,Loan
}
class Accountt
{
    int acno;
    AccountTypee accountType;
    String bankName;
    Customerr customer;
    double balance;
    Accountt(int acno,String bankName,AccountTypee accountType,Customerr customer,double balance)
    {
        this.acno=acno;
        this.accountType=accountType;
        this.bankName=bankName;
        this.customer=customer;
       this.balance=balance;
    }
}
abstract class RbiBank{
    Customerr customer;
    Accountt account;
    abstract public double getWithdrawalLimit();
  abstract   public double getInterestRate();
}
class SbiBank extends RbiBank
{
    SbiBank(Customerr customer,Accountt account)
    {
        this.customer=customer;
        this.account=account;
    }
    public void deposit(double amount)
    {
        account.balance+=amount;
        System.out.println("Amount Deposited");
        System.out.println("Available Balance: "+account.balance);
    }
    public void withdrawal(double amount)
    {
        if(amount<=getWithdrawalLimit()&&account.balance>=amount)
        {
            account.balance-=amount;
            System.out.println("Amount Withdrawn");
            System.out.println("Available Balance: "+account.balance);
        }
        else
            System.out.println("Can't Withdraw");
    }
    public void calculateInterest()
    {
        account.balance+=account.balance*getInterestRate();
        System.out.println("Interest Calculated");
        System.out.println("Available Balance: "+account.balance);

    }
    public double getWithdrawalLimit()
    {
        return 10000;
    }
    public double getInterestRate()
    {
        return 0.06;
    }
    public String toString()
    {
        return "cusid: "+customer.cusid+" name: "+ customer.name+" location: "+customer.location+" accno: "+account.acno+" type: "+account.accountType
                +" bankname: "+account.bankName+" balance: "+account.balance;
    }
}
class IciciBank extends RbiBank{
    IciciBank(Customerr customer,Accountt account)
    {
        this.customer=customer;
        this.account=account;
    }
    public void deposit(double amount)
    {
        account.balance+=amount;
        System.out.println("Amount Deposited");
        System.out.println("Available Balance: "+account.balance);
    }
    public void withdrawal(double amount)
    {
        if(amount<=getWithdrawalLimit()&&account.balance>=amount)
        {
            account.balance-=amount;
            System.out.println("Amount Withdrawn");
            System.out.println("Available Balance: "+account.balance);
        }
        else
            System.out.println("Can't Withdraw");
    }
    public void calculateInterest()
    {
        account.balance+=account.balance*getInterestRate();
        System.out.println("Interest Calculated");
        System.out.println("Available Balance: "+account.balance);

    }
    public double getWithdrawalLimit()
    {
        return 20000;
    }
    public double getInterestRate()
    {
        return 0.04;
    }
    public String toString()
    {
        return "cusid: "+customer.cusid+" name: "+ customer.name+" location: "+customer.location+" accno: "+account.acno+" type: "+account.accountType
                +" bankname: "+account.bankName+" balance: "+account.balance;
    }
}
public class RbiAbstractImpl {
    public  static void main(String args[])
    {
        Customerr customer1=new Customerr(1,"karthick","tki");
        Accountt account1=new Accountt(1127100062,"SBI",AccountTypee.Savings,customer1,60000);
        SbiBank sbi1=new SbiBank(account1.customer,account1);
        sbi1.deposit(1000);
        sbi1.withdrawal(10000);
        sbi1.withdrawal(12000);
        sbi1.calculateInterest();
        System.out.println(sbi1.toString());
        Customerr customer2=new Customerr(3,"bala","tvl");
        Accountt account2=new Accountt(1127100063,"ICICI",AccountTypee.FixedDeposit,customer2,100000);
        IciciBank icici1=new IciciBank(account2.customer,account2);
        icici1.deposit(6000);
        icici1.withdrawal(10000);
        icici1.withdrawal(12000);
        icici1.calculateInterest();
        System.out.println(icici1.toString());

    }
}
