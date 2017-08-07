package com.bit.arrays;

import java.util.ArrayList;

public class ArrayList_03 {

	public static void main(String[] args) {

		ArrayList<UserDev> arrDev = new ArrayList<UserDev>();
		
		for(int i = 0 ; i < 5 ; i++) {
			UserDev u = new UserDev();
			arrDev.add(u);
		}
		
		for(int i = 0 ; i < arrDev.size(); i++) {
			
			System.out.print(arrDev.get(i).strName);
			System.out.print(arrDev.get(i).strTel);
			System.out.println(arrDev.get(i).intAge);
			
			// i 번째에 저장된 UserDev의 객체가 어떤 형태인가 알려준다
			System.out.println(arrDev.get(i));
			
		}
		arrDev.get(3).strName = "홍길동";
		
		Integer num = 300;
		String strNum = num.toString();
		
		int num1 = 300;
		String strNum1 = Integer.toString(num1);
		
		
	}

}




















