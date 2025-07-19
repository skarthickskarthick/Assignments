package org.example.Day_1;

public class FirstSetBit {
    public  static void main(String args[]) {
        int n = 11;
        int count = 1;
        if((n&1)==1)//odd numbers ends with 1
        {
            System.out.println(1);
            System.exit(1);
        }
        while (n > 0) {
            if ((n & 1) == 1) {
                System.out.println(count);
                System.exit(0);

            }

            count++;
            n = n >> 1;
        }
        System.out.println(count);
    }
}
