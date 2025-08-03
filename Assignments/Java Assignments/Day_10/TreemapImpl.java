package org.example.Day_10;

import java.util.Comparator;
import java.util.TreeMap;

public class TreemapImpl {
    public static void main(String args[])
    {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Red");
        map.put(3, "Green");
        map.put(2, "Blue");
        map.put(5, "Yellow");
        System.out.println("TreeMap: " + map);


        TreeMap<Integer, String> copyMap = new TreeMap<>(map);
        System.out.println("Copied TreeMap: " + copyMap);
        System.out.println("Contains key " + map.containsKey(2));

        System.out.println("Contains value "+ map.containsValue("Blue"));


        System.out.println("Keys in TreeMap: " + map.keySet());
        copyMap.clear();

        TreeMap<Integer, String> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.putAll(map);
        System.out.println("reverse order: " + reverseMap);


        System.out.println("Entry with greatest key: " + map.lastEntry());
        System.out.println("Entry with least key: " + map.firstEntry());
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        System.out.println("Reverse order  " + map.descendingKeySet());



    }
}
