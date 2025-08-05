package org.example.Day_9;
class VotingException extends Exception
{
    String message;
  VotingException(String message)
  {
      this.message=message;
  }

}
public class VotingSystem {
    public static void main(String args[])
    {
        int age=17;
       try {
           validate(age);
       }
       catch (VotingException e)
       {
           System.out.println(e.message);
       }

    }
    public  static void validate(int age) throws VotingException
    {

        if(age>=18)
            System.out.println("eligible to vote");
        else
            throw new VotingException("not eligible");
    }
}
