package org.example.Day_2;

public class pattern2a {
    public static void main(String args[])
    {
        int n=6,row=(n+1)/2;
        int i=1,val=1;
        while(i<=n)
        {
            if(i<=row) {
                int j=1;
                while (j <= i) {
                    System.out.print(val++);
                    System.out.print("  ");
                    j++;
                }
            }
            else {
              int  j=n-i+1;
                while(j>=1)
                {
                    System.out.print(val++);
                    System.out.print("  ");
                    j--;
                }
            }

            System.out.println();
            i++;

        }



    }
}
