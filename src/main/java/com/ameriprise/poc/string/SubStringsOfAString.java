package com.ameriprise.poc.string;

import java.util.List;
import java.util.ArrayList;
public class SubStringsOfAString {
    /*
    This was asked in Nagarro for two times.
     */

    public static String[] getSubStrings(String str){
		List<String> listOfSubstrings=new ArrayList<>();
       for (int i = 0; i < str.length(); i++) {
        for (int j = i+1; j <= str.length(); j++) {
            String subStr=str.substring(i,j);
            System.out.println(subStr);
			listOfSubstrings.add(subStr);
        }
    }
		String[] arrayOfStrings= new String[listOfSubstrings.size()];
        arrayOfStrings= listOfSubstrings.toArray(arrayOfStrings);
		return arrayOfStrings;
    }

    public static void main(String... args){
    getSubStrings("abc");
    }
}
