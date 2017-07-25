package com.bit.hello.i;

public class If_Else_02 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중 짝수만의 곱
		int intSum = 1;
		for(int i = 1; i <=10;i++) {
			if(i % 2 == 0) { 
//				System.out.println(intSum);
//				System.out.println(i);
				intSum *= i ;	
			}
		}
		System.out.println("1부터 10까지 숫자중 짝수의 곱:"+intSum);
	}
}
