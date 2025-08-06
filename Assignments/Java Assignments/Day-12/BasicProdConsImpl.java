package org.example.Day_12;
//producerconsumer
import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer
{
    private final int limit=5;
    private final Queue<Integer> queue=new LinkedList();
    public  synchronized  void producer(int value) throws InterruptedException
    {
        while(queue.size()>=limit)
         {
             System.out.println("Producer waiting");
           wait();
        }
        queue.add(value);
        System.out.println("Produce: "+value);
        notifyAll();

    }
    public synchronized void consumer() throws InterruptedException
    {
        while (queue.isEmpty())
        {
            System.out.println("Consumer waiting");
            wait();
        }
        System.out.println("Consume: "+queue.poll());
        notifyAll();

    }


}
class PThread extends Thread
{
    ProducerConsumer producerConsumer;
    PThread(ProducerConsumer producerConsumer)
    {
     this.producerConsumer=producerConsumer;
    }
    @Override
    public void run() {
        int val=1;
        while(true)
        {
            try {
                producerConsumer.producer(val++);

            }
            catch (InterruptedException e){}

        }
    }
}
class CThread extends Thread
{
    ProducerConsumer producerConsumer;
    CThread(ProducerConsumer producerConsumer)
    {
        this.producerConsumer=producerConsumer;
    }
    @Override
    public void run() {


        for(int i=0;i<1;i++)
        {
            try {
                producerConsumer.consumer();

            }
            catch (InterruptedException e){}

        }
    }
}
public class BasicProdConsImpl {
    public static void main(String args[])
    {
        ProducerConsumer producerConsumer=new ProducerConsumer();
        PThread t1=new PThread(producerConsumer);
        CThread t2=new CThread(producerConsumer);
        t1.start();
        t2.start();
    }
}
