package stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackusingqueue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();


        public static boolean isEmpty(){
            return q1.isEmpty();
        }
        public static void push(int data){
            while(!q1.isEmpty()){
                q2.offer(q1.poll());
            }
            q1.offer(data);

            while(!q2.isEmpty()){
                q1.offer(q2.poll());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return q1.poll();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return q1.peek();

        }
        public static void main(String[] args) {
            Stack s1 = new Stack();
                s1.push(1);
                s1.push(2);
                s1.push(3);
        
                while(!s1.isEmpty()){
                    System.out.println(s1.peek());
                    s1.remove();
                }
        
            }
    }
    
}
