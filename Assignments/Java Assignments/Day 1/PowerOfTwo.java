package org.example.Day_1;

public class PowerOfTwo {
    public static void main(String args[]) {
        int n = -32;
        if(n<1)
        {
            System.out.println("false(power of 2)");
            System.exit(0);
        }
        while (n % 2 == 0) {
            n=n/2;

        }
        if(n==1)
            System.out.println("true(power of 2)");
        else
            System.out.println("false(power of 2");
    }
}
