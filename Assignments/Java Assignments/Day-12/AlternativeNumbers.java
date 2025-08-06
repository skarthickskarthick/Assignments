package org.example.Day_12;
class NumberThread1 extends Thread
{
    private final Object lock;
    private final boolean flag[];
    NumberThread1(Object lock,boolean[] flag)
    {
        this.lock=lock;
        this.flag=flag;
    }
     public void run()
    {
        for (int i=1;i<=20;i+=2)
        {
            synchronized (lock) {
                try {
                    while(!flag[0])
                        lock.wait();
                    System.out.println(i);
                    flag[0]=false;
                    lock.notify();


                } catch (InterruptedException e) {
                }
            }

        }
    }
}
class NumberThread2 extends Thread
{
   private final  Object lock;
   private final boolean[] flag;
    NumberThread2(Object lock,boolean[] flag)
    {
        this.lock=lock;
        this.flag=flag;
    }
   public void run()
    {
        for (int i=2;i<=20;i+=2)
        {
            synchronized (lock) {
                try {
                    while(flag[0])
                    lock.wait();

                    System.out.println(i);
                    flag[0]=true;
                    lock.notify();

                } catch (InterruptedException e) {
                }
            }
        }
    }
}
public class AlternativeNumbers {
    public static void main(String  args[]) {
        Object lock = new Object();
        boolean[] flag={true};
        NumberThread1 t1 = new NumberThread1(lock,flag);
        NumberThread2 t2 = new NumberThread2(lock,flag);
        t1.start();
      t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){ }
        System.out.println("completed printing");
    }
}
