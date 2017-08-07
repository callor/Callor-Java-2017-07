package com.bit.arrays;

public class Array_01 {

	public static void main(String[] args) {

		// 5개의 arrNum 배열
		int[] arrNum = new int[5];
		
		// 값을 할당
		arrNum[0] = 100;
		arrNum[1] = 200;
		System.out.println(arrNum[0]);
		System.out.println(arrNum[1]);
		
		// 10개의 arrNum로 변경
		// 원래 할당 모든 값이 사라지는 것과 같다.
		arrNum = new int[10];
		
		System.out.println(arrNum[0]);
		System.out.println(arrNum[1]);
		
	}
}
