package org.example.Day_10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedListImpl {
    public static void main(String args[])
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println(list);
        Iterator<String> iterator=list.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println("\nspecific index printing: \n");
        Iterator<String> iterator1=list.listIterator(2);
        while (iterator1.hasNext())
            System.out.print(iterator1.next()+" ");
        System.out.println("\nReverse printing: \n");
        Iterator<String> iterator2=list.descendingIterator();
        while (iterator2.hasNext())
            System.out.print(iterator2.next()+" ");
        list.add(0,"White");
        System.out.println("\n"+list);
        list.addFirst("White");
        list.addLast("Orange");
        System.out.println("\nAfter inserting at first and last position: " + list);


        list.offerFirst("Pink");
        System.out.println("\nAfter inserting 'Pink' at front: " + list);

        list.offerLast("Purple");
        System.out.println("\nAfter inserting 'Purple' at end: " + list);
        LinkedList<String> temp=new LinkedList<>();
        temp.add("grey");
        temp.add("silver");
        list.addAll(3,temp);
        System.out.println("\n"+list);
        System.out.println("first index: "+list.indexOf("White"));
        System.out.println("last index: "+list.lastIndexOf("White"));
    }
}
// addFirst() → always adds or throws an exception
// offerFirst() → adds and returns true