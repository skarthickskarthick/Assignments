package org.example.Day_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileioExcep {
    public static void main(String args[])
    {
        File f=new File("sampl.txt");

        try {
           // f.createNewFile();

            FileInputStream fis=new FileInputStream(f);
            fis.close();
            fis.read();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block executed successfully");
        }
    }
}
