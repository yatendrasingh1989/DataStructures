package com.ameriprise.poc.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachexample
{
    public static void main(String[] args){
            List<String> list= new ArrayList<String>();
            for(int i=0;i<10;i++)
                list.add("Yatendra"+i);
            list.forEach(item -> System.out.println(item));
            forEachConditional(list);
        }

        private static void forEachConditional(List list){
        list.forEach(item->{
            if("Yatendra5".equals(item))
                System.out.print("************"+item+"************");
        });
        }
    }

