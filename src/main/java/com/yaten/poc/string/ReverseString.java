package com.yaten.poc.string;

public class ReverseString {

	
	public String getReversedString(String str){
		String rvrsString = "";
		int lenght=str.length();
		if (lenght !=0){
			rvrsString=str.substring(lenght-1, lenght)+getReversedString(str.substring(0, lenght-1));
		}
		return rvrsString;
		
	}
	
	public static void main(String args[]){
	String rvrsString=	new ReverseString().getReversedString("Yatendra");
		System.out.println(rvrsString);
	}
}
