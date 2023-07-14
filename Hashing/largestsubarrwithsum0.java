package Hashing;

import java.util.HashMap;

public class largestsubarrwithsum0 {
    class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0; 
         int max = 0; 
         for (int i=0; i<n; i++){
             sum += arr[i];
             if(sum == 0){
                 max = i+1; 
             }
            else{
                if(map.get(sum) != null){   //exist in hashmap or not 
                max = Math.max(max, i - map.get(sum));
                    
                }
                else{
                    map.put(sum,i);
                }
            }
         }
         return max; 
    }
}
    
}
