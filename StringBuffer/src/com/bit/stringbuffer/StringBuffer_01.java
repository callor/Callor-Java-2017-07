package com.bit.stringbuffer;

public class StringBuffer_01 {

	public static void main(String[] args) {

		// 자료형
		int intNum = 0;
		intNum = 100;
		intNum = 200;
		intNum = 300;
		
		// wrapper class
		Integer intNum1 = 0 ;
		intNum1 = 100;
		intNum1 = 200;
		intNum1 = 300;
		
		// wrapper class
		String strName = "홍길동";
		strName = "이몽룡";
		strName = "장보고";
		strName = "장영실";

		StringBuffer  strBuffer = new StringBuffer();
		String strName1 = new String("홍길동");
		
		StringBuffer strBuffer1 = new StringBuffer("대한민국");
		strBuffer1.append("Korea") ;// 버퍼에 문자열 추가

		System.out.println(strBuffer1);
		System.out.println(strBuffer1.reverse());
		
		
	}

}












