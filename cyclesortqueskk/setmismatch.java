//leetcode 645

package cyclesortqueskk;

public class setmismatch {
    public int[] findErrorNums(int[] arr) {  
        // keep the element at the correct position by swapping 
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {i++;}

        }
         // search for missing no
        for(int index =0; index<arr.length;index++){
        if(arr[index] != index+1){
            return new int[]{arr[index],index+1};
        }

    } return new int[] {-1,-1};

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
