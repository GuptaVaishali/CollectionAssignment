package Ques7;

import java.util.Stack;

class SpecialStack extends Stack {
    Stack<Integer> minStack = new Stack<>();
    void push(int x){
        if(isEmpty()){
            super.push(x);
            minStack.push(x);
        }
        else{
            super.push(x);
            if(x < minStack.peek()){
                minStack.push(x);
            }
            else{
                minStack.push(minStack.peek());
            }
        }
    }

    public Integer pop(){
        int x = (int)super.pop();
        minStack.pop();
        return x;
    }

    public int getMin(){
        int x = minStack.pop();
        return x;
    }

    public boolean empty(){
        return super.empty();
    }
}


public class Ques7 {
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(23);
        s.push(19);
        s.push(18);
        s.push(32);
        s.push(20);

        System.out.println("Minimum Element  = " + s.getMin());
        s.push(5);
        System.out.println("Minimum Element = " + s.getMin());
    }
}
