package com.ameriprise.poc.java8;

import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
public class ArmStrongNumber {

    private static boolean isArmStrongNumber(int number){
        char[] numChar=Integer.toString(number).toCharArray();
        int sum=0;
        int i=0;
        while(i<numChar.length){
            int num=Character.getNumericValue(numChar[i]);
            sum+=num*num*num;
            i++;
        }
        if(number==sum)
            return true;
        return false;
    }
    public static List<Integer> generate(int series) {
        return Stream.iterate(1, i -> ++i)
                .filter(i -> i == Stream.of(String.valueOf(i).split(""))
                        .map(Integer::valueOf)
                        .map(n -> (n*n*n))
                        .mapToInt(n -> n)
                        .sum())
                .limit(series)
                .collect(toList());
    }
    public static void main(String... args){
        System.out.println(isArmStrongNumber(153));
       /* Predicate<Integer> isArmStrongNumberFunction=(number)->{
            int sum=0;
            int i=0;
            //Approcah 1
            String[] array=String.valueOf(number).split("");
            while(i<array.length){
                int num=Integer.valueOf(array[i]);
                sum+=num*num*num;
                i++;
            }

            //Approach 2
            char[] numChar=Integer.toString(number).toCharArray();

            while(i<numChar.length){
                int num=Character.getNumericValue(numChar[i]);
                sum+=num*num*num;
                i++;
            }
            if(number==sum)
                return true;
            return false;
        };
        System.out.println(isArmStrongNumberFunction.test(371));*/
        System.out.println(generate(5).toString());
    }
}
