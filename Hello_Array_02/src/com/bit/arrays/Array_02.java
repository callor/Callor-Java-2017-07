package com.bit.arrays;

import java.util.ArrayList;

public class Array_02 {

	public static void main(String[] args) {

		// class를 객체(object, instance)를 생성
		UserDev userDev = new UserDev();
		
		// 10개의 배열을 선언
		UserDev[] arrDev = new UserDev[10];
		
		// 각각의 배열을 new를 이용해서 초기화 했다.
		for(int i = 0 ; i < arrDev.length; i++) {
			arrDev[i] = new UserDev();
		}
		
		
		// ArrayList
		//   java 지원하는 향상된 배열 관리 도구
		ArrayList<UserDev> arrayDev = new ArrayList<UserDev>();
		
		// ArrayList로 관리할 수 있는 배열은 모두  class 형태 이어야 한다.
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		ArrayList<String> arrString = new ArrayList<String>();
		ArrayList<Float> arrFloat = new ArrayList<Float>();
		
	}

}
















