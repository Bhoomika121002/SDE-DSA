package questions50;

public class reversearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reversearray(arr);

    }
    public static void reversearray(int nums[]){
           // System.out.println(nums);
        for(int i = nums.length-1; i>=0; i--){
            System.out.println(nums[i]);
        }
    }
    
}
