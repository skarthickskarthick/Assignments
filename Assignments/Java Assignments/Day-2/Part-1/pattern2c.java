package org.example.Day_2;

public class pattern2c {
    public static void main(String args[]) {
        int n = 6, row = (n + 1) / 2;
        int i = 1, val = 1;
        while (i <= n) {
            if (i <= row) {
                int j = 1;
                int k=1;
                while(k<=row-i+1)
                {
                    System.out.print(" ");
                    k++;
                }
                while (j <= i) {
                    System.out.print(val++);
                    System.out.print("  ");
                    j++;
                }
            } else {
                int j = n - i + 1;

                int k=row;


                while(k<i)
                {
                    System.out.print("  ");k++;
                }
                while (j >= 1) {
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
