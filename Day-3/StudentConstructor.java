package org.example.Day_3;

class Students
{
    int roll_no;
    String name;
    int phone_no;
    String address;
    Students(String name, int roll_no, int phone_no, String address)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.phone_no=phone_no;
        this.address=address;
    }
    public  String toString()
    {
        System.out.print(roll_no+" "+name+" "+phone_no+" "+address);
        return "";
    }
}

public class StudentConstructor {
    public static void main(String args[])
    {
        Students student1=new Students("John",1,830093915,"tirunelveli");
        Students student2=new Students("Sam",2,948867515,"tenkasi");


        student1.toString();
        student2.toString();
    }
}
