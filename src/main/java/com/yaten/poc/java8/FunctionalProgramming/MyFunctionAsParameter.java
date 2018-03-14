package com.yaten.poc.java8.FunctionalProgramming;

import java.util.function.Function;


public class MyFunctionAsParameter {
    public static void main(String[] args){

        Function<String,String> toUpperCase=(s)->{
            return s.toUpperCase();
        };

        System.out.println(methodWithFunctionParam("Yatendra",toUpperCase));
    }

    public static String methodWithFunctionParam(String str,Function<String,String> fn){
        return fn.apply(str);
    }
}
