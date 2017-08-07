package com.bit.arrays.methods;

import java.util.ArrayList;

public class ArrayList_02 {

	public static void main(String[] args) {

		ArrayList<UserValue> vList = new ArrayList<UserValue>();
		
		for(int i = 0 ; i < 10 ; i ++) {
			vList.add(new UserValue());
		}
		
		for( UserValue uItem : vList ) {
			String strName = uItem.getStrName();
			String strTel = uItem.getStrTel();
			int intAge = uItem.getIntAge();
		}
		
		int[] num = new int[] {1,23,3,12,3,12,3,123};
		
		for(int n : num) {
			System.out.println(n);
		}
		
	}

}












