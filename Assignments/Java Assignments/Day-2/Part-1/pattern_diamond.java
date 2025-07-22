package org.example.Day_2;

public class pattern_diamond {
    public static void main(String args[]) {
        int n = 10;
        int i = 1;
        int mid = (n / 2) + 1;
        int val = 1;
        int midd = mid;
        while (i < mid) {
            int j = 1;
            while (j <= midd) {
                System.out.print(" ");
                j++;

            }
            midd--;
            int k = 1;

            while (k <= i) {
                System.out.print(val++);
                System.out.print("  ");
                k++;
            }
            i++;
            System.out.println();

        }
        if (n % 2 == 0) {
            System.out.print("  ");
            for (int l = 1; l < mid; l++) {
                System.out.print(val++);
                System.out.print("  ");
            }
            System.out.println();
            i++;
            mid--;
        }
        while (i <= n) {
            int j = 1;
            while (j <= i - mid + 1) {
                System.out.print(" ");
                j++;
            }
            int k = n - i + 1;
            while (k > 0) {
                System.out.print(val++);
                System.out.print("  ");
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
