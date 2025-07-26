package org.example.Day_4;
abstract class Ticket
{
    String from;
    String to;
    String name;
    Ticket(){

    }// default constructor is always created since the compiler cannot make parameterised constructor by default
    Ticket(String from,String to,String name)
    {
        this.from=from;
        this.to=to;
        this.name=name;
    }
    Ticket(String from,String to)
    {
        this.from=from;
        this.to=to;
    }

abstract void book();

}
class Bus extends Ticket
{
    Bus(String from,String to)
    {
        super(from, to);
    }
    void book()
    {
        System.out.println("tickets booked for bus");
        System.out.println("From: "+super.from+"  To: "+super.to);
        System.out.println("Bus Name: Sundara Travels  Seat NO: 6");
    }
}
class Train extends Ticket
{
    Train(String from,String to,String name)
    {
        super(from, to,name);
    }
    void book()
    {
        System.out.println("tickets booked for Train");
        System.out.println("From: "+from+"  To: "+to);
        System.out.println("Name: "+name);
        System.out.println("Train Name: Silambu Express Coach No:A1 Seat NO: 12");
    }
}
class Flight extends Ticket
{
    Flight(String from,String to)
    {
        super(from, to);
    }
    void book()
    {
        System.out.println("tickets booked for flight");
        System.out.println("From: "+from+"  To: "+to);
        System.out.println("Bus Name: Maran AirLines Seat NO: 3");
    }
}
public class TicketPoly {
    public static void main(String args[])
    {
       Ticket b=new Bus("Tvl","Tki");
       b.book();

       Ticket f=new Flight("USA","India");
       f.book();

       Ticket t=new Train("Tki","Tvl","karthick");
       t.book();
    }
}
