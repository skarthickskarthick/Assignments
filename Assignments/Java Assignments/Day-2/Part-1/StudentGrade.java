package org.example.Day_2;

public class StudentGrade {
    public static void main(String args[])
    {
        int percent=75;
        System.out.println(grade_if(percent));
        System.out.println(grade_switch(percent));


    }
    public static String grade_if(int percent)
    {
        if(percent>=85&& percent<=100)
            return "Grade A";
        else if(percent>=70)
            return "Grade B";
        else if (percent >=50)
            return "Grade C";
        else
            return "Fail";
    }
    public static String grade_switch(int percent)
    {
        switch(percent/10)
        {
            case 10:
            case 9:
            case 8:
                return "Grade A";
            case 7:return "Grade B";
            case 6:
            case 5:return "Grade C";
            default:
                return "Fail";
        }
    }
}



