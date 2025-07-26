package org.example.Day_4;
class Vehicles
{
   int mileage;
   int  price;

}
enum Fuel{
    diesel,petrol
}
enum Cooling
{
    air,liquid,oil;
}
enum Wheel
{
    alloys,spokes
}
class Car extends Vehicles
{
    double ownership_cost;
    int warranty;
    int seating_capacity;
    Fuel fuel;
}
class Bike extends Vehicles
{
   int number_of_cylinders;
   int number_of_gears;
   Cooling cooling_type;
  Wheel wheel_type;
    int fuel_tank_size;

}
class Audi extends Car
{
    String model;
    void setDetails(int mileage,int price,double ownership_cost, int warranty, int seating_capacity, Fuel fuel,String model)
    {
        this.mileage=mileage;
        this.price=price;
        this.ownership_cost=ownership_cost;
        this.warranty=warranty;
        this.seating_capacity=seating_capacity;
        this.fuel=fuel;
        this.model=model;
    }
    void print(){
        System.out.println(model+" "+mileage+" "+price+" "+ownership_cost+" "+warranty+" "+seating_capacity+" "+fuel);
    }
}
class Ford extends Car
{
    String model;
    void setDetails(int mileage,int price,double ownership_cost, int warranty, int seating_capacity, Fuel fuel,String model)
    {
        this.mileage=mileage;
        this.price=price;
        this.ownership_cost=ownership_cost;
        this.warranty=warranty;
        this.seating_capacity=seating_capacity;
        this.fuel=fuel;
        this.model=model;
    }
    void print(){
        System.out.println(model+" "+mileage+" "+price+" "+ownership_cost+" "+warranty+" "+seating_capacity+" "+fuel);
    }
}
class Bajaj extends Bike
{
    String make_type;
    void setDetails(int mileage,int price,int number_of_cylinders, int number_of_gears, Cooling cooling_type, Wheel wheel_type, int fuel_tank_size,String make_type)
    {
        this.mileage=mileage;
        this.price=price;
        this.number_of_cylinders=number_of_cylinders;
        this.number_of_gears=number_of_gears;
        this.cooling_type=cooling_type;
        this.wheel_type=wheel_type;
        this.fuel_tank_size=fuel_tank_size;
        this.make_type=make_type;
    }
    void print(){
        System.out.println(make_type+" "+mileage+" "+price+" "+number_of_cylinders+" "+number_of_gears+" "+cooling_type+" "+wheel_type+" "+fuel_tank_size);
    }

}
class TVS extends Bike
{
    String make_type;
    void setDetails(int mileage,int price,int number_of_cylinders, int number_of_gears, Cooling cooling_type, Wheel wheel_type, int fuel_tank_size,String make_type)
    {
        this.mileage=mileage;
        this.price=price;
        this.number_of_cylinders=number_of_cylinders;
        this.number_of_gears=number_of_gears;
        this.cooling_type=cooling_type;
        this.wheel_type=wheel_type;
        this.fuel_tank_size=fuel_tank_size;
        this.make_type=make_type;
    }
    void print(){
        System.out.println(make_type+" "+mileage+" "+price+" "+number_of_cylinders+" "+number_of_gears+" "+cooling_type+" "+wheel_type+" "+fuel_tank_size);
    }
}

public class VehiclesMain {
    public static void main(String args[])
    {
        Audi audi=new Audi();
        audi.setDetails(20,30000000,120000,1,4,Fuel.petrol,"Audi");
        audi.print();
        Ford ford=new Ford();
        ford.setDetails(25,60000000,30000,1,5,Fuel.diesel,"Ford");
        ford.print();
        Bajaj bajaj=new Bajaj();
        bajaj.setDetails(25,1500000,3,5,Cooling.liquid,Wheel.spokes,10,"Bajaj");
        bajaj.print();
        TVS tvs=new TVS();
        tvs.setDetails(30,50000,6,4,Cooling.oil,Wheel.alloys,6,"TVS");
        tvs.print();

    }
}
