package com.yaten.poc.DS.List;

public class MyLinkedListEndpoint {

    public static void main(String args[]){
        MyLinkedList<String> myLinkedList= new MyLinkedList<String>();
        myLinkedList.add("Papa");
        myLinkedList.add("Mummy");
        myLinkedList.add("Yati");
        myLinkedList.add("Deepak");
        myLinkedList.add("Harnu");
        myLinkedList.add("Krishna");

        System.out.println(myLinkedList.toString());
        myLinkedList.add("Charu");
        System.out.println("After Adding :"+myLinkedList.toString());

        myLinkedList.insert("Test",1);
        System.out.println("After Adding :"+myLinkedList.toString());
        myLinkedList.removeAt(1);
        System.out.println("After Removing :"+myLinkedList.toString());
    }
}
