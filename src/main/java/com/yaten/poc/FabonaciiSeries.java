package com.yaten.poc;

public class FabonaciiSeries {
	static int sum;
	static int crrrnt=1;
	static int prv=1;
	 int getFabonaciiSeries(int uptoNumber){
		
		if(uptoNumber==1||uptoNumber==2){
		return 1;	
		}
			sum=crrrnt+prv;
			prv=crrrnt;
			crrrnt=sum;
			return sum;
			}
	
public static void main(String args[]){
	for (int i=1;i<=10;i++){
		System.out.println(new FabonaciiSeries().getFabonaciiSeries(i));
	}
	
}
}
