package org.example.Day_2;

public class pattttern3b {
    public static void main(String args[])
    {
        String str="zohocorporations";
        int in=0;
        int n=0;
        for(int i=1;i<str.length()/2;i++)
        {
            if(i*i==str.length())
                n=i;
        }
        int i=1;
        do {
            int j=1;
            while(j<=n)
            {
                System.out.print(str.charAt(in++));
                j++;
            }
            System.out.println();
            i++;
        }while (i<=n);
    }
}
