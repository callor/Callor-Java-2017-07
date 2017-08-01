package com.bit.user;

public class User_01 {

	public static void main(String[] args) {

		// UserValue로 선언한 사용자 정의 자료형(class)를 사용준비
		UserValue userValue = new UserValue();
		
		// UserValue라는 사용자정의 Class의 myValue() method를 호출
		userValue.myValue();
		
		// myAge()라는 method를 호출
		userValue.myAge();
		
		// intAge 라는 member(맴버 변수, 속성:property)에 
		// 20을 할당
		userValue.intAge = 20;
		
		// myAge() 호출
		userValue.myAge();
		userValue.myAge(30);
		
		// return 값이 있는 method 호출해서
		// 그 실행 결과값을 되돌려 받는다.
		int myAge = userValue.getAge();
		System.out.println(myAge);
	
	}
}
