package com.bit.user;

// 사용자(User) 정의(Define) 자료형(Class)을 하나 선언
public class UserValue {

	public int intAge = 0 ;
	
	// 기능만을 가진 method
	public void myValue() {
		System.out.println("나는 사용자 정의 자료입니다");
	}
	
	// 기능만을 가진 method
	public void myAge() {
		System.out.println("나는 " + intAge + " 입니다");
	}
	
	// 값을 받고, 기능이 있는 method
	// 호출할때 myAge(30) 이렇게 호출하면
	// 30이라는 값은 intAge라는 바구니로 받는다.
	// 바구니를 argument, parameter, 매개변수 라고 한다.
	public void myAge(int intAge) {
		// 임의로 자료의 정확도를 사전검사하고
		if(intAge < 0) {
			System.out.println("0 보다 작은값은 안됩니다");
		} else if (intAge > 50) {
			System.out.println("50보다 큰값도 안됩니다");
		} else {
			// 범위에 합당하면 this.intAge를 수정하도록
			this.intAge = intAge;
			System.out.println("나는" + intAge +"입니다");
		}
	}
	
	public int getAge() {
		return this.intAge;
	}
	
}














