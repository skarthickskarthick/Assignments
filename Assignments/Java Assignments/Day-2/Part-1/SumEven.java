package org.example.Day_2;

import javax.swing.*;

public class SumEven {
    public static void main(String args[])
    {
        int sum=0;
        int n=6;
        for(int i=2;i<n;i++)
        {
            if(i%2!=0)
                continue;
            sum+=i;
        }
        System.out.println(sum);
    }
}
