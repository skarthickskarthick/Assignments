package org.example.Day_2;

public class Xpattern {
    public static void main(String args[])
    {
        int n=9;
        int temp=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" ");
                if(i==j&&i!=n/2)
                    System.out.print("1");
                if(j==temp)
                {
                    System.out.print("1");
                    temp--;
                }
            }
            System.out.println();
        }
    }
}
