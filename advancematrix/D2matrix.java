package advancematrix;

public class D2matrix {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false; //check whether matrix is empty

        int n = matrix.length;//row no
        int m = matrix[0].length;    //col num

        //binary search
        int lo = 0;
        int hi = (n*m) -1;    //last index 

        while(lo <= hi) {
            int mid = (lo + (hi-lo)/2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else{
                hi = mid -1;
            }

        }
        return false;

        
    }
}
}
