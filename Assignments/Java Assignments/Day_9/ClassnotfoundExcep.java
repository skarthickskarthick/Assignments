package org.example.Day_9;

public class ClassnotfoundExcep {
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class<?> name=Class.forName("java.util.ArrayList");
        System.out.println(name);

    }
}
