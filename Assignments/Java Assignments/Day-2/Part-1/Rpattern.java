package org.example.Day_2;

public class Rpattern {
    public static void main(String args[])
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i==1||j==1)
                    System.out.print("R ");
                else if(i<(n+1)/2&&j==n-1)
                    System.out.print("R ");
                else if(i>(n+1)/2&&(i-j)==1)
                    System.out.print("R ");
                else if(i==(n+1)/2)
                    System.out.print("R ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
