package org.example.Day_11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountingContents {
    public static void main(String args[]) throws IOException
    {
        File file=new File("sample.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
      int linecount=0,wordcount=0,charcount=0;
        String s="";
        while ((s=bufferedReader.readLine())!=null)
        {
            linecount++;
            String str[]=s.split(" ");
            wordcount+= str.length;
            for(String string:str)
                charcount+=string.length();
        }
        System.out.println("line count: "+linecount);
        System.out.println("word count: "+wordcount);
        System.out.println("char count: "+charcount);

    }
}
