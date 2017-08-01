package com.bit.user;

public class Print_01 {

	public static void main(String[] args) {

		int intNum = 33;
		
		System.out.println("나의 숫자");
		System.out.println(intNum);
		
		System.out.print("나의 숫자");
		System.out.println(intNum);
		
		System.out.println("나의 숫자" + intNum);
		
		int num1 = 300;
		int num2 = 400;
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		
		System.out.print(num1);
		System.out.print("+");
		System.out.print(num2);
		System.out.print("=");
		System.out.println(num1+num2);
		
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);

		
	}

}
