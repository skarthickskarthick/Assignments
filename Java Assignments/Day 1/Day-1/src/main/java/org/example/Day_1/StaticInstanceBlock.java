package org.example.Day_1;

public class StaticInstanceBlock {

    static{
        System.out.println("this block is static and executed first");
    }
    {
        System.out.println("Initializer block");
    }

    public static void main(String args[])
    {
        StaticInstanceBlock sib=new StaticInstanceBlock();
        StaticInstanceBlock sib1=new StaticInstanceBlock();

    }
}
