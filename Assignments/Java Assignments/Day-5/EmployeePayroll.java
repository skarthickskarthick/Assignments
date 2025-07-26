package org.example.Day_4;
class Employee
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
  double  calculateSalary()
    {

        return (basicpay+allowances)-pf;

    }
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

        salary=super.calculateSalary()+special_allowance;
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
        stipend=super.calculateSalary();
        return stipend;
    }

}
public class EmployeePayroll {
    public static void main(String args[])
    {
        Employee employeefull=new FullTimeEmployee(1,30000);
        System.out.println( "salary: "+employeefull.calculateSalary());
        Employee employeepart=new FullTimeEmployee(3,10000);
        System.out.println( "stipend: "+employeepart.calculateSalary());
    }
}
