package org.example.Day_10;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
public class ArrayListImpl {
    public static void main(String args[])
    {
        List<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);
        for (String s:colors)
            System.out.println(s);
        colors.add(0,"white");
        System.out.println("first element: "+colors.get(0));

        colors.set(0,"black");
        System.out.println("After updation: "+colors);
        System.out.println(colors.remove(3));//returns the value at the index
        System.out.println("After removing: "+colors);
        System.out.println("Remove by value: "+colors.remove("red"));//returns boolean
        System.out.println("containing blue: "+colors.contains("blue"));
        System.out.println("containing purple: "+colors.contains("purple"));
        Collections.sort(colors);
        List<String> copy=new ArrayList<>(colors);
        System.out.println("sorted: "+ colors);
        Collections.shuffle(colors);
        System.out.println("Shuffle: "+colors);
    }
}
