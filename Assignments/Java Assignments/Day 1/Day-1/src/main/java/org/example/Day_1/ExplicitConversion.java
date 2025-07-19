package org.example.Day_1;

public class ExplicitConversion {
    public static void main(String args[])
    {
        double doubleValue = 100.12;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;

        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to float: " + floatValue);
        System.out.println("After casting to long: " + longValue);
        System.out.println("After casting to int: " + intValue);
        System.out.println("After casting to short: " + shortValue);
        System.out.println("After casting to byte: " + byteValue);
    }
}
