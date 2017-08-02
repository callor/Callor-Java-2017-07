package com.bit.arrays;

public class ArrayValue_01 {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		
		for(int i = 0 ; i < 100 ; i++) {
			intNum[i] = i ;
		}
		
		intNum[0] = 0;
		intNum[1] = 1;
		intNum[2] = 2;
		intNum[3] = 3;
		intNum[4] = 4;
		intNum[5] = 5;
		
		int sum = 0 ;
		for(int i = 0 ; i < 100 ; i++) {
			sum += intNum[i] ;
		}
		
		// sum : 0 부터 99까지 더한 값
		System.out.println(sum);
		
		
	}

}
