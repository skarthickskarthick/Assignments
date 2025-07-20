package org.example.Day_2;

public class DecimalToBinary {
    public static void main(String args[])
    {
        int n=18;

        System.out.println(conversion(n));
    }
    public static String conversion(int n)
    {
        if(n==0)
            return "0";
        StringBuffer sb=new StringBuffer();
        while(n>0)
        {
            sb.append(n&1);
            n=n>>1;
        }
        return sb.reverse().toString();

    }
}
