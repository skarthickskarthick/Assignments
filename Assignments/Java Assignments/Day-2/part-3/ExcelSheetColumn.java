package org.example.Day_2_part_3;

class Solution1 {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber>0)
        {
            int r=columnNumber%26;

            if(r==0)
            {
                ans=(char)('A'+25)+ans;
                columnNumber=(columnNumber-1)/26;

            }
            else{
                ans=(char)('A'+r-1)+ans;

                columnNumber=columnNumber/26;
            }
        }
        return ans;
    }
}