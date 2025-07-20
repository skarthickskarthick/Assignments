package org.example.Day_2_part_2;

import java.util.Scanner;

public class DigitSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int len= sc.nextInt();
        int arr[]=new int[len];
        System.out.println("enter the elements");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        DigitSum ds=new DigitSum();
        ds.print(arr,len);
    }
    public  void print(int[] arr,int len)
    {
        int sum1=0,sum2=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]<10&&arr[i]>-10)
                sum1+=arr[i];
            else if(arr[i]<100&&arr[i]>-100)
                sum2+=arr[i];

        }
        System.out.println("single digit sum= "+sum1);
        System.out.println("double digit sum= "+sum2);


    }
}
