package org.example.Day_6;
class Employee{
   private int employeeID;
   private String name;
   private String designation;
   private String department;
   private double monthlysalary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMonthlysalary() {
        return monthlysalary;
    }

    public void setMonthlysalary(double monthlysalary) {
        this.monthlysalary = monthlysalary;
    }
    public double calculate(){
        return monthlysalary*12;
    }
}
public class EmployeeEncaps {
    public static void main(String args[])
    {
        Employee employee=new Employee();
        employee.setEmployeeID(1);
        employee.setName("karthick");
        employee.setDepartment("IT Project");
        employee.setDesignation("Developer");
        employee.setMonthlysalary(120000);
        System.out.println("id: "+employee.getEmployeeID()+" name: "+employee.getName()+" department: "+employee.getDepartment()+" designation: "+employee.getDesignation()+" Monthly salary: "+employee.getMonthlysalary()+" annual salary: "+employee.calculate());
    }
}
