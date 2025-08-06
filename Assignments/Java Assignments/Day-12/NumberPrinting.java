package org.example.Day_12;

//import java.util.concurrent.locks.Lock;

class Thread1 extends Thread
{
    private final Object lock;
    private  boolean[] flag; //like producer and consumer problem
    Thread1(Object lock,boolean[] flag)
    {
        this.lock=lock;
        this.flag=flag;
    }
   public void run()
   {
       try {
           for(int i=1;i<=20;i+=2)
           {
               synchronized (lock) {
                   while (!flag[0])
                       lock.wait();//here we sync lock and not the current object so syn of this is not valid
                   System.out.println(i);
                   flag[0]=false;
                   lock.notify();
               }
           }
       }
       catch (InterruptedException e) {
       }
   }
}
class Thread2 extends Thread
{
    private final Object lock;
    private  boolean flag[];
    Thread2(Object lock,boolean[] flag)
    {
        this.lock=lock;
        this.flag=flag;
    }

    public void run()
    {
        try {
            for(int i=2;i<=20;i+=2)
            {
                synchronized (lock) {
                    while (flag[0])
                        lock.wait();
                    System.out.println(i);
                    flag[0]=true;
                    lock.notify();
                }
            }
        }
        catch (InterruptedException e){}

    }
}
public class NumberPrinting {
    public static void main(String args[])
    {
       // Lock lock=new Lock();
        Object lock=new Object();
        boolean[] flag={true};
        Thread1 t1=new Thread1(lock,flag);
        t1.start();
        Thread2 t2=new Thread2(lock,flag);
        t2.start();
    }
}
