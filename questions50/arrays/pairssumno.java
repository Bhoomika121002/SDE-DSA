package questions50.arrays;

import java.util.HashMap;

public class pairssumno {
    public static void main(String[] args) {
        int arr[] = {1,5,7,-1};
        int value = 6;
        sum(arr,value);
    }
    
    public static void sum(int[] nums,int value){
        int count =0;
        for(int i = 0; i<nums.length; i++)
            for(int j =i+1; j<nums.length; j++) {
                int sum = nums[i]+ nums[j];
                if(sum == value)
                    count++;
                }
                System.out.println(count);

            }


        public static void hashsum(int[] nums, int value){
            HashMap<Integer,Integer> m = new HashMap<>();
            int count = 0; 
            for(int i =0; i<nums.length;i++){
               if(m.containsKey(value-nums[i])){
                count+=m.get(value-nums[i]); 
            }
            // if not present then we put it in the hashmap 
            if(m.containsKey(nums[i])){
                m.put(nums[i], m.get(nums[i]) + 1);

            }
            else{
                m.put(nums[i],1);
            }
             
        }
     } }


    

