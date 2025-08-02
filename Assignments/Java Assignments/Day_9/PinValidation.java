package org.example.Day_9;

import java.util.Scanner;

public class PinValidation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;


        while(true)
        {
            System.out.println("enter the pin");
            String s= sc.nextLine();

            try
            {
                if(s.length()==4&&(int)Math.log10(Integer.parseInt(s))+1==4)
                {
                    n=Integer.parseInt(s);
                    System.out.println("valid pin: "+n);
                    break;
                }
                else
                {
                    System.out.println("validation failed!");
                }
            }
            catch (Exception e)
            {
                System.out.println("invalid pin");
            }
        }
    }
}
