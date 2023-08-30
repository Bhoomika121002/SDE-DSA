package questions50.arrays;

import java.util.Arrays;

public class removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        Arrays.sort(arr);
        duplicateno(arr);
    }
    static void duplicateno(int[] nums){
        for (int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length;j++){
                
                if(nums[i] == nums[j]){
                    nums[i] = -1; 
                }
            } 
                    if(nums[i] != -1)
                    System.out.println(nums[i]);
                }
                
               
                }
            }
    
    
