package org.example.Day_7;

abstract class Employee
{
    int empID;
    double basicpay;
    double pf;
    double allowances;
    Employee(int empID,double basicpay)
    {

        this.empID=empID;
        this.basicpay=basicpay;
    }
   abstract double  calculateSalary();

}
class  FullTimeEmployee extends Employee
{
    double salary;
    double special_allowance;

    FullTimeEmployee(int empID,double basicpay)
    {

        super(empID,basicpay);

        pf=basicpay/10;
        allowances=3000;
        special_allowance=1000;
    }
    double  calculateSalary()
    {

        salary=(basicpay+allowances)-pf+special_allowance;
        return salary;
    }

}
class PartTimeEmployee extends Employee
{
    double stipend;

    PartTimeEmployee(int empID,double basicpay)
    {
        super(empID,basicpay);
        pf=(basicpay/10)/2;
        allowances=basicpay+1000;
    }
    double  calculateSalary()
    {
        stipend=(basicpay+allowances)-pf;
        return stipend;
    }

}


public class EmployeeAbstrct {
    public  static void main(String args[])
    {
        Employee fullTimeEmployee=new FullTimeEmployee(1,600000);
        System.out.println(fullTimeEmployee.calculateSalary());
        Employee partTimeEmployee=new PartTimeEmployee(3,120000);
        System.out.println(partTimeEmployee.calculateSalary());

    }

}
