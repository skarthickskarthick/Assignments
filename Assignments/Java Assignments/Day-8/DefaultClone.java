package org.example.Day_8;

import java.util.Arrays;

public class DefaultClone {
    public static void main(String args[])
    {
        int arr[]={1,3,4,5,6};
        int arrclone[]=arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrclone));
        arrclone[0]=12;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrclone));
    }
}
//For primitive arrays → clone() = deep copy.
//
//For object arrays → clone() = shallow copy

