package com.bit.integer;

public class Integer_01 {

	public static void main(String[] args) {

		// int 정수형 변수
		int intNum = 0 ;
		
		// User Define 형 변수
		Integer intNum1 = 0 ;
		intNum1 = 100;
		// 숫자를 문자열로 변환시킨다.
		String strNum1 = intNum1.toString();
		System.out.println(strNum1);
		
		Integer num1 = 30;
		Integer num2 = 40;
		String strNum2 = (num1.toString() + num2.toString());
		
		System.out.println(Integer.toBinaryString(num1));
		System.out.println("값=" + 50);

		float f1 = 30.0f;
		Float f = 30.0f;
		
		boolean b1 = false ;
		Boolean b = true;
		
	}

}
