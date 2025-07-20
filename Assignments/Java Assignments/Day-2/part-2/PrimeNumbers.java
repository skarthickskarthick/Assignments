package org.example.Day_2_part_2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("enter the numbers");
        for(int i=0;i<10;i++)
        {
            int n=sc.nextInt();
            if(isPrime(n))
                list.add(n);

        }
        System.out.println("prime numbers are"+list);
    }
    public static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        else if(n==2)return true;
        else if(n%2==0)
            return false;
        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
