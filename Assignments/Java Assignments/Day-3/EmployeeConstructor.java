package org.example.Day_3;
class Employee
{
    int empId;
    String empName;
    double salary;
    String designation;
    Employee()
    {
        empId=0;
        empName="null";
        salary=0.0;
        designation="not found";
        System.out.println("object created successfully");

    }
    Employee(int empId,String empName,double salary,String designation)
    {
        this.designation=designation;
        this.salary=salary;
        this.empName=empName;
        this.empId=empId;
    }
    Employee(Employee e)
    {
        this.designation=e.designation;
        this.salary=e.salary;
        this.empName=e.empName;
        this.empId=e.empId;
    }
    public String toString()
    {
        return empId+" "+empName+" "+designation+" "+salary;
    }
}
public class EmployeeConstructor {
    public static void main(String args[])
    {
        Employee employee=new Employee();
        Employee employee1=new Employee(1,"john",60000,"Development");
        Employee employee2=new Employee(2,"krishna",80000,"Testing");
        Employee employee3=new Employee(3,"bala",100000,"Designing");
        Employee employee4=new Employee(employee3);
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());


    }
}
