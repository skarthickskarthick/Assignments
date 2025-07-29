package org.example.Day_7;
interface Ticket
{
    abstract void book();
}
class Bus implements Ticket
{
    String from;
    String to;
    String name;
    Bus(String from,String to,String name)
    {
        this.from=from;
        this.to=to;
        this.name=name;
    }
   public  void book()
    {
        System.out.println("tickets booked for bus");
        System.out.println("From: "+from+"  To: "+to);
        System.out.println("Bus Name: Sundara Travels  Seat NO: 6");
    }
}
class Train implements Ticket
{
    String from;
    String to;
    String name;
    Train(String from,String to,String name)
    {
        this.from=from;
        this.to=to;
        this.name=name;
    }
  public   void book()
    {
        System.out.println("tickets booked for Train");
        System.out.println("From: "+from+"  To: "+to);
        System.out.println("Name: "+name);
        System.out.println("Train Name: Silambu Express Coach No:A1 Seat NO: 12");
    }
}
class Flight implements Ticket
{
    String from;
    String to;
    String name;
    Flight(String from,String to,String name)
    {
        this.from=from;
        this.to=to;
        this.name=name;
    }
   public void book()
    {
        System.out.println("tickets booked for flight");
        System.out.println("From: "+from+"  To: "+to);
        System.out.println("Bus Name: Maran AirLines Seat NO: 3");
    }
}
public class TicketInterface {
    public static void main(String args[])
    {
       Bus b=new Bus("Tvl","Tki","karthick");
        b.book();

        Ticket f=new Flight("USA","India","bala");
        f.book();

       Ticket t=new Train("Tki","Tvl","karthick");
        t.book();
    }
}

