package com.ameriprise.poc;

import java.util.function.Predicate;
import java.lang.Integer;
public class CheckPalindrome {
// Check if the number is palindrome or not.
    public static void main(String... args){

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

        System.out.println(ifPalindrome.test(133));
    }


}
