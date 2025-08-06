package org.example.Day_12;
class Counter
{
    private int count=0;
    public int getCount()
    {
        return count;
    }
   synchronized public void increment()
    {
        count++;
    }

}
class Threading extends Thread
{
    private final Counter counter;
    Threading(Counter counter)
    {
        this.counter=counter;
    }
    public void run()
    {

        for(int i=0;i<1000;i++)
        {
            counter.increment();
        }
    }
}
public class SynchronisationImpl {
    public static void main(String args[])
    {
        Counter counter=new Counter();
        //Counter counter1=new Counter();
        Threading t1=new Threading(counter);
        Threading t2=new Threading(counter);
        Threading t3=new Threading(counter);
        t1.start();
        t2.start();
        t3.start();
        try
        {
            t1.join();
            t2.join();t3.join();
        }
        catch (InterruptedException e){}
        System.out.println("count: "+counter.getCount());

    }
}
//with sync the 3 threads run parallely without race condition
//join()- the main thread waits for all the three threads
// with only join 3 threads run serially that donot ensure multithreading concept
