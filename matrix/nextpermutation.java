package matrix;

class Solution {
    public void nextPermutation(int[] A) {
        if(A == null || A.length <=1) return;    //for array with single element next permutaion is he himself.) 
        //breakpoint find 
        int i = A.length -2;  //leaving the last index element
        while(i >= 0 && A[i] >= A[i +1]) i--;

        if(i>=0){
            int j = A.length -1;
            while(A[j] <= A[i]) j--;    //find who is greater than i
            swap(A,i,j);
        }
        reverse(A, i+1, A.length-1);

    }
    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public void reverse(int[] A, int i, int j){
        while(i<j) swap(A, i++, j--);
    }
}
