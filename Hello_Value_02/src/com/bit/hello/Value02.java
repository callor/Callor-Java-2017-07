package com.bit.hello;

public class Value02 {

	public static void main(String[] args) {

		int intNum1 = 10;
		int intNum2 = 20;
		int intSum = 0 ;

		int sum = intNum1 + intNum2 ;

		intSum = intNum1 + intNum2 ;
		System.out.println(intSum); // 10 + 20 결과
		
		intSum = 0; // 원래 어떤 값이 있던지 관계없이 0으로 할당
					// 기존 값을 지우는 clear
		System.out.println(intSum);  // 0 이 출력
		
		int intNum3 = 0;
		
		intNum3 = intNum3 + 1; // 1, intNum3 변수값을 1증가
		intNum3 = intNum3 + 1;  // 2 
		intNum3 = intNum3 + 10; // 12, intNum3 변수값을 10증가
		
		intNum3 = intNum3 - 1; // 1감소
		intNum3 = intNum3 - 1; // 1감소
		
	}

}
