package stacks;

import java.util.Stack;

public class pushatbottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pab(4,s);

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

        int top = s.pop();
        pab(data,s);
        s.push(top);
    }
    
}
