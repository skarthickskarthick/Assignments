package org.example.Day_10;

import java.util.HashMap;

public class HashmapImpl {
    public static void main(String args[])
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        System.out.println("HashMap: " + map);


        System.out.println("Size of map: " + map.size());


        HashMap<Integer, String> copyMap = new HashMap<>();
        copyMap.putAll(map);
        System.out.println("Copied HashMap: " + copyMap);
        HashMap<Integer, String> tempMap = new HashMap<>(map);
        tempMap.clear();
        System.out.println("After clearing tempMap: " + tempMap);

        System.out.println("Isempty " + map.isEmpty());

        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned HashMap: " + cloneMap);

        System.out.println("Contains key " + map.containsKey(2));



        System.out.println("Contains value"  + map.containsValue("Blue"));

        System.out.println("Entry set view of map: " + map.entrySet());


        System.out.println("Value for key " + map.get(3));
    }
}
