package org.example.Day_8;//copy constructor cloning
class  Student
{
    int rollno;
    String name;
    String dept;
    Student(int rollno,String name,String dept)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
    }
    Student(Student obj)
    {
        this.rollno=obj.rollno;
        this.name=obj.name;
        this.dept= obj.dept;
    }
    @Override
    public Student clone() {
        return new Student(this);//deep copy
        //return this;//shallowcopy
    }
}
public class StudentClone {
    public static void main(String args[])
    {
        Student s=new Student(1,"murgan","IT");
        Student s1=  s.clone();

        System.out.println(s.dept);
        System.out.println(s1.dept);
        s1.dept="CSE";
        System.out.println(s.dept);
        System.out.println(s1.dept);
    }
}
