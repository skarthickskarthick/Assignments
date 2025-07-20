package org.example.Day_2_part_3;

class Solution2 {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char c[]=s.toCharArray();
        String vow="AEIOUaeiou";
        while(l<r)
        {
            if(!vow.contains(String.valueOf(c[l])))
                l++;
            else if(!vow.contains(String.valueOf(c[r])))
                r--;
            else{
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;

            }
        }
        return new String(c);

    }
}
