package com.bit.keyinput;

import java.util.Scanner;

public class KeyIn_03 {

	public static void main(String[] args) {

		int intNum1 = 30;
		int intNum2 = 30;
		
		int sum = intNum1 + intNum2;
		System.out.println(sum);
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("1번 숫자를 입력하세요 >> ");
			String strNum1 = scan.nextLine();
			intNum1 = Integer.parseInt(strNum1);
			
			System.out.print("2번 숫자를 입력하세요 >> ");
			String strNum2 = scan.nextLine();
			intNum2 = Integer.parseInt(strNum2);
			
			sum = intNum1 + intNum2 ;
			System.out.print("두 수의 덧셈 = ");
			System.out.println(sum);
		}
	}

}







