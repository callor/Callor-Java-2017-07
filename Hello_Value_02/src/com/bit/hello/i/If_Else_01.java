package com.bit.hello.i;

public class If_Else_01 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에서 짝수만의 합
		int intSum = 0 ;
		
		for(int i = 0 ; i <=100;i++) {
			if(i % 2 == 0 ) {
				intSum += i;
			} else {
				
			}
		}
		System.out.println("1 부터 100까지 숫자중 짝수 만의 합" + intSum);
	
		// 1부터 100까지 숫자 중에서 홀수만의 합
		
		intSum = 0;
		for(int i = 0 ; i <=100;i++) {
			// i 값을 2로 나누었을때 나머지가 0이 아닌경우
			if(i % 2 != 0 ) {
				intSum += i;
			}
		}
		System.out.println("1 부터 100까지 숫자중 홀수 만의 합" + intSum);
		
	}

}





