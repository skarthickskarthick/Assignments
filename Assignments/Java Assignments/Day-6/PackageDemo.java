package org.example.Day_6;

import org.example.Day_6.arithmetic.*;
import org.example.Day_6.stringutils.StringOperations;

//class a extends Addition
//{
//    public void addd()
//    {
//        add(1,2);
//    }
//
//}//for protected methods to access
public class PackageDemo extends Addition {
    public static void main(String args[])
    {
        //Addition addition=new Addition();
        PackageDemo demo=new PackageDemo();
        System.out.println(demo.add(12,10));
        Subtraction subtraction=new Subtraction();
        System.out.println(subtraction.subtract(12,10));
        Multiplication multiplication=new Multiplication();
        System.out.println(multiplication.multiply(12,10));
        Division division=new Division();
        System.out.println(division.divide(12,10));
        Modulus modulus=new Modulus();
        System.out.println(modulus.mod(12,10));
        StringOperations stringOperations=new StringOperations();
        System.out.println(stringOperations.concat("ten","kasi"));
        System.out.println(stringOperations.reverse("tenkasi"));
        System.out.println(stringOperations.length("tenkasi"));

    }
}

