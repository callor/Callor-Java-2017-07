package com.bit.arrays;

public class ArrayValue_03 {

	public static void main(String[] args) {

		// 변수를 이용해서 최대값을 지정해주면
		// 최대값이 변화 되어도 코드 수정 부분이 최소화 된다.
		int max = 1000;
		
		int[] intNum = new int[max];
		
		for(int i = 0 ; i < max ; i++) {
			intNum[i] = i + 1 ;
		}
		
		int sum = 0 ;
		for(int i = 0 ; i < max ; i++) {
			sum += intNum[i];
		}
		System.out.println(sum);
		
		
	}

}
