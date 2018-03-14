package com.yaten.poc;

public class ArmstrongNumber {
	
	public boolean checkArmStrong(int number){
		String num= String.valueOf(number);
		int firstdigit=Integer.valueOf(""+num.charAt(0));
		int secndDigit=Integer.valueOf(""+num.charAt(1));
		int thrdDigit=Integer.valueOf(""+num.charAt(2));
		if(number==(getCube(firstdigit)+getCube(secndDigit)+getCube(thrdDigit))){
			return true;
		}
		return false;
		
	}

	private int getCube(int digit) {
		
		return digit*digit*digit;
	}

	public static void main(String args[]){
		//System.out.println(new ArmstrongNumber().checkArmStrong(371));
		System.out.println(isArmStrong(371));
	}
	private static boolean isArmStrong(int number) { 
		int result = 0;
		 int orig = number; 
		 while(number != 0){
		 int remainder = number%10; 
		 result = result + remainder*remainder*remainder; 
		 number = number/10; 
		 }
		 //number is Armstrong return true 
		 if(orig == result){
		 return true; 
		 } 
		 return false; 
		 } 
		 
}
