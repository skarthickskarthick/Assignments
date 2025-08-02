package org.example.Day_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multipletrystatements {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try {

            String a = sc.nextLine();
            String b = sc.nextLine();
           int n = Integer.parseInt(b);
           int num= sc.nextInt();
            int div=num/0;
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {

        }
    }
}
