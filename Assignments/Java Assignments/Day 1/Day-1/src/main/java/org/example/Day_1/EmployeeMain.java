package org.example.Day_1;
class Employee
{
    int empId;
    String name;
    String department;
    double salary;
    Employee(int empId, String name, String department, double salary)
    {
        this.empId=empId;
        this.name=name;
        this.department=department;
        this.salary=salary;

    }
    public void display()
    {
        System.out.println("empId: "+empId+"  name: "+name+"  department: "+department+"  salary: "+salary);
    }
}
public class EmployeeMain {
    public static void main(String args[])
    {
        Employee employee=new Employee(1,"abc","cse",60000);
        employee.display();
        System.out.println(employee instanceof Employee);
    }
}
