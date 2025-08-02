package org.example.Day_9;

public class MethodPropagation {
    public static  void main(String args[])
    {
        int n=10;

            m1(n);

    }
    static  void m1(int n)
    {
        try {
            m2(n);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    static void m2(int n)
    {
        m3(n);

    }
    static void m3(int n)
    {

            int div=n/0;
    }

}
