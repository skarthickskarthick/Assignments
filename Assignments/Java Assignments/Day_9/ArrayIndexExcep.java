package org.example.Day_9;

public class ArrayIndexExcep
{
    public static void main(String args[])
    {
        int[] arr = {2, 5, 1, 4, 0, 7};
        try {
            int quotient = arr[7] / arr[4];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds error occured");
        }

    }
}
