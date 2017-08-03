package com.bit.exec;

public class MainClass_01 {

	public static void main(String[] args) {

		int num1 = 0;
		int sum = 0;
		sum = add(100,200);
		
		int[] arrNum = makeArray();
		String[] arrS = makeStrings();
		
	
	
	}
	
	static int add(int num1, int num2) {
		return num1 + num2 ;
	}
	
	static int[] makeArray() {
		int[] num1 = new int[10];
		return num1;
	}
	
	static String[] makeStrings() {
		String[] s = new String[10];
		return s;
	}

}
