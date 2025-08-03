package org.example.Day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashsetImpl {
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(8);
        set.add(6);
        set.add(4);
        System.out.println(set);
        System.out.println(set.size());
        HashSet<Integer> temp=(HashSet<Integer>)set.clone();
        System.out.println("tempset: "+temp);
       // temp.clear();
        System.out.println(set);
        System.out.println("isEmpty: "+temp.isEmpty());
        Integer[] arr=set.toArray(new Integer[0]);//jvm sees it as 0 as small size and sets i to the size of the set
        System.out.println("Array: "+ Arrays.toString(arr));
        TreeSet<Integer> treeSet=new TreeSet<>(set);
        System.out.println("TreeSet: "+treeSet);
        ArrayList<Integer> arrayList=new ArrayList<>(set);
        System.out.println("ArrayList: "+arrayList);
        System.out.println("Comparing sets: "+temp.equals(set));

    }
}
