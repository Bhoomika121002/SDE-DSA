package Hashing;

import java.util.HashMap;

public class longestsubstringwoutrepeatchar {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = 0;
        int start =0;
        for(int end = 0; end<s.length(); end++){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(start,map.get(s.charAt(end)) +1);
            }
            map.put(s.charAt(end),end);
            length = Math.max(length,end-start+1);
        } 
        return length;
        
    }
}
    
}
