package com.ameriprise.poc.java8.LambdaExpression;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class ComparatorLabmba{

    public static void main(String args[]){

     //Annonymous Class representation.
        Comparator<String> comparator= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };

        //Lambda Representation
        Comparator<String> comparatorLambda=(String o1, String o2)-> Integer.compare(o1.length(),o2.length());

        List<String> arrayList= new ArrayList<>();
        arrayList.add("***");
        arrayList.add("*");
        arrayList.add("**");

        Collections.sort(arrayList,comparatorLambda);
        System.out.println(arrayList.toString());

    }
}