package org.example.Day_4;
class twoD
{
    int x;
    int y;
    twoD()
    {
        System.out.println("TwoD default constructor");

    }
    twoD(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("TwoD constructor with two arguments");
    }


}
class threeD extends twoD
{
    int z;
    threeD()
    {

    }
    threeD(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setZ(int z)
    {
        this.z=z;
    }
    public int getZ()
    {
        return  z;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public int getY()
    {
        return  y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public int getX()
    {
        return  x;
    }
    public double distance(threeD t1,threeD t2)
    {
       double d= Math.pow((t2.x-t1.x),2)+Math.pow((t2.y-t1.y),2)+Math.pow((t2.z-t1.z),2);
       return Math.sqrt(d);
    }
}
public class DistanceCalculation {
    public static void main(String args[])
    {
        threeD t1=new threeD(1,2,3);
        threeD t2=new threeD();
        t2.setX(1);
        t2.setY(0);
        t2.setZ(2);
       System.out.printf("distance: %.2f",t2.distance(t1,t2));
    }

}
