package org.example.Day_9;

import javax.naming.AuthenticationException;

class Authenticate
{
    public static void login(String username,String password) throws AuthenticationException
    {
        String usernamee="abc";
        String passwordd="123";

            if(usernamee.equals(username)&&passwordd.equals(password))
            {
                System.out.println("login successful!");
            }
            else
                throw new AuthenticationException();


    }
}
public class AuthenticationExcep {
    public static void main(String args[])
    {
        try {
            Authenticate.login("abcd","123");
        }
        catch (AuthenticationException e)
        {
            System.out.println("Invalid data!");

        }

    }
}
