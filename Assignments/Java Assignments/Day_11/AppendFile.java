package org.example.Day_11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
    public static void main(String args[]) throws IOException {
        File file = new File("sample.txt");
        System.out.println("enter the contents(type \"exit\" to stop)");
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        while (true) {
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("exit")) {
                bufferedWriter.close();
                sc.close();
                break;
            }
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        System.out.println("Contents appended");
    }
}
