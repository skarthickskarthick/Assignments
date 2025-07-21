package org.example.Day_3;

import java.util.ArrayList;
import java.util.Scanner;

class Stores
{
    private static int id=0;
   private static String name;
    private static String location;
    ArrayList<Products> products=new ArrayList<Products>();
    public static void setDetails(String name,String location)
    {
        id++;
        Stores.name=name;
        Stores.location=location;


    }

    public static void displayStoreDetails()
    {
        System.out.println("store name: "+name+"  location: "+location);

    }
    public void addProducts(Products p)
    {
        products.add(p);
        //System.out.println("products added");
    }
    public  void displayAllProducts()
    {
        System.out.println("Products Available");
        System.out.println("id"+"  "+"name"+"  "+"price"+"  "+"quantity");

        for(Products p:products)
        {
            p.displayProducts();
        }
    }
}
class Products
{
//    static{
//        System.out.println("static block");
//    }
//    {
//        System.out.println("instance");
//    }

   int ProductID;
   String name;
   double price;
   int  quantity;
   ArrayList<Products> products=new ArrayList<>();
   Products()
   {
    price=0.0;
    quantity=0;
   }
   Products(int ProdctId,String name,double price,int quantity)
   {
       this.quantity=quantity;
       this.price=price;
       this.name=name;
       this.ProductID=ProdctId;
   }



   public void addProducts(int id,ArrayList<Stores> stores)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of products to add");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.println("enter the details of product "+ (i+1));
           System.out.println("enter product id");
           int pid= sc.nextInt();
           sc.nextLine();
           System.out.println("enter product name");
           String name= sc.nextLine();
           System.out.println("enter price");
           double price=sc.nextDouble();
           System.out.println("enter quantity");
           int quantity=sc.nextInt();
           Products p=new Products(pid,name,price,quantity);
           products.add(p);
           stores.get(id).products.add(p);

       }
   }
   public void displayProducts()
   {

       System.out.println(ProductID+" "+name+" "+price+" "+quantity);
   }
}
public class InventoryMain {
//    {
//        System.out.println("main instance");
//    }
//    static{
//        System.out.println("main static block");
//    }
    public static void main(String args[])
    {
      //Products p;
        Scanner sc=new Scanner(System.in);
        ArrayList<Stores> stores=new ArrayList<>();
        stores.add(new Stores());
        stores.get(0).setDetails("zoho","tenkasi");

        stores.get(0).displayStoreDetails();

        while(true)
        {
            System.out.println("1.add products 2.display products 3.exit");
            System.out.println("enter the choice");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("enter the stores id to add products");
                int id= sc.nextInt();
                id=0;
                Products p=new Products();
                p.addProducts(id,stores);
                System.out.println("products added");
               // stores.get(0).displayAllProducts();


            }
            else if(ch==2)
            {
                stores.get(0).displayAllProducts();
            }
            else if(ch==3)
            {
                System.out.println("exit");
                break;
            }

        }


    }
}
