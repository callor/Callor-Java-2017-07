package com.bit.keyinput;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		
		String strKor = "";
		Scanner scan = new Scanner(System.in);
		int intKor = 0;
		
		while(true) {
			System.out.print("국어점수 >> ");
			strKor = scan.nextLine();
			
			try {
				// 오류가 발생된 구문
				intKor = Integer.parseInt(strKor);
//				System.out.println("Middle");
//				System.out.println(intKor);
				break;
			} catch (Exception e) {
				System.out.println("점수를 숫자로 바꾸는데 오류가 생겼습니다");
				System.out.println("다시 입력해 주세요");
				// TODO: handle exception
			}
//			System.out.println("END");
		}
		System.out.println("입력된 점수는 :" + intKor);
		
		
	}

}
