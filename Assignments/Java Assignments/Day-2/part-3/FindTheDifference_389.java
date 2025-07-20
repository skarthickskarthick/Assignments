package org.example.Day_2_part_3;

class Solution3 {
    public char findTheDifference(String s, String t) {
        int[] ch=new int[26];
        for(int i=0;i<s.length();i++)
        {
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']++;
        }
        ch[t.charAt(t.length()-1)-'a']++;
        for(int i=0;i<26;i++)
        {
            if(ch[i]%2!=0)
                return (char)('a'+i);
        }
        return ' ';
    }
}
