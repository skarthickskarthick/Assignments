package org.example.Day_2_part_2;

import java.util.Scanner;

public class ArraySum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
       int n= sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {

            arr[i]= sc.nextInt();
            if(arr[i]%2!=0)
            sum+=arr[i];
        }
        System.out.println("sum="+sum);


    }
}
