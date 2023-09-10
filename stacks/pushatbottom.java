package stacks;

import java.util.Stack;

public class pushatbottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //pab(4,s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void pab(int data, Stack<Integer> s){
        //base condition 
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();  //remove elements
        pab(data,s);    //push the new element
        s.push(top);    //push the removed elements 
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pab(top, s);
    }   
}
