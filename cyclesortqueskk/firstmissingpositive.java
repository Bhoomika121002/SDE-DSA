//leetcode 41

package cyclesortqueskk;

public class firstmissingpositive {
    public int firstMissingPositive(int[] arr) {

         int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1 ;
            //ignoring the -ve & >n
            if(arr[i] >0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else i++;

        }
         // search for missing no
        for(int index =0; index<arr.length;index++){
        if(arr[index] != index +1){    //index+1=value or not 
            return index +1;
        }

    } return arr.length+1;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
    