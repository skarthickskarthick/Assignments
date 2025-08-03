package org.example.Day_11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class  Product implements Serializable
{
   static File file=new File("product.txt");
   private static final long serialVersionUID=1L;
    int productid;
    String name;
    double price;
    int quantity;
    Product(int productid,String name,double price,int quantity)
    {
        this.price=price;
        this.productid=productid;
        this.name=name;
        this.quantity=quantity;

    }
    public String toString()
    {
        return productid+" "+name+" "+price+" "+quantity;
    }
    public static void addProducts(Product product) throws IOException,ClassNotFoundException
    {
        List<Product> products=read();
        products.add(product);
        write(products);
        System.out.println("Product added");

    }
    public static void display() throws IOException,ClassNotFoundException
    {
        System.out.println("product list");
        List<Product> products=read();
        for (Product p:products)
            System.out.println(p.toString());
    }
    public static void search(int id) throws IOException,ClassNotFoundException
    {
        List<Product> products=read();
        for (int i=0;i<products.size();i++)
        {
            if(products.get(i).productid==id)
            {
                System.out.println(products.get(i).toString());
               return;
            }
        }
        System.out.println("id not found!");
    }
    public static void update(int id) throws IOException,ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        List<Product> products=read();
        for (Product p:products)
        {
            if(p.productid==id)
            {
                System.out.println("enter the new price");
                p.price=sc.nextDouble();
                System.out.println("enter the new quantity");
                p.quantity= sc.nextInt();
                write(products);
                System.out.println("product updated");
                return;
            }
        }
        System.out.println("id not found!");
    }
    public static void delete(int id) throws IOException,ClassNotFoundException
    {
        List<Product> products=read();
        for (int i=0;i<products.size();i++)
        {
            if(products.get(i).productid==id)
            {
                products.remove(i);
                write(products);
                System.out.println("product deleted");
                return;
            }
        }
        System.out.println("id not found!");
    }
    public static void write(List<Product> products) throws IOException
    {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(products);
        objectOutputStream.close();


    }
    public static List<Product> read() throws IOException,ClassNotFoundException
    {
        if(file.length()==0)
            return new ArrayList<>();
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        List<Product> products=(List<Product>) objectInputStream.readObject();
        objectInputStream.close();
        return products;
    }
}
public class ProductsSerialisation {
    public static void main(String args[]) throws IOException,ClassNotFoundException
    {
        Scanner sc=new Scanner((System.in));
        File file=new File("product.txt");
        file.createNewFile();

        int ch;
        while (true)
        {
            System.out.println("1.add products 2.Read all products 3.search 4.update 5.delete 6.exit ");
            System.out.println("enter the choice");
            ch= sc.nextInt();

            if(ch==1)
            {
                List<Product> products=new ArrayList<>();
                System.out.println("enter the number of products");
                int n= sc.nextInt();
                for (int i=0;i<n;i++)
                {
                    System.out.println("enter product id");
                    int id= sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the name");
                    String name= sc.nextLine();

                    System.out.println("enter the price");
                    double price= sc.nextDouble();
                    System.out.println("enter the quantity");
                    int quantity= sc.nextInt();
                    Product p=new Product(id,name,price,quantity);
                    Product.addProducts(p);
                }

            }
            else if (ch==2) {
                Product.display();

            } else if (ch==3) {
                System.out.println("enter the id");
                int id= sc.nextInt();
                Product.search(id);

            } else if (ch==4) {
                System.out.println("enter the id");
                int id= sc.nextInt();
                Product.update(id);

            }
            else if (ch==5) {
                System.out.println("enter the id");
                int id= sc.nextInt();
                Product.delete(id);

            } else if (ch==6) {
                System.out.println("exit");
                break;

            }
        }
    }
}
