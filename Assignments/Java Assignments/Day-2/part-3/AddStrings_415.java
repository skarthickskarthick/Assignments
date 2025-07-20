package org.example.Day_2_part_3;

class Solution6 {
    public String addStrings(String num1, String num2) {
        String ans="";
        int sum=0,l1=num1.length()-1,l2=num2.length()-1;
        while(l1>=0||l2>=0)
        {
            if(l1>=0)
            {
                sum+=num1.charAt(l1)-'0';
                l1--;
            }
            if(l2>=0)
            {
                sum+=num2.charAt(l2)-'0';l2--;
            }
            ans=(sum%10)+ans;
            sum=sum/10;
        }
        if(sum!=0)
            return sum+ans;
        return ans;
    }
}