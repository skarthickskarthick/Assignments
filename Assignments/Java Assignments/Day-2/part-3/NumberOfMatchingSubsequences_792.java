package org.example.Day_2_part_3;

import java.util.HashMap;

class Solution5 {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        for(String str:words)
        {
            if(map.containsKey(str))
                map.put(str,map.get(str)+1);
            else
                map.put(str,1);
        }
        for(String str:map.keySet())
        {
            int l=0,r=0;
            while(l<str.length()&&r<s.length())
            {
                if(str.charAt(l)==s.charAt(r))
                    l++;
                r++;
            }
            if(l==str.length())
                count+=map.get(str);
        }
        return count;
    }
}