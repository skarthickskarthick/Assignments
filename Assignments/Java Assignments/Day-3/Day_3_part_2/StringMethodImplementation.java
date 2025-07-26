package org.example.Day_3_part_2;

import java.util.Arrays;

class MyString
{
    char ch[];
    String s;
    MyString(String str)
    {
       ch=str.toCharArray();
       s=str;
    }
    int length()
    {
        return ch.length;
    }
    char charAt(int index)
    {
        return ch[index];
    }
    boolean equals(MyString str2)
    {
        char ch2[]=str2.ch;
        if(ch.length!=ch2.length)
            return false;
        for(int i=0;i<ch.length;i++)
            if(ch[i]!=ch2[i])
                return false;
        return true;
    }
    MyString toUpperCase()
    {
        String ans="";
        for(int i=0;i<ch.length;i++)
        {
            if(!Character.isUpperCase(ch[i]))
            {
                int val=ch[i]-'a';
                ans+=String.valueOf((char)(val+65));
            }
            else ans+=String.valueOf(ch[i]);
        }
        return new MyString(ans);
    }
    MyString toLowerCase()
    {

        String res="";
        for(int i=0;i<ch.length;i++)
        {
            if(!Character.isLowerCase(ch[i]))
            {
                int val=ch[i]-'A';
                //ans=ans.concat(MyString.toMyString(String.valueOf((char)(val+97))));
                res+=String.valueOf((char)(val+97));

            }
            else
               // ans=ans.concat(MyString.toMyString(String.valueOf(ch[i])));
            res+=String.valueOf(ch[i]);
        }
        //System.out.println(ans.toString());
        return new MyString(res);
    }
    MyString substring(int start, int end)
    {
        String ans="";
        for(int i=start;i<end;i++)
            ans+=ch[i];
        return new MyString(ans);
    }
    MyString concat(MyString other)
    {

      return new MyString(s+ MyString.toString(other));


    }
  static   MyString  toMyString(String str)
    {
        return new MyString(str);
    }
   static String toString(MyString s)
    {
       return s.s;
    }
    boolean contains(MyString sub)
    {
        for(int i=0;i<=s.length()-sub.s.length();i++)
        {
            if(sub.s.equals(s.substring(i,i+sub.s.length())))
                return true;
        }
        return false;
    }
    int indexOf(char c)
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
                return i;
        }
        return -1;
    }
   MyString replace(char oldChar, char newChar)
    {
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]==oldChar)
                    ch[i]=newChar;
            }
            String str="";
            for(int i=0;i<ch.length;i++)
                str+=ch[i];
            return new MyString(str);
    }



}

public class StringMethodImplementation {
    public static void main(String args[])
    {
        String s="abcdFGejeLk";
        MyString str=new MyString(s);
        System.out.println("length: "+str.length());
        int i=1;
        System.out.println(i+" char: "+str.charAt(i));
        String s2="jk";
        MyString str2=new MyString(s2);
        System.out.println("Equality: "+str.equals(str2));
        System.out.println("Upper Case: "+MyString.toString(str.toUpperCase()));
        System.out.println("Lower Case: "+MyString.toString(str.toLowerCase()));
        System.out.println("Substring: "+MyString.toString(str.substring(0,3)));
        System.out.println("Concat: "+MyString.toString(str.concat(str2)));
        System.out.println("contains: "+str.contains(str2));
        System.out.println("index of: "+str.indexOf('e'));
        System.out.println("replace: "+MyString.toString(str.replace('e','@')));



    }
}
