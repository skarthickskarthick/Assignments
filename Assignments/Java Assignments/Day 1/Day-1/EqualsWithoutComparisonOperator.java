package org.example.Day_1;

public class EqualsWithoutComparisonOperator {
    public static void main(String args[]) {
        int a = 10, b = 10;
        switch ((a ^ b)) {
            case 0:

                System.out.println("equal");
                break;
            default:
                System.out.println("not equal");
                break;
        }

        switch(((a-b)|(b-a))) {
            // here we use bitwise operator for fast calculations(another method)
            case 0:
            System.out.println("equal");
            break;
            default:
            System.out.println("not equal");
            break;
        }



    }
}
