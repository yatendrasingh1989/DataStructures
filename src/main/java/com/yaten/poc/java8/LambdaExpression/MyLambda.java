package com.yaten.poc.java8.LambdaExpression;

public class MyLambda {

    public static void main(String[] args){
   /*Weds weds=(groom,bride)->{
       return groom.toUpperCase()+" WEDS "+bride.toUpperCase();
   };

   System.out.println(weds.whoWedsWhom("Yatendra","Harneet"));*/

    Runnable runnableLambda=()->{
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    };

    Thread thrd= new Thread(runnableLambda);
    thrd.start();

    }
}
