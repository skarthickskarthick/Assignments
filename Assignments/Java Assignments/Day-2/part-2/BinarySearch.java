package org.example.Day_2_part_2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        int start=0,stop=arr.length-1;
        int target=1982;
        Arrays.sort(arr);

        while(start<=stop)
        {
            int mid=start+(stop-start)/2;
            if(arr[mid]==target)
            {
                System.out.println("record exists");
                System.exit(0);
            }
            else if(arr[mid]>target)
                stop=mid-1;
            else start=mid+1;

        }
        System.out.println("no record exists");
    }
}
