package com.yaten.poc;

import java.util.function.Predicate;
import java.lang.Integer;
public class CheckPalindrome {
// Check if the number is palindrome or not. Like --> 121, 16461
    public static void main(String... args){
        System.out.println(new CheckPalindrome().ifPalindrome.test(133));
    }

    Predicate<Integer> ifPalindrome=(num)->{
        String numStr=String.valueOf(num);
        int len=numStr.length();
        int counter=0;
        boolean isPalindrome=true;
        while(isPalindrome && counter<len){
            isPalindrome=(numStr.charAt(counter)==numStr.charAt(len-1-counter));
            counter++;
        }
        return isPalindrome;
    };
}
