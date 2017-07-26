package com.bit.hello;

public class If_Else_01 {

	public static void main(String[] args) {

		/*
		 * if 문은 조건에 따라서 프로그램의 흐름을 바꾸는 명령
		 * 조건 : 
		 * 		1. 참. 거짓
		 * 		2. 크기 비교(비교연산자)
		 * 		3. 관계연산자
		 */
		
		boolean bCheck = true;
		
		// bCheck 변수에 저장된 값이 true 이면
		if(bCheck) {
			System.out.println("bCheck 는 True 입니다");
		} else {
			System.out.println("bCheck는 false 입니다");
		}

		bCheck = (3 == 3); // true
		if(bCheck) {
			System.out.println("bCheck 는 True 입니다");
		} else {
			System.out.println("bCheck는 false 입니다");
		}

		bCheck = (3 > 3); // false
		if(bCheck) {
			System.out.println("bCheck 는 True 입니다");
		} else {
			System.out.println("bCheck는 false 입니다");
		}
		
		bCheck = (3 >= 3); // true
		bCheck = (3 < 3 ); //false
		bCheck = (3 <= 3 ); //ture
		
		bCheck = (3 != 3); // 두 값이 다른가 false
		if(bCheck) {
			System.out.println("bCheck 는 True 입니다");
		} else {
			System.out.println("bCheck는 false 입니다");
		}
		
		// 똑같은 문장
		if(3 != 3) {
			System.out.println("true 입니다");
		} else {
			System.out.println("false 입니다");
		}
		
		int Num1 = 3;
		int Num2 = 3;
		bCheck = (Num1 != Num2);
		if(bCheck) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if(Num1 != Num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}







