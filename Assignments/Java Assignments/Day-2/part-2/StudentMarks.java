package org.example.Day_2_part_2;

import java.util.ArrayList;
import java.util.Scanner;

class  Student{
    int rollno;
    int mark1;
    int mark2;
    int mark3;
    double sum;
    double average;
    Student()
    {

    }
    Student(int rollno,int mark1,int mark2,int mark3)
    {
        this.rollno=rollno;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    public void calculate()
    {
       this.sum=mark1+mark2+mark3;
        this.average=sum/3;
    }
    public  void print()
    {
        System.out.println(rollno+"        "+mark1+"     "+mark2+"     "+mark3+"     "+sum+"    "+average);
    }
}
public class StudentMarks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        ArrayList<Student> studentslist=new ArrayList<>();
        for(int i=1;i<=1;i++)
        {

            System.out.println("enter details for student "+i);
            System.out.println("enter the rollno");
            int rollno=sc.nextInt();
            System.out.println("enter the mark1");
            int mark1=sc.nextInt();
            System.out.println("enter the mark2");
            int mark2=sc.nextInt();
            System.out.println("enter the mark3");
            int mark3=sc.nextInt();
            Student student=new Student(rollno,mark1,mark2,mark3);
            studentslist.add(student);


        }
    System.out.println("rollno   "+"mark1   "+"mark2   "+"mark3   "+"total   "+"average   ");
        for(Student s:studentslist)
        {
            s.calculate();
            s.print();
        }
    }
}
