package StackAndQueue;

import java.util.LinkedList;
import java.util.List;

public class StackUsingLinkedList {
    LLNode top = null;
    private int size = 0;
    List<LLNode> arr = new LinkedList<>();

    public void push(int data){
        LLNode newNode = new LLNode(data);
        top = newNode;
        size+=1;
    }

    public void pop(){
        if(top == null){
            System.out.println("stack is empty");
            return;
        }
        LLNode temp = top;
        top = top.next;
        size-=1;
    }

    public int top(){
        if(top == null){
            return -1;
        }
        return this.top.data;
    }

    public int getSize(){
        return this.size;
    }
}
