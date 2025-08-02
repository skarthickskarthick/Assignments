package org.example.Day_8;
class Address
{
    String location;
    Address(String location)
    {
        this.location=location;
    }
    public String toString()
    {
        return location;
    }
}
class Students implements Cloneable
{
    Integer rollno;
    String name;
    String dept;
    Address address;
    Students(int rollno,String name,String dept,Address address)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.address=address;
    }
    public Students clone()
    {
        try {
            return (Students)super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new  RuntimeException("error....",e);
        }
    }
}
public class StudentCloneable {
    public static void main(String args[])
    {
        Students s1=new Students(1,"bala","IT",new Address("tki"));
        Students s2=s1.clone();
        System.out.println(s1.name+" "+s2.name);
        s2.name="murugan";
        System.out.println(s1.name+" "+s2.name);
//        bala bala
//        bala murugan because string is imutable creates new reference
        System.out.println(s1.address.toString()+" "+s2.address.toString());
        s2.address.location="tvl";
        System.out.println(s1.address.toString()+" "+s2.address.toString());



    }
}
