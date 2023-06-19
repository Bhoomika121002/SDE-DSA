package advancematrix;

public class powxn {
    class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;    //duplicate copy of n because in algo n destroyed 

        if (nn<0) nn = -1 * nn;   //if -ve number make it + number 
        while(nn > 0) {  //odd power 
            if( nn % 2 ==1){
                ans = ans * x;
                nn = nn -1;
            }
            else { //power even 
                x = x* x;
                nn = nn /2;
            }
        }  //if -ve value 
        if ( n<0) ans = (double)(1.0) / (double)(ans);
        return ans;
        
    }
}
    
}
