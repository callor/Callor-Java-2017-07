package com.bit.arrays.methods;

import java.util.ArrayList;

public class ArrList_01 {

	public static void main(String[] args) {

		ArrayList<UserValue> v = new ArrayList<UserValue>();
		
		for(int i = 0 ; i < 5 ; i++) {
			
//			UserValue u = new UserValue();
//			v.add(u);
			// ArrayList 추가하기 위해 객체를 생성하는 가장 간단
			v.add(new UserValue());
			
		}
		
		for( int i = 0 ; i < v.size() ; i++) {
			UserValue u = v.get(i);
			String strName = u.getStrName();
			String strTel = u.getStrTel();
			int intAge = u.getIntAge();
		}

		for(int i = 0 ; i < v.size(); i++) {
			String strName = v.get(i).getStrName();
			String strTel = v.get(i).getStrTel();
			int intAge = v.get(i).getIntAge();
		}
		
		v.get(3).setStrName("홍길동");
		v.get(3).setIntAge(12);
		v.get(3).setStrTel("112");
		
		
	}

}













