package com.bit.exec;

public class MainClass {

	public static void main(String[] args) {

		int intNum = 0 ; // 변수의 선언 + 초기화
		String strName = "홍길동";
		
		int intNum1 ;
		intNum1 = 0; // 값을 할당
		
		// 변수는 초기화 하거나, 할당하지 않으면 읽기가 불가능하다
		System.out.println(intNum1); //
		
		int[] arrNum = new int[5]; // 배열의 선언
		// 배열은 선언만 하여도 자체 초기화 기능이 있어서 읽기가 가능하다
		System.out.println(arrNum[0]); 
		
		String[] arrName = new String[5]; // 
		
		// class를 객체(object, instance)로 선언
		UserDef userDef = new UserDef();
		System.out.println(userDef.intAge);
		userDef.intAge = 20;
		
		// 사용자 정의 자료형은 배열로 만들었을때
		// 자동으로 초기화 하지 않는다.
		UserDef[] arrDef = new UserDef[5];
		arrDef[0] = new UserDef();
		arrDef[1] = new UserDef();
		arrDef[2] = new UserDef();
		arrDef[3] = new UserDef();
		arrDef[4] = new UserDef();
		
		// 객체 배열은 초기화 하기전에 사용할 수 없다.
		System.out.println(arrDef[0].intAge);
		arrDef[1].intAge = 20;
		
	}

}






