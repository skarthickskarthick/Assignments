package org.example.Day_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparingInteger implements Comparator<ComparingInteger>
{
    int value;
    ComparingInteger(int value)
    {
        this.value=value;
    }
    ComparingInteger()
    {

    }
    @Override
    public  int compare(ComparingInteger obj1,ComparingInteger obj2)
    {
        return Integer.compare(obj2.value, obj1.value );
    }
    public String toString()
    {
        return String.valueOf(value);
    }
    public int getValue()
    {
        return  value;
    }

}

public class ComparatorExample {
    public static void main(String args[])
    {
        ComparingInteger arr[]={
                new ComparingInteger(4),
                new ComparingInteger(3),
                new ComparingInteger(6),
                new ComparingInteger(1),
                new ComparingInteger(2)
        };
        Arrays.sort(arr,new ComparingInteger());
        Arrays.sort(arr,Comparator.comparingInt(e->e.value));
        Arrays.sort(arr,Comparator.comparingInt((ComparingInteger e)->e.value).reversed());
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(a,b)->Integer.compare(b.value,a.value));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,Comparator.comparingInt(ComparingInteger::getValue));
       System.out.println(Arrays.toString(arr));
        Collections.sort(Arrays.asList(arr), Comparator.comparingInt(ComparingInteger::getValue));
        Arrays.asList(arr).sort(Comparator.comparing(e->e.value));
        System.out.println(Arrays.toString(arr));
    }
}
