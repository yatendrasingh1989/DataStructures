package com.yaten.poc.DS.Queue;

import java.util.ArrayList;

public class MyQueue<X> {
    private ArrayList<X> arryList;

    public MyQueue() {
        arryList= new ArrayList<X>();
    }

    public void enQueue(X newEntry){
        arryList.add(newEntry);
    }

    public X deQueue(){
        if(arryList.size()==0)
            throw new IllegalStateException("Queue is Empty.");
        X data=arryList.get(0);
        arryList.remove(0);
        return data;
    }

    public int size(){
        return arryList.size();
    }

    public boolean contains(X item){
        return arryList.contains(item);

    }
}
