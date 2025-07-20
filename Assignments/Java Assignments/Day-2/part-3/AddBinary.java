package org.example.Day_2_part_3;
class Solution {
    public String addBinary(String a, String b) {


        String ans="";
        int carry=0,ap=a.length()-1,bp=b.length()-1;
        while(ap>=0||bp>=0)
        {
            if(ap>=0){
                carry+=a.charAt(ap)-'0';
                ap--;
            }
            if(bp>=0){
                carry+=b.charAt(bp)-'0';
                bp--;
            }

            ans=(carry%2)+ans;
            carry=carry/2;


        }
        if(carry!=0)
            return carry+ans;
        return ans;
    }
}
