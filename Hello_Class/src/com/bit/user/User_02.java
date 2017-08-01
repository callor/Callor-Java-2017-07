package com.bit.user;

public class User_02 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;

		int sum = 0 ;
		
		sum = num1 + num2;
		System.out.println(sum);
		
		/**
		 * Method는
		 * 1. 기능만을 호출하는 method
		 * 2. 기능을 수행한 후 결과를 알려주는 method
		 * 3. 내가 먼저 어떤 값을 주고,
		 *    그 값에 대한 기능만을 호출하는 method
		 * 4. 내가 먼저 어떤 값을 주고,
		 *    그 값에 대한 기능을 수행하고 결과를 알려주는 method
		 */
		
		// 1. 기능만을 호출
		printMethod();
		
		// 4. 값을주고 결과를 알려주는 method
		int sum1 = sumMethod(200,300);
		
		System.out.println(sum);
		System.out.println(sum1);
		
	}
	
	static void printMethod() {
		System.out.println("Print 연습");
	}
	
	
	static int sumMethod(int num1, int num2) {
		int sum =  num1 + num2;
		return sum;
	}

}
