package org.example.Day_10;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityqueueImpl {
    public static void main(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        pq.add("Yellow");
// the minimum will be the head and the rest of the elements are arranged in any order
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Iterating through PriorityQueue:");
        for (String color : pq) {
            System.out.println(color);
        }
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Black");
        pq2.add("White");
        pq.addAll(pq2);
        System.out.println("After adding pq2: " + pq);


        pq.offer("Pink");
        System.out.println("After inserting: " + pq);


        PriorityQueue<String> temp = new PriorityQueue<>(pq);
        temp .clear();



        System.out.println("Size of temp PQ: " + pq.size());
        temp.add("blue");


        System.out.println("temp and pq equal: " + pq.containsAll(temp));


        System.out.println("Peek  " + pq.peek());

        System.out.println("Poll : " + pq.poll());
        System.out.println("After poll: " + pq);


        Object[] array = pq.toArray();
        System.out.println("PriorityQueue to Array: " + Arrays.toString(array));
    }
}
