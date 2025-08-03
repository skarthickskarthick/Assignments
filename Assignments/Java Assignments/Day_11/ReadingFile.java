package org.example.Day_11;

import java.io.*;

public class ReadingFile {
    public static void main(String args[]) throws IOException
    {
        File file=new File("sample.txt");
        file.createNewFile();
      BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file,true));
      bufferedWriter.newLine();
      bufferedWriter.write("Learning new concepts");
      bufferedWriter.newLine();
      bufferedWriter.write("next line");
      bufferedWriter.close();
      BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
      String str="";
      while ((str=bufferedReader.readLine())!=null)
      {
          System.out.println(str);
      }


    }
}
