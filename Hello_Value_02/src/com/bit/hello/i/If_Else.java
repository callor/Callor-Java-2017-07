package com.bit.hello.i;

public class If_Else {

	public static void main(String[] args) {

		int intNum1 = 0;

		// 1부터 10까지 숫자중 짝수, 홀수 구분
		for(int i = 0 ; i <= 10 ; i++) {
			int temp = (i/2) * 2;
			if(temp == i) {
				System.out.println(i + "는 짝수");
			} else {
				System.out.println(i + "는 홀수");
			}
		}
	
		// 1부터 10까지 숫자중 짝수, 홀수 구분
		// 나머지 연산자를 사용해서 구분
		for(int i = 0 ; i <= 10;i++) {
			// 나머지 연산자
			if(i % 2 == 0) {
				System.out.println(i + "는 짝수");
			} else {
				System.out.println(i + "는 홀수");
			}
		}

	}

}
