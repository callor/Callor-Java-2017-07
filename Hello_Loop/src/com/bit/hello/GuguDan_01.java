package com.bit.hello;

public class GuguDan_01 {

	public static void main(String[] args) {
		for(int j = 2; j < 10 ; j++) {
			System.out.println(j + "단 구구단");
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println(j + " x "  + i + " = " + ( j * i ));
			}
			System.out.println("---------------------------");
		}
	}

}
