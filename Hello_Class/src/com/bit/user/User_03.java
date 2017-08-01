package com.bit.user;

public class User_03 {
	
	
	
	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 200;
		
		int num3 = 200;
		int num4 = 300;
		
		int num5 = 400;
		int num6 = 200;
		
		int sum = 0 ;
		
		System.out.println("=== 원래 코드 ===");
		sum = num1 + num2;
		System.out.println(sum);
		
		sum = num2 + num3;
		System.out.println(sum);
		
		sum = num3 + num4 ;
		System.out.println(sum);
		
		sum = num4 + num5;
		System.out.println(sum);
		
		sum = num5 + num6 ;
		System.out.println(sum);
		
		System.out.println("--- method 이용 코드 ---");
		sumExec(num1, num2);
		sumExec(num2, num3);
		sumExec(num3, num4);
		sumExec(num4, num5);
		sumExec(num5, num6);
		
	}
	
	// num1, 과 num2는 매개변수라고 한다(argument)
	public static void sumExec(int num1 , int num2) {
		// sum : sumExec method의 지역변수
		int sum = num1 + num2;
		System.out.println(sum);
	}

}








