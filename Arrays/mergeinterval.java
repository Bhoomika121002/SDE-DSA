import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[][] merge(int[][] intervals) {
       
       //sort array according to the starting point 
       Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0])); // compare intervals with the stating point
       Stack<int[]> stack = new Stack(); // store intervals 

       stack.add(intervals[0]); //1st interval pushed 

       for (int i = 1; i<intervals.length;i++){
           int startpoint2 = intervals[i][0];
           int endpoint2 = intervals[i][1];

           int[] poparray = stack.pop();   // 1st inteval in stack needs to be popped

           int startpoint1 = poparray[0];
           int endpoint1 = poparray[1];

           //1 3
           //2 6

           int endmax = Math.max(endpoint2,endpoint1);

           if(endpoint1 >= startpoint2 ){   // in this merge 
                int[] merge = new int[]{startpoint1,endmax};
                stack.add(merge);
           }else{
               stack.add(poparray); // if not merged then wrong is poped push back
               stack.add(intervals[i]); //push current interval so that it can be compared 
           }

       }

       // output print 
       int [][] output = new int[stack.size()][2];  //empty stack

       for(int i = output.length-1; i>=0;i--){  // elements from back
            int[] poparray = stack.pop();
            output[i][0] = poparray[0];
            output[i][1] = poparray[1];
       }
       return output;

    }
}