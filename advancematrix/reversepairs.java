package advancematrix;

import java.util.ArrayList;

public class reversepairs {
    class Solution {
    public int reversePairs(int[] nums) { 
        return mergeSort(nums,0,nums.length-1);}
    int merge(int[] nums, int low, int mid, int high) {   //computing the pairs 
        int cnt = 0;
        int j = mid +1;
        for (int i = low; i<=mid; i++){
            while(j<=high && nums[i] > (2 *(long) nums[j])){
                j++;
            }
            cnt += (j-(mid+1));
        }
        ArrayList<Integer> temp = new ArrayList();  //temp arraylist
        int left = low, right = mid +1;
        while(left <= mid && right <= high){
            if(nums[left]<=nums[right]) {  //if smaller 
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }

        }
        while(left<=mid) {
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }
        //copy to original nums array
        for(int i = low; i<=high;i++){
            nums[i] = temp.get(i-low);

        }
        return cnt;

    }
    int mergeSort(int[] nums, int low, int high){
        if(low>=high) return 0;  //single element
        int mid = (low + high) /2;
        int inv = mergeSort(nums,low,mid);   //left half left and right recursion 
        inv += mergeSort(nums, mid+1,high);
        inv += merge(nums, low, mid, high);
        return inv;
    }
        
    }

    
}
