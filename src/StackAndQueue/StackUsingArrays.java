package StackAndQueue;

public class StackUsingArrays {
    int top = -1;
    int[] stack;

    public StackUsingArrays(int size){
        stack = new int[size];
    }

    public void push(int num){
        top = top+1;
        if( top == stack.length-1){
            System.out.println("Stack is full");
            return;
        }
        stack[top] = num;
    }

    public void pop(){
        if( top == -1){
            System.out.println("stack is empty");
            return;
        }
        stack[top] = 0;
        top = top-1;

    }

    public int top(){
        if( top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }

    public int size(){
        return top+1;
    }

    public void display(){
        if(top == -1 ){
            return;
        }
        for(int i=0;i<top+1;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
