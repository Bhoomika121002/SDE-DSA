package Hashing;

import java.util.HashMap;

public class countsubarrayxorask {
    class solutions{
        public int solve(int[]A, int B){
            HashMap<Integer,Integer> map = new HashMap<>();
            int count = 0;
             int xor = 0;
             int n = A.length;
             for(int i = 0; i< n ; i++){
                xor = xor ^ A[i];
                if(map.get(xor^B) != null)     // y = xr^K
                count += map.get(xor ^B);

                if(xor == B){
                    count ++;
                }

                if(map.get(xor) != null)
                    map.put(xor, map.get(xor) +1);
                else map.put(xor,1);
             }
             return count;
        }
    }
    
}
