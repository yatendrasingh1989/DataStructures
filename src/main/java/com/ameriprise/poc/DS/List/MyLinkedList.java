package com.ameriprise.poc.DS.List;

import java.util.Objects;

public class MyLinkedList<X> {
    private Node first;
    private  Node last;
    private int nodeCount;
    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void add(X item){
        if(Objects.isNull(first)){
            first=new Node(item);
            last=first;
        }else{
            Node newNode=new Node(item);
            last.setNextNode(newNode);
            last=newNode;
        }
    nodeCount++;
    }

    public int size(){
        return nodeCount;
    }

    public void insert(X item, int position){
        if(size()<position)
            throw new IllegalStateException("Position not valid for list.");

        Node currentNode;
        int i=1;
        if(position<=i){
            currentNode= new Node(item);
            currentNode.setNextNode(first);
            first=currentNode;
        }
        else{
            currentNode =first;
            while(i++<=position-2){
                currentNode= currentNode.getNextNode();
            }
            Node newNode= new Node(item);
            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
        }

        nodeCount++;
    }

    public X removeAt(int position){
        if(size()<position){
            throw new IllegalStateException("Position not valid for list.");
        }
        Node currentNode;
        Node nodeToBeDeleted;
        int i=1;
        if(position<=i){
            nodeToBeDeleted=first;
            first=first.getNextNode();
        }else{
            currentNode=first;
            while(i++<=position-2){
                currentNode=currentNode.getNextNode();
            }

            nodeToBeDeleted=currentNode.getNextNode();
            Node nextNode=nodeToBeDeleted.getNextNode();
            currentNode.setNextNode(nextNode);
        }

        nodeCount--;
        return nodeToBeDeleted.getNodeItem();
    }

    @Override
    public String toString() {
       Node currentNode=first;
       String str="";
        int i=0;
        while(i<nodeCount){
            str+="--"+currentNode.getNodeItem().toString();
            currentNode=currentNode.getNextNode();
            i++;
        }
    return str;
    }

    private class Node{
        private Node nextNode;
        private X nodeItem;

        public Node(X nodeItem) {
            this.nodeItem = nodeItem;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }
    }
}
