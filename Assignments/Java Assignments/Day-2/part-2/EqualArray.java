package org.example.Day_2_part_2;

public class EqualArray {
    public static  void main(String args[]) {
        char arr1[] = {'m', 'n', 'o', 'p'};
        char arr2[] = {'m', 'n', 'o', 'p'};
        if (arr1.length != arr2.length)
        {
            System.out.println("not equal");
        System.exit(0);
    }
        int l=0,r=arr1.length-1;
        while(l<=r)
        {
            if(arr1[l]!=arr2[l])
            {
                System.out.println("not equal");
                System.exit(0);

            }
            if(arr1[r]!=arr2[r])
            {
                System.out.println("not equal");
                System.exit(0);
            }
            l++;
            r--;
        }
        System.out.println("equal");

    }
}
