package com.bit.user;

public class UserInfo {

	// class 아래에 선언한 변수들
	// member 변수, 속성을 선언
	// public key : 아무나 접근하도록 허락한다.
	public String strName = "홍길동";
	public String strAddr = "광주광역시";
	public String strTel = "11112";
	public int intAge = 20;
	
	// private key : 허락받은 곳에서만 접근하도록
	// 현재 class 내부에서만 접근
	private String myId = "112233";
	private String myPasswd = "000000";
	
	// 값을 할당하기 위한 접근 method
	public void setMyId(String myId) {
		this.myId = myId;
	}
	
	// 값을 읽기 위한 접근 method
	public String getMyId() {
		return this.myId;
	}

	// 값을 할당하기 위한 접근 method
	public void setMyPasswd(String myPasswd) {
		this.myPasswd = myPasswd;
	}
	
	// 값을 읽기 위한 접근 method
	public String getMyPasswd() {
		return this.myPasswd;
	}
	
	
}













