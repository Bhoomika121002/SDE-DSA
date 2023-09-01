package questions50.arrays;

import java.util.Arrays;

public class duplicateno {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        Arrays.sort(arr);
        duplicateno(arr);
    }
    static void duplicateno(int[] nums){
        for (int i = 0; i<nums.length-1; i++){
            int count = 1;
            for(int j = i+1; j<nums.length;j++){
                
                if(nums[i] == nums[j]){
                    count++;
                }
                else {
                break;
            } 
                } 
                if(count > 1){
                    System.out.println(nums[i]);
                }
            }
    }
    
}
