package org.example.Day_1;

public class Scope {
    static int var1;
    static {
        System.out.println("first this static block is executed");
    }
    int instance_var=2;


    public static void main(String args[])
    {
        System.out.println("Initialisation of var1"+var1);
       helperMethod(var1);
       System.out.println("after the  increment"+var1);
       Scope s=new Scope();
       System.out.println(s.instance_var);

        {
            int block_var=10;
            System.out.println("block variable"+block_var);
        }

        final float pi=3.14f;
        System.out.println("final var="+pi);


    }
    public static  void helperMethod(int var1)
    {
        int local_var=0; //local variable
        ++var1;
    }
}
