package org.example.Day_9;
class VotingException extends Exception
{
   public String getMessage()
   {
       return "invalid age!";
   }
   public void vote(int age) throws VotingException
   {

           if(age>=18)
               System.out.println("eligible");
           else
               throw new VotingException();

   }
}
public class VotingSystem {
    public static void main(String args[])
    {
        int age=18;
       VotingException exception=new VotingException();
       try {
           exception.vote(age);
       }
       catch (VotingException e)
       {
           System.out.println(e.getMessage());
       }

    }
}
