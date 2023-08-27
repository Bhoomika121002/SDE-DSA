package questions50.arrays;

public class missingno {
    public static void main(String[] args) {
        int[] arr= {1,3,4,5};
        int N = arr.length;
        System.out.println(missingno(arr , N));
        
         
    }
    public static int missingno(int[] nums,  int n){
        int sum = ((n+1) * (n+2)) /2;
        for(int i =0; i<n; i++){
            sum = sum - nums[i];
        }return sum;
    }
}
