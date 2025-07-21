package org.example.Day_3;
class Student
{
    int roll_no;
    String name;
    public  String toString()
    {
        System.out.print(roll_no+" "+name);
        return "";
    }
}

public class StudentObject {
    public static void main(String args[])
    {
        Student student=new Student();
        student.name="John";
        student.roll_no=2;
        student.toString();
    }
}
