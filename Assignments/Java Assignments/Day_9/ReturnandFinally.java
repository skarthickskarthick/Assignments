package org.example.Day_9;

public class ReturnandFinally {
    public static void main(String args[])
    {

        int n=10;
        returnMethod(n);
    }
    static int returnMethod(int n)
    {

        try
        {
            if(n/0==0)
                return 0;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block");

        }
        return 1;

    }
}
