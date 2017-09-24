package com.ameriprise.poc.DS.stack;

public class MyStack<X> {
    private X[] data;
    private int stackPointer;
    public MyStack() {
        this.data = (X[])new Object[100];
        stackPointer=0;
    }

    public X pop(){
    if(stackPointer==0)
             throw new IllegalStateException("No element in Stack.");
    return data[--stackPointer];
    }

    public void push(X newItem){
        if(stackPointer==100)
            throw new IllegalStateException("Stack is full.");
    data[stackPointer++]=newItem;
    }
    public int size(){
        return stackPointer;
    }
    public boolean contains(X item){
        for(int i=0;i<stackPointer;i++){
            if(data[i].equals(item)){
                return true;
            }
        }
        return false;
    }
}
