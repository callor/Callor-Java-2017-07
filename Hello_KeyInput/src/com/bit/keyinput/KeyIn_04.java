package com.bit.keyinput;

import java.util.Scanner;

public class KeyIn_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {
			
			System.out.print("첫번째 숫자>> ");
			String strNum1 = scan.nextLine();
			
			if(strNum1.equals("--END")) {
				break;
			}
			
			System.out.print("두번째 숫자>> ");
			String strNum2 = scan.nextLine();
			
			int sum = Integer.parseInt(strNum1) + Integer.parseInt(strNum2);
			
			System.out.println("두수의 덧셈=" + sum );

		}
		System.out.println("종료====");
	}

}









