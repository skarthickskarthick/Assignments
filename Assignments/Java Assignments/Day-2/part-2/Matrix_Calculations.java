package org.example.Day_2_part_2;

import java.util.Scanner;

public class Matrix_Calculations {
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean created=false;
        int[][] mat=null;
        int ch=0;

        while(true) {
            System.out.println("1.create 2.print 3.sum 4.row sum 5.column sum 6. transpose 7.exit");
            System.out.println("enter the choice");
            ch=sc.nextInt();
            if (ch == 1) {
                created = true;
                mat = create();

            } else if (ch == 2) {
                if (created){
                    print(mat);

            }
                else {
                    System.out.println("matrix not created");
                }
             }
            else if(ch==3)
            {
                if (created){
                    sum(mat);

                }
                else {
                    System.out.println("matrix not created");
                }

            }
            else if(ch==4)
            {
                if (created){
                    rowsum(mat);

                }
                else {
                    System.out.println("matrix not created");
                }
            } else if (ch==5) {
                if (created){
                    columnsum(mat);
                }
                else {
                    System.out.println("matrix not created");
                }

            } else if (ch==6) {
                if (created){
                    transpose(mat);

                }
                else {
                    System.out.println("matrix not created");
                }

            } else if (ch==7) {
                System.out.println("exit");
                System.exit(0);

            }
        }


    }
    public static int[][] create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row length");
        int m= sc.nextInt();
        System.out.println("enter the column length");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]= sc.nextInt();
            }
        }
        return mat;
    }
    public static void print(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    public static void  sum(int mat[][])
    {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
               sum+=mat[i][j];
            }

        }
        System.out.println("sum="+sum);
    }
    public static void  rowsum(int[][] mat)
    {

        for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[i].length;j++)
            {
                sum+=mat[i][j];
            }
            System.out.println(i+1+"row sum="+sum);
        }
    }
    public static void  columnsum(int[][] mat)
    {
        for(int i=0;i<mat[0].length;i++)
        {
            int sum=0;
            for(int j=0;j<mat.length;j++)
            {
                sum+=mat[j][i];
            }
            System.out.println(i+1+" column sum="+sum);
        }
    }
    public  static void  transpose(int[][] mat)
    {
        int transpose[][]=new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++)
        {

            for(int j=0;j<mat[0].length;j++)
            {
               transpose[j][i]=mat[i][j];
            }
        }
        print(transpose);
    }

}
