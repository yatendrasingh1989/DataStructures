package com.ameriprise.poc;

public class MethodHiddingTest extends MethodHidding{

    public static void staticMethod(){
        System.out.println("From MethodHiddingTest");
    }

    public static void main(String... args){
        MethodHidding mh= new MethodHidding();
        MethodHidding mht= new MethodHiddingTest();
        mh.staticMethod();
        mht.staticMethod();// JVM will check in parent class, as this is static method, so will not check for overridden method.
        //This is called method hiding.
    }
}
