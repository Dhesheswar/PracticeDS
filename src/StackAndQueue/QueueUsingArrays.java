package StackAndQueue;

public class QueueUsingArrays {
    int start = -1;
    int end = -1;
    int[] queue;

    public QueueUsingArrays(int size){
        queue = new int[size];
    }

    public void push(int num){
        if(start == -1){
            start = 0;
        }
        end = (end+1) % queue.length;
        queue[end] = num;
    }

    public void pop(){
        if( end == -1){
            System.out.println("stack is empty");
            return;
        }
        queue[start] = 0;
        start = (start +1 ) % queue.length;
    }

    public int top(){
        if(start == -1 ){
            System.out.println("Queue is empty");
        }
        return queue[start];
    }

    public int size(){
        if(end == -1){
            System.out.println("Queue is empty");
        }
        return (end-start + queue.length) % queue.length+1;
    }
}
