package org.example.Day_2_part_3;

class Solution8 {
    public boolean detectCapitalUse(String word) {
        if(word.length()<2)
            return true;
        int capital=0;

        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
                capital++;
        }
        if(capital==word.length()||capital==0)
            return true;
        else if(capital==1&&Character.isUpperCase(word.charAt(0)))
            return true;
        return false;

    }
}
