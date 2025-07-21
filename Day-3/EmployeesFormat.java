package org.example.Day_3;
class Employees
{
    String name;
    int year_of_joining;
    double salary;
    String address;
    Employees(String name, int year_of_joining, double salary, String address)
    {
        this.address=address;
        this.name=name;
        this.year_of_joining=year_of_joining;
        this.salary=salary;
    }
    public String toString()
    {
        return String.format("%s   %d   %.2f   %s",name,year_of_joining,salary,address);
    }
}
public class EmployeesFormat {
    public static void main(String args[])
    {
        Employees e1=new Employees("Robert", 1994 ,80000,"64C- WallsStreat");
        Employees e2=new Employees("Sam", 2000 ,60000,"68C- WallsStreat");
        Employees e3=new Employees("John", 1999 ,50000,"26B- WallsStreat");

//        String abc=String.format("name %d",9);
//        System.out.println(abc);
        System.out.println("name    "+"Year    "+"salary    "+"address  ");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());


    }
}
