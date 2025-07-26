package org.example.Day_3_part_2;

import com.sun.jdi.Value;

class BasicCalculator
{
    int  add(int a, int b)
    {
        return a+b;
    }
int subtract(int a, int b)
{
    return a-b;
}
int multiply(int a, int b)
{
    return a*b;
}
int divide(int a, int b)
{
    return a/b;
}
}
class AdvancedCalculator extends BasicCalculator
{
    double power(int base, int exponent)
    {
        return Math.pow(base,exponent);
    }
int modulus(int a, int b)
{
    return a%b;
}
double squareRoot(double number)
{
    return Math.sqrt(number);
}
}
class ScientificCalculator extends AdvancedCalculator
{
    double sin(double angle)
    {
        double rad=Math.toRadians(angle);
        return Math.sin(rad);
    }
double cos(double angle)
{
    double rad=Math.toRadians(angle);
    return Math.cos(rad);
}
double log(double value)
{
    return Math.log(value);
}
double exp(double value)
{
    return Math.exp(value);
}
}


public class Calculator {
    public static void main(String args[])
    {
        ScientificCalculator scientificCalculator=new ScientificCalculator();
       System.out.println(scientificCalculator.add(2,8));
        System.out.println(scientificCalculator.subtract(2,8));
        System.out.println(scientificCalculator.multiply(2,8));
        System.out.println(scientificCalculator.divide(2,8));
        System.out.println(scientificCalculator.power(2,3));
        System.out.println(scientificCalculator.modulus(2,8));
        System.out.println(scientificCalculator.squareRoot(8));
        System.out.println(scientificCalculator.sin(45));
        System.out.println(scientificCalculator.cos(45));
        System.out.println(scientificCalculator.log(8));
        System.out.println(scientificCalculator.exp(2));

    }
}
