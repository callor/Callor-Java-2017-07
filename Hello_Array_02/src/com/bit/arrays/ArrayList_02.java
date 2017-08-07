package com.bit.arrays;

import java.util.ArrayList;

public class ArrayList_02 {

	public static void main(String[] args) {

		ArrayList<UserDev> arrDev = new ArrayList<UserDev>();

		// 객체도 예약만하고 생성하지 않은상태 
		UserDev userDev ; // null : 아무것도 아닌, 알수 없는 값
		for(int i = 0 ; i < 10 ; i ++) {
			userDev = new UserDev();
			userDev.strName = Integer.toString(i) + "번째 학생";
			userDev.intAge = i + 10 ;
			arrDev.add(userDev);
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			UserDev u = arrDev.get(i);
			System.out.print(u.strName);
			System.out.println(u.intAge);
		}
		
		for(int i = 0 ; i < 10 ; i++) {

			String strName = arrDev.get(i).strName;
			int intAge = arrDev.get(i).intAge;
			
			System.out.print(strName);
			System.out.println(intAge);
		
		}
		
		// ArrayList.size()
		//	: 현재까지 추가된 배열의 개수를 알려주는 method 
		for( int i = 0 ; i < arrDev.size() ; i++) {
			System.out.print(arrDev.get(i).strName);
			System.out.println(arrDev.get(i).intAge);
		}
		
	}

}
































