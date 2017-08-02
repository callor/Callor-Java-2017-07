package com.bit.arrays;

public class ArrayValue_04 {

	public static void main(String[] args) {

		int max = 1000;
		int[] intNum = new int[max];
		
		System.out.println( intNum.length );
		
		// 배열의 처음(0)부터 최대값인 length까지 반복
		for(int i = 0 ; i < intNum.length ; i ++) {
			intNum[i] = i + 1;
		}
		
		int sum = 0 ;
		for(int i = 0 ; i < intNum.length ; i++) {
			sum += intNum[i] ;
		}
		
		System.out.println(sum);
		
		
	}

}
