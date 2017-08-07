package com.bit.arrays;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {

		// arrDev의 개수 = 0 인상태
		ArrayList<UserDev> arrDev = new ArrayList<UserDev>();
		
		// class 객체로 선언해서 사용할 준비가 된 상태
		UserDev userDev = new UserDev();
		
		userDev.strName = "홍길동";
		userDev.strTel = "112";
		userDev.intAge = 12;
		arrDev.add(userDev); // userDev 배열 개수 = 1 인 상태

		// 새로운 장소에 userDev를 하나 만들어라
		userDev = new UserDev();
		userDev.strName = "이몽룡";
		userDev.strTel = "113";
		userDev.intAge = 22;
		arrDev.add(userDev); // userDev 배열 개수 = 2 인 상태

		userDev = new UserDev();
		userDev.strName = "장보고";
		userDev.strTel = "114";
		userDev.intAge = 33;
		arrDev.add(userDev); // userDev 배열 개수 = 3 인 상태

		userDev = new UserDev();
		userDev.strName = "장영실";
		userDev.strTel = "115";
		userDev.intAge = 44;
		arrDev.add(userDev); // userDev 배열 개수 = 4 인 상태

		userDev = new UserDev();
		userDev.strName = "임꺽정";
		userDev.strTel = "116";
		userDev.intAge = 55;
		arrDev.add(userDev); // userDev 배열 개수 = 5 인 상태
		
		System.out.println(arrDev.get(0).strName) ;
		System.out.println(arrDev.get(1).strName) ;
		System.out.println(arrDev.get(2).strName) ;
		System.out.println(arrDev.get(3).strName) ;
		System.out.println(arrDev.get(4).strName) ;
		
//		System.out.println(arrDev.get(5).strName) ;
		
		
		
	}

}




