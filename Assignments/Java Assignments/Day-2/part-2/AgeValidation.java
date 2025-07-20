package org.example.Day_2_part_2;

import java.util.Scanner;

public class AgeValidation {
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ages for 10 people");
        int count1=0,count2=0,count3=0;
        for(int i=0;i<10;i++)
        {
            int age=sc.nextInt();
            if(age<18)
                count1++;
            else if(age>=18&&age<=60)
                count2++;
            else
                count3++;
        }
        System.out.println("age less than 18: "+count1);
        System.out.println("age between 18 to 60: "+count2);
        System.out.println("age greater than 60: "+count3);


    }
}
