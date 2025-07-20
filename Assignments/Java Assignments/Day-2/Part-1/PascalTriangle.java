package org.example.Day_2;

public class PascalTriangle {
    public static void main(String args[])
    {
        int n=5;
        int i=1;
        do {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int val=1;
            for(int j=1;j<=i;j++) {
                System.out.print(val);
                System.out.print(" ");
                val=(val * (i - j) )/ j;
            }
            System.out.println();
            i++;

            }while (i<=n);

    }
}
