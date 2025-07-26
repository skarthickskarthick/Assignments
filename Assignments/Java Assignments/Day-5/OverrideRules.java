package org.example.Day_4;
class Animal
{
    Animal()
    {
        System.out.println("animal constructor");
    }
        private void print()
        {
            System.out.println("private animal class printing");
        }
        public void callprint()
        {
            print();
        }
        public static void print1()
        {
            System.out.println("static animal class printing");
        }
        public final void print2()
        {
            System.out.println("final animal class printing");
        }
}
class Dog extends Animal{
    Dog()
    {
        //super();
        System.out.println("dog constructor");
    }
    private void print()
    {
        System.out.println("private dog class printing");
    }
    public void callprintsub()
    {
        print();
    }
    public static void print1()
    {
        System.out.println("static dog class printing");
    }
//    public final void print2()
//    {
//        System.out.println("final animal class printing");
//    }//error
}

public class OverrideRules {
   public static void main(String args[])
   {
       Animal animal=new Dog();
       animal.callprint();
      // animal.print();
       Dog dog=new Dog();
       dog.callprintsub();

       Dog.print1();


//we cannot overide a final,constructor,private,static
       //overiding a static doesnot have meaning as it is hiding the methods
       // overiding a private method cannot be done, but those methods can be accessed by gettersa and setters
   }
}
