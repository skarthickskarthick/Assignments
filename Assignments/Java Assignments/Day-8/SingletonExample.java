package org.example.Day_8;
class Singleton
{
    private static Singleton instance;
    private Singleton()
    {
        System.out.println("creating instance");
    }
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
            return instance;
        }
        return instance;
    }
}
public class SingletonExample {
    public  static void  main(String args[])
    {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
       // System.out.println(obj1.equals(obj2)); checks for logical equality
        System.out.println(obj1 == obj2);
    }
}
