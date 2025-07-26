package org.example.Day_6.user;

import org.example.Day_6.booking.Ticket;

public class User extends Ticket{
    int userid;
    String name;
    User(int userid,String name)
    {
        this.name=name;
        this.userid=userid;
    }
    public  User bookticket(int ticketid,String destination,double fare,int userid,String name)
    {
        System.out.println("ticket booked");
        User userticket=new User(userid,name);
        //super.destination=destination;
        userticket.ticketID=ticketid;
        userticket.destination=destination;
        userticket.fare=fare;
        return userticket;
    }
    public String toString()
    {
        return "id: "+ticketID+" destination: "+destination+" fare: "+fare+" userid: "+userid+" name: "+name;
    }
    public static void main(String args[])
    {
        User user=new User(3,"karthick");

        User t=user.bookticket(1,"tki",25,user.userid, user.name);
        //System.out.println("id: "+user.userid+" name: "+user.name);
        System.out.println(t.toString());
    }
}
