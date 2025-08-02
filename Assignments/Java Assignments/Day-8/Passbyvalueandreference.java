package org.example.Day_8;

import java.util.Arrays;

public class Passbyvalueandreference {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int a=5;
        passing(a,arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }
    static void passing(int a,int[] arr)
    {
        a=10;
       // arr=new int[5];
        arr[1]=12;
        System.out.println(Arrays.toString(arr));
        //so only the copy of the reference value is passes not the exactly the reference

    }
}
