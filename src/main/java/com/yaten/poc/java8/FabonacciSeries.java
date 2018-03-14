package com.yaten.poc.java8;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.*;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.List;
public class FabonacciSeries {


    public static void main(String args[]){
        IntBinaryOperator addition=(a,b)->a+b;
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        while(c<=100){
            c=addition.applyAsInt(a,b);
            if(c>=100)
                break;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
