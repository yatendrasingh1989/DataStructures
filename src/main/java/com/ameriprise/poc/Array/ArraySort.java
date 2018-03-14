package com.ameriprise.poc.Array;

public class ArraySort {

    //Sort an array without using APIs.

    private static int[] getSortedArray(int[] input){
		int size=input.length;
		int[] sortedArray= new int[size];
		for(int i=0;i<size;i++){
			int valAtIndex=input[i];
			//insert first value.
			if(i==0)
				sortedArray[i]=valAtIndex;
			else{
			    //compare the existing values
                boolean isInserted=false;
				for(int j=0;j<=i;j++){

					if(sortedArray[j]>valAtIndex){
						for(int k=i;k>j;k--){
							sortedArray[k]=sortedArray[k-1];
							isInserted=true;
						}
						sortedArray[j]=valAtIndex;
                        break;
					}
				}
                if(!isInserted)
                    sortedArray[i]=valAtIndex;
			}
		}
        return sortedArray;
    }

    public static void main(String... args){
        int[] input= {1,3,5,2,7,4,0};
        int[] sortedArray=getSortedArray(input);
        System.out.println(sortedArray);
    }
}
