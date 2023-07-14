package Hashing;

import java.util.HashSet;

public class longestconsseq {
    class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
        set.add(num);
        
    }

    int longest =0;

    for(int num: nums){
        if(!set.contains(num-1)){
        int currentnum = num;
        int currentstreak =1;

        while(set.contains(currentnum+1)){
            currentnum +=1;
            currentstreak +=1; 
        }

        longest = Math.max(longest,currentstreak);
        }   
    }
    return longest;
}}
    
}
