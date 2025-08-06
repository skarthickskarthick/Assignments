package org.example.Day_12;
class TaskRunner implements Runnable{
    public void run()
    {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                System.out.println("message");
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class TaskRunnerImpl {
    public static void  main(String args[])
    {

        TaskRunner taskRunner1=new TaskRunner();
        Thread t1=new Thread(taskRunner1);
        TaskRunner taskRunner2=new TaskRunner();
        Thread t2=new Thread(taskRunner2);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
