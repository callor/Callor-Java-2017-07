package com.bit.arrays;

public class ArrayValue_02 {

	public static void main(String[] args) {

		int num = 39299349;
		
		// int 형 숫자를 문자열로 변환시키는 구문
		String strNum = Integer.toString(num);
		
		// 문자열을 숫자로 변환시키는 구문
		num = Integer.parseInt(strNum);
		// parseInt와 같은 기능
		num = Integer.valueOf(strNum);
		
		String s1 = "30"; // 30이라는 문자열
		String s2 = "A30"; 
		String s3 = "30A";
		String s4 = "30 ";
		
		num = Integer.parseInt(s1);
		num = Integer.parseInt(s2); // 앞 문자열 오류
		num = Integer.parseInt(s3); // 뒷 문자열 오류
		num = Integer.parseInt(s4); // 빈칸 오류
		
	}
}











