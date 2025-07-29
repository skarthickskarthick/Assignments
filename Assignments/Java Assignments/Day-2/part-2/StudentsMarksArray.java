package org.example.Day_2_part_2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsMarksArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        int n = 2;
        int[][] arr = new int[n][4];
        ;
        for (int i = 0; i < n; i++) {

            System.out.println("enter details for student " + (i+1));
            System.out.println("enter the rollno");
            int rollno = sc.nextInt();
            System.out.println("enter the mark1");
            int mark1 = sc.nextInt();
            System.out.println("enter the mark2");
            int mark2 = sc.nextInt();
            System.out.println("enter the mark3");
            int mark3 = sc.nextInt();
            arr[i][0] = rollno;
            arr[i][1] = mark1;
            arr[i][2] = mark2;
            arr[i][3] = mark3;


        }
        System.out.println("rollno   " + "mark1   " + "mark2   " + "mark3   " + "total   " + "average   ");
        for (int i = 0; i < n; i++)
        {
            int sum=arr[i][1]+arr[i][2]+arr[i][3];
            int average=sum/3;
            System.out.println(arr[i][0]+"        "+arr[i][1]+"     "+arr[i][2]+"     "+arr[i][3]+"     "+sum+"    "+average);
        }
    }
}