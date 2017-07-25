package com.bit.hello;

public class Value03 {

	public static void main(String[] args) {
		int intNum1 = 0;
		
		intNum1 = intNum1 + 1; // 전통적인 프로그램
		intNum1 += 1; // C,Java 3세대 이상 프로그램언어
		intNum1 += 10;
		
		intNum1 ++; // 1씩 증가시키고자 할때
		++intNum1 ;
		
		intNum1 -= 1; 
		intNum1 -= 10;
		
		intNum1 --;
		-- intNum1 ;
		
		intNum1 *= 3; // 원래 있던 값에 3을 곱해서 다시 원래 위치에 저장
		intNum1 /= 3; // 원래 있던 값을 3으로 나누어서 다시 원래 위치에 저장
		
	}
	
}
