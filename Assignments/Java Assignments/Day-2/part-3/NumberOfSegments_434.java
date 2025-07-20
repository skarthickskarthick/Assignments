package org.example.Day_2_part_3;

class Solution7 {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty())
            return 0;
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==' '&&ch[i+1]!=' ')
                count++;
        }
        return count+1;
    }
}
