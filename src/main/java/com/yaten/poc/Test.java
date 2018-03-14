package com.yaten.poc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public int getCloset(){
		int[] arry ={2,5,-3,-2};
		int smallest = 0;
		for (int i=0;i<arry.length;i++){
			if((arry[i]<=arry[i+1])&&(smallest!=0 && smallest<arry[i])){
				smallest=arry[i];
			}else if (smallest!=0 && smallest<arry[i+1])
				smallest=arry[i+1];	
		}
		return smallest;
	}
	
	 public static int[] retainPositiveNumbers(int[] a) {
		 int[]b = new int[a.length] ;
		 int count=0;
		 for(int i=0;i<a.length;i++){
			 if(i>=0){
				b[count]=a[i];
				count++;
			 }
		 }
		 Arrays.sort(b);
		return b;
	       
	    } 
	 
	 public static int countWords(String s) {
		 int word=0;
		 for(int i=0;i<s.length();i++){
			 if(" ".equals(s.charAt(i))){
				 word++;
			 }
		 }
		return word;
	        
	    }
	 
	 
	 public static Set<CharSequence> printAllPalindromes(String input) {
		    if (input.length() <= 2) {
		        return Collections.emptySet();
		    }
		    Set<CharSequence> out = new HashSet<CharSequence>();
		    int length = input.length();
		    for (int i = 1; i < length - 1; i++) {
		        for (int j = i - 1, k = i + 1; j >= 0 && k < length; j--, k++) {
		            if (input.charAt(j) == input.charAt(k)) {
		                out.add(input.subSequence(j, k + 1));
		            } else {
		                break;
		            }
		        }
		    }
		    return out;
		}
	 public static void printPalindromes(String s) {
		    if (s == null || s.length() < 3)
		        return;

		    System.out.println("Odd Length Palindromes:");
		    // Odd Length Palindromes
		    for (int i=1; i<s.length()-1; i++) {
		        for (int j=i-1,k=i+1; j>=0 && k<s.length(); j--,k++) {
		            if (s.charAt(j) == s.charAt(k)) {
		                if (k-j+1 >= 3)
		                    System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
		            }
		            else
		                break;
		        }
		    }

		    System.out.println("\nEven Length Palindromes:");
		    // Even Length Palindromes
		    for (int i=1; i<s.length()-1; i++) {
		        for (int j=i,k=i+1; j>=0 && k<s.length(); j--,k++) {
		            if (s.charAt(j) == s.charAt(k)) {
		                if (k-j+1 >= 3)
		                    System.out.println(s.substring(j, k+1) + " with index " +j+ " and "+k);
		            }
		            else
		                break;
		        }
		    }
		}

	public static void main(String args[]){
		int[] a={2,4,21,-3,-21};
		//System.out.println(Test.printPalindromes("alslfaabbaakjshdala"));
		Test.printPalindromes("alslfaabbaakjshdala");
		
	}
}
