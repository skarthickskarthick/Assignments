package org.example.Day_6.stringutils;



public class StringOperations {
    public String concat(String a,String b)
    {
        return a+b;
    }
    public String reverse(String str)
    {
        String ans="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }
        return ans;
    }
    public int length(String str)
    {
        return str.length();
    }
}
