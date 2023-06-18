//count inversion in an array

//i<j -> a[i] > a[j]

//merge sort 
package matrix;

import java.util.Arrays;

class countInversion {

    public static void main(String[] args) {
        
            int [] arr = {1,20,6,4,5};

            System.out.println(mergeSortAndCount(arr, 0, arr.length-1));
        }


    public static int mergeAndCount(int[] arr, int l, int m, int r) {
        //left subarray
        int[] left = Arrays.copyOfRange(arr, l, m+1);

        //right subarray
        int [] right = Arrays.copyOfRange(arr, m+1, r+1);

        int i = 0, j=0, k=l, swaps = 0;

        while(i<left.length && j<right.length){
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else{
                arr[k++] = right[j++];
                swaps += (m+1) - (l+i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

        

        private static int mergeSortAndCount(int [] arr, int l, int r){
            //keeps track of the inversion count at a
            //particular node of the recursioon tree 

            int count = 0;

            if (l<r) {
                int m = (l+r)/2;    //divideing 
            

            //total inversion count = left subarray count + right subarray count + merge sort

            //left subarray count 
            count += mergeSortAndCount(arr,l,m);

            //right subarray
            count += mergeSortAndCount(arr, m+1,r);

            //merge count 
            count += mergeAndCount(arr,l,m,r);
             


        }
        return count;
    }

}
    

