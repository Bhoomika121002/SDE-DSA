package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class slidingwindow {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n-k+1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i<a.length;i++){
            //remove numbers
            if(!q.isEmpty() && q.peek() == i-k){
                q.poll();
            }
            //remove smaller numbers as they are useless
            while(!q.isEmpty() && a[q.peekLast()] < a[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= k -1){
                r[ri++] = a[q.peek()];
            }
        }
        return r;     
    }
}
    

