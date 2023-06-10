// brute force 
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;   //max store the array whose sum is max and worst case all min value 
        for(int i = 0; i< nums.length;i++){  //1234
            for(int j=i; j<nums.length;j++){   // i - 2 then j defines from 2--3--4
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum = sum+nums[k];
                }
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}


// optimal sol 
class Solutionn {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;   //max store the array whose sum is max and worst case all min value 
        
        for(int i = 0; i< nums.length;i++){  //1234
            int sum = 0;
            for(int j=i; j<nums.length;j++){   // i - 2 then j defines from 2--3--4
                sum = sum + nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}


//kandanes algo
class Solutionnn {
    public int maxSubArray(int[] nums) {
        int bestsum = Integer.MIN_VALUE; 
        int currentsum = 0;  
        
        for(int i = 0; i< nums.length;i++){  
            currentsum = Math.max(nums[i],currentsum+nums[i]);
            bestsum = Math.max(bestsum, currentsum);
        }
        return bestsum;
    }
}
