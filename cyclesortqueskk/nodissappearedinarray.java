//leetcode 448
package cyclesortqueskk;

import java.util.ArrayList;
import java.util.List;

public class nodissappearedinarray {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
         int i = 0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {i++;}

        }
         // search for missing no
        List<Integer> ans = new ArrayList<>();   //list is interface 
        for(int index =0; index<nums.length;index++){
        if(nums[index] != index+1){
            ans.add(index +1);
        }

    } return ans; 

    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

    

