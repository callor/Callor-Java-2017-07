package com.bit.arrays;

public class ArrayValue_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intNum = new int[100];
		
		for(int i = 0 ; i < 100 ; i++) {
			intNum[i] = i + 1;
		}
		
		intNum[0] = 1;
		intNum[1] = 2;
		intNum[2] = 3;
		intNum[3] = 4;
		intNum[4] = 5;
		intNum[5] = 6;
		
		int sum = 0 ;
		for(int i = 0 ; i < 100 ; i++) {
			sum += intNum[i];
		}
		// 1부터 100까지 더한 결과
		System.out.println(sum);
		
	}

}



