public class missrepeat {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int xor = 0;
        for(int val : arr) {
            xor = xor ^ val;
        }
        for(int i=1; i<=n; i++){  //duplicacy
            xor = xor ^ i;
        }
        int rmsbm = xor & (~xor +1); //
        
        int a = 0;  // repeating
        int b = 0;   // missing
        
        for (int val : arr){
            if((rmsbm & val) == 0) {
                a = a ^ val;
            }
            else
                b = b ^ val;
        }
        
        for (int i = 1; i<=n; i++){
            if((rmsbm & i) == 0){
                a = a ^ i;
            }else{
                b = b ^ i;
            }
        }
        
        int [] ans = new int [2];
        
        for (int val : arr){
            if(a == val) {
                ans[0] = a;
                ans[1] = b;
            }else if(b == val){
                ans[0] = b;
                ans[1] = a;
                break;
            }
        }
        return ans;
        
        
        
        
    }
}
    

