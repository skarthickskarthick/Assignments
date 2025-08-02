package org.example.Day_8;

import java.util.Arrays;
class Comparingint implements Comparable<Comparingint>
{
    int value;

    Comparingint(int value)
    {
        this.value=value;
    }

    @Override
    public int compareTo(Comparingint obj)
    {
        //System.out.println("comparing: "+obj.value+" "+this.value);
        return Integer.compare(obj.value,this.value);
        //obj.value-this.value this gives error as it will exceed the range
    }
    public String toString()
    {
        return  String.valueOf(value);
    }
}
class Comparingstr implements Comparable<Comparingstr>
{
    String str;

    Comparingstr(String str)
    {
        this.str=str;
    }
    @Override
    public int compareTo(Comparingstr obj)
    {
        //System.out.println("comparing: "+obj.value+" "+this.value);

        return obj.str.compareTo(this.str);
    }
    public String toString()
    {
        return  str;
    }
}
public class CompareToExample {


    public static void main(String args[])
    {
        Comparingint arr[]={
                new Comparingint(2),
                new Comparingint(4),
                new Comparingint(1),
                new Comparingint(6),
                new Comparingint(3),
                new Comparingint(1),
                new Comparingint(8)
        };
        Comparingstr strarr[]={
                new Comparingstr("abc"),
                new Comparingstr("xyz"),
                new Comparingstr("def"),
                new Comparingstr("abc"),
                new Comparingstr("bcd"),
                new Comparingstr("zds"),
                new Comparingstr("ckl")
        };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(strarr);
       Arrays.sort(strarr);
        System.out.println(Arrays.toString(strarr));
    }
}
//int result = Integer.compare(this.rollNo, other.rollNo);
//
//// 2. If rollNo is the same, compare by name
//        if (result == 0) {
//result = this.name.compareTo(other.name);
//        }
//return result;