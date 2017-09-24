package com.ameriprise.poc.java8.FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class MyFunction {

    public static void main(String[] args){

        //<String,String,String> needed because we are using concatFunction reference to hold concatStrings1 & concatStrings2
        //otherwise we can use it as  BiFunction concatFunction=
        BiFunction<String,String,String> concatFunction=(string1,string2)->{
            return string1+"....."+string2;
        };

        System.out.println(concatFunction.apply("Yatendra","Singh"));
        concatFunction=MyFunction::concatStrings1;
        System.out.println(concatFunction.apply("Harneet","Kaur"));
        MyFunction obj=new MyFunction();
        concatFunction=obj::concatStrings2;
        System.out.println(concatFunction.apply("Yattu","Dada"));

        IntBinaryOperator intAddition=(a,b)->{
            return a+b;
        };
        System.out.println(intAddition.applyAsInt(5,4));
    }








    private static String concatStrings1(String s1,String s2){
        return s1+"..."+s2;
    }
    private String concatStrings2(String s1,String s2){
        return s1+"..."+s2;
    }
}
