package org.example.Day_8;

class Addresss
{
    String location;
    Addresss(String location)
    {
        this.location=location;
    }
    public String toString()
    {
        return location;
    }
}
class Studentss implements Cloneable {
    Integer rollno;
    String name;
    String dept;
    Addresss address;

    Studentss(int rollno, String name, String dept, Addresss address) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.address = address;
    }

    public Studentss clone() {
        try {
            Studentss s=(Studentss)super.clone();
            s.address=new Addresss(this.address.location);
            return s;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("error....", e);
        }
    }
}

public class StudentsCloneableDeep {
    public static void main(String args[])
    {
        Studentss s1=new Studentss(1,"bala","IT",new Addresss("tki"));
        Studentss s2=s1.clone();

        System.out.println(s1.address.toString()+" "+s2.address.toString());
        s2.address.location="tvl";
        System.out.println(s1.address.toString()+" "+s2.address.toString());



    }
}
