package org.example.Day_2;

public class MinimumOfThree {
    public static void main(String args[])
    {
        int a=10,b=8,c=13;
        if(a<b)
        {
            if(a<c)
            System.out.println("a is minimum");
            else
                System.out.println("c is minimum");
        }
        else
        {
            if(b<c)
                System.out.println("b is minimum");
            else
                System.out.println("c is minimum");
        }
    }
}
