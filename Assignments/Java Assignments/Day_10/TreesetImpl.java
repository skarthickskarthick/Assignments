package org.example.Day_10;

import java.util.Arrays;
import java.util.TreeSet;

public class TreesetImpl {
    public static void main(String args[])
    {
        TreeSet<String> colors=new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("TreeSet of colors: " + colors);
        for (String color : colors) {
            System.out.println(color);
        }
        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.add("Black");
        moreColors.add("White");
        colors.addAll(moreColors);
        System.out.println("After adding more colors: " + colors);
        System.out.println("Reversing: "+colors.descendingIterator().toString());
        System.out.println("first :"+colors.first());
        System.out.println("last :"+colors.last());
        TreeSet<String> clonedColors = (TreeSet<String>) colors.clone();

        System.out.println("Cloned TreeSet: " + clonedColors);
        System.out.println("Number of elements: " + colors.size());
        System.out.println("equal: " + colors.equals(clonedColors));
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(1, 3, 5, 7, 9, 11));
        System.out.println("Numbers TreeSet: " + numbers);
        System.out.println("Numbers less than 7: " + numbers.headSet(7));


        System.out.println("Ceiling (>= 7): " + numbers.ceiling(7));


        System.out.println("Floor (<= 7): " + numbers.floor(7));


        System.out.println("Higher (> 7): " + numbers.higher(7));

        System.out.println("Lower (< 7): " + numbers.lower(7));


        System.out.println("Poll First: " + numbers.pollFirst());
        System.out.println("After pollFirst: " + numbers);


        System.out.println("Poll Last: " + numbers.pollLast());
        System.out.println("After pollLast: " + numbers);


        numbers.remove(5);
        System.out.println("After removing 5: " + numbers);

    }
}
