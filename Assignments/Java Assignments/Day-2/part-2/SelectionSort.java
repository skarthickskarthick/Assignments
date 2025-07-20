package org.example.Day_2_part_2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[])
    {
        int arr[]={4,5,3,1,2};

        for(int i=0;i<arr.length;i++)
        {
            int max=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[max]<arr[j])
                max=j;
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
