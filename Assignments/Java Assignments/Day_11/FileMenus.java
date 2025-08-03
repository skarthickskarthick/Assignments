package org.example.Day_11;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class FileMenus {
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        while(true)
        {
            System.out.println("1.Write contents 2.Copy file 3.Modify contents 4.searchword 5.copy to csv6.exit");
            System.out.println("enter the choice");
            ch= sc.nextInt();
            sc.nextLine();
            if(ch==1)
            {
                writeContent();
            } else if (ch==2) {
                transferContents();

            } else if (ch==3) {
                modifyContent();

            } else if (ch==4) {
                searchWord();

            } else if (ch==5) {
                copyCsv();

            } else if (ch==6) {
                break;
            }
        }
    }
    public static void writeContent() throws IOException
    {
        File file=new File("sample.txt");
        System.out.println("enter the contents(type \"exit\" to stop)");
        Scanner sc=new Scanner(System.in);
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file,true));
        while(true)
        {
            String s= sc.nextLine();
            if(s.equalsIgnoreCase("exit")) {
                bufferedWriter.close();
                sc.close();
                break;
            }
            bufferedWriter.write(s);
            bufferedWriter.newLine();

        }
    }
    public static void transferContents() throws  IOException
    {
        File file1=new File("sample.txt");
        File file2=new File("copy.txt");
        file2.createNewFile();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file2,true));
        String s="";
        while ((s=bufferedReader.readLine())!=null)
        {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
        System.out.println("Files copied successfully");

    }
    public static void modifyContent() throws IOException
    {
        File file=new File("sample.txt");
        System.out.println("enter the contents(type \"exit\" to stop)");
        Scanner sc=new Scanner(System.in);
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
        while(true)
        {
            String s= sc.nextLine();
            if(s.equalsIgnoreCase("exit")) {
                bufferedWriter.close();
                sc.close();
                break;
            }
            bufferedWriter.write(s);
            bufferedWriter.newLine();

        }
    }
    public static void searchWord() throws IOException
    {
        File file=new File("sample.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String word= sc.nextLine();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String s="";
        int count=0;
        while((s=bufferedReader.readLine())!=null)
        {
          String[] str=s.split(" ");
          for (String string:str)
          {
              if(string.equalsIgnoreCase(word))
                  count++;

          }

        }
        if(count!=0)
            System.out.println("count: "+count);
        else
            System.out.println("word not found!");
        sc.close();
        bufferedReader.close();
    }
    public static void copyCsv() throws IOException
    {
        File file=new File("sample.txt");
        File csvfile=new File("csvfile.csv");
        csvfile.createNewFile();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(csvfile,true));
        String s="";
        while ((s=bufferedReader.readLine())!=null)
        {
            String str[]=s.split(" ");
            for (String string:str)
            bufferedWriter.write(string+",");
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
        System.out.println("Files copied successfully");
    }
}
