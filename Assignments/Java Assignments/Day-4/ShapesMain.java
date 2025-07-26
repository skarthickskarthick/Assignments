package org.example.Day_4;
class Shape
{
    int a=9;
    void print()
    {
        System.out.println("This is a shape");
    }
}
class Polygon extends Shape
{

    void print()
    {
        super.print();
        System.out.println("This is a Polygon shape");
    }
}
class Rectangle extends Polygon
{
    void print()
    {

        System.out.println("Rectangle is a Polygon");
    }
}
class Triangle extends Polygon
{

    void print()
    {
        super.print();
        System.out.println("Triangle is a Polygon");
    }
}
class Square extends Triangle
{
    void print()
    {
        super.print();
        System.out.println("Square is Rectangle");
    }
}
public class ShapesMain {
    public static void main(String args[])
    {

        Square square=new Square();
        square.print();
        Rectangle rectangle=new Rectangle();
        rectangle.print();
    }
}
