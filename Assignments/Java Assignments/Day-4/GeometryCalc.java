package org.example.Day_4;

import java.util.Scanner;

class Points
{
    private int x;
   private int y;
   Points()
   {
        x=0;y=0;
   }
   public void setXY(int x,int y)
   {
       this.x=x;
       this.y=y;
   }
   public int getX()
   {
       return x;
   }
   public  int getY()
   {
       return y;
   }
    void printPoints()
    {
     System.out.println("circle centre: (x,y): ("+x+","+y+")");
    }


}
class Circle extends Points
{
    private int radius;
    Circle()
    {

    }
    public void setRadius(int radius)
    {
        if(radius<0)
            radius=1;
        else
        this.radius=radius;
    }
    public int getRadius()
    {
        return radius;
    }
    double area()
    {
        return 3.14*radius*radius;
    }
}
public class GeometryCalc {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("enter radius");
        int r= sc.nextInt();
        Circle circle=new Circle();
        circle.setRadius(r);
        circle.setXY(a,b);
        circle.printPoints();
        System.out.println("radius: "+circle.getRadius());
        System.out.printf("area: %.2f",circle.area());
    }
}
