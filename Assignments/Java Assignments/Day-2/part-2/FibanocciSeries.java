package org.example.Day_2_part_2;

import java.util.Arrays;

public class FibanocciSeries {
    public static void main(String args[])
    {
        int arr[]=new int[30];

        int first=0;
        int second=1;
        int temp=0;
        arr[0]=first;
        arr[1]=second;


        for(int i=2;i<30;i++)
        {
            temp=first+second;
            first=second;
            second=temp;
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
