package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (num ==null || num.length ==0)    //check if the nums is empty or not 

        return res;

        int n = num.length;
        Arrays.sort(num);

        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){

                int target2 = target - num[i] - num[j];

                int left = j+1;
                int right = n-1;

                while(left<right) {  //keep traversing untill cross

                    //add both left & right
                   int two_sum = num[left] + num[right];

                   if(two_sum <target2) left++;
                   else if (two_sum > target2) right--;
                   else{
                       List<Integer> quad = new ArrayList();
                       quad.add(num[i]);
                       quad.add(num[j]);
                       quad.add(num[left]);
                       quad.add(num[right]);
                       res.add(quad);  //add to result 

                       //remove all the duplicates 
                       //processing the duplicates of number 3
                       while(left <right && num[left] == quad.get(2)) ++left;

                       //processing the duplicates of number 4 
                       while(left < right  && num[right] == quad.get(3)) --right;

                   }
            }
            //remove duplictes of j 

            while(j +1 < n && num[j+1] == num[j])  ++j;
            //remove duplicates on i
             while(i +1 < n && num[i+1] == num[i])  ++i;

        }
    }
    return res;
   
}

}
    

