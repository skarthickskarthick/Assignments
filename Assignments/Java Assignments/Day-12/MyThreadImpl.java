package org.example.Day_12;
class MyThread extends Thread
{
    public void run()
    {
        try {
            for(int i=0;i<5;i++) {
                System.out.println(currentThread().getName());
                System.out.println("message1");
                Thread.sleep(500);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class MyThreadImpl {
    public static void main(String args[])
    {
        MyThread t1=new MyThread();
        t1.setName("MyThread1");

        MyThread t2=new MyThread();
        t2.setName("Mythread2");
        t1.start();
        t2.start();
    }
}
