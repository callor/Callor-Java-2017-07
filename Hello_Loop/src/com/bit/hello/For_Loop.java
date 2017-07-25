package com.bit.hello;

public class For_Loop {

	public static void main(String[] args) {

		// 시작값이 있고, 
		// 				유지 조건이 있고
		//						어떤 식(증가)이 있다.
		for(int i = 0 ; i < 10 ; i++  ) {
			// i++ 이 없으면 무한루프
		}
		
		int j = 0 ;
		// 단지 조건식만 있다.
		while(j < 10) {
			j++;
		}
		
		// 1부터 1000까지의 숫자중에서
		// 짝수의 합이 1000 미만이 되려면
		// 얼마까지 증가를 해야 할가
		int num = 0 ;
		int sum = 0 ;
		while(sum < 1000) {
			num ++ ;
			if(num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("증가값:" + num);
		
		int sum1 = 0 ;
		int i = 0;
		for(i = 0 ; i < 1000 ; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}
			if(sum1 >= 1000) {
				break;
			}
		}
		System.out.println("증가값:" + i);
		
	}
}
