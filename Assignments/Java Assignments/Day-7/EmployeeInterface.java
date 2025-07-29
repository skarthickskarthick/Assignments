package org.example.Day_7;
class Employe
{
    int empID;
    double basicpay;
    double pf;
    double allowances;
    Employe(int empID,double basicpay)
    {
        this.empID=empID;
        this.basicpay=basicpay;
    }


}
interface  employee
{

    double  calculateSalary();
}
class  FullTimeEmploye extends Employe implements employee
{
    double salary;
    double special_allowance;

    FullTimeEmploye(int empID,double basicpay)
    {

        super(empID,basicpay);

        pf=basicpay/10;
        allowances=3000;
        special_allowance=1000;
    }
  public   double  calculateSalary()
    {

        salary=(basicpay+allowances+special_allowance)-pf;
        return salary;
    }

}
class PartTimeEmploye extends Employe implements employee
{
    double stipend;

    PartTimeEmploye(int empID,double basicpay)
    {
        super(empID,basicpay);
        pf=(basicpay/10)/2;
        allowances=basicpay+1000;
    }
   public double  calculateSalary()
    {
        stipend=(basicpay+allowances)-pf;
        return stipend;
    }

}
public class EmployeeInterface {
    public static void main(String args[])
    {
        employee fullTimeEmploye=new FullTimeEmploye(1,600000);
        System.out.println(fullTimeEmploye.calculateSalary());
        employee partTimeEmploye=new PartTimeEmploye(3,120000);
        System.out.println(partTimeEmploye.calculateSalary());
    }
}
