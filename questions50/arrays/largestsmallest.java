package questions50.arrays;

import java.util.Arrays;

public class largestsmallest {
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,7,9};
        Arrays.sort(arr);
        largestsmallest(arr);
    }
    public static void largestsmallest(int[] nums){
        
            System.out.println("the smallest number is" + nums[0]);
            System.out.println("the largest element is" + nums[nums.length-1]);


            //for(int i =0; i<nums.length;i++){
        }
    }
    

