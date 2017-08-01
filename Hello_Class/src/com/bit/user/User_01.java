package com.bit.user;

public class User_01 {

	// class의 시작점 method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");

		// 사용자 자료형으로 생성(초기화)한다.
		
		// UserDef 클래스를
		// userDef 객체(object)로 생성했다
		UserDef userDef = new UserDef();
		userDef.exec();
		
		String string = new String();
		String strNation = new String("대한민국");
		
		// UserInfo class를 사용하기 위해 생성(초기화)
		UserInfo userInfo = new UserInfo();
		
		// public으로 시작한 member 변수는 아무나 자유롭게 접근할 수 있다.
		System.out.println(userInfo.intAge); // 읽기
		System.out.println(userInfo.strName); // 읽기
		
		userInfo.strName = "이몽룡"; //할당, 저장
		System.out.println(userInfo.strName); // 읽기
		
		userInfo.setMyId("0001");
		userInfo.setMyPasswd("1111");
		
		System.out.println(userInfo.getMyId());
		System.out.println(userInfo.getMyPasswd());
		
	}
}















