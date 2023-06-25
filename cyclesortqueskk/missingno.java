//leetcode 268
package cyclesortqueskk;

public class missingno {

    public static int missingNumber(int[] arr) {
  
        // keep the element at the correct position by swapping 
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else i++;

        }
         // search for missing no
        for(int index =0; index<arr.length;index++){
        if(arr[index] != index){
            return index;
        }

    } return arr.length;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
    

