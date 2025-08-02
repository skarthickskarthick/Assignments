package org.example.Day_9;

public class NumberFormatExcep {
    public static void main(String args[])
    {
        String s="abc0";
        try {
            int n=Integer.parseInt(s);
            System.out.println(n);

        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }

    }
}
