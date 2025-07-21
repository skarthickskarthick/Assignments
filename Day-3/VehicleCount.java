package org.example.Day_3;
class  Vehicle
{
    static  int count=0;
    int vehicleId;
    String brandName;
    double price;
    {
        count++;
    }
    Vehicle()
    {

    }
    Vehicle(int vehicleId)
    {
        this.vehicleId=vehicleId;
    }
}

public class VehicleCount {
    public static void main(String args[])
    {
        Vehicle v=new Vehicle();
        Vehicle v1=new Vehicle(1);
        System.out.println(v1.count);
    }
}
