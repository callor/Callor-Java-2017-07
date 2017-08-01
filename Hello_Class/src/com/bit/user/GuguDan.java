package com.bit.user;

public class GuguDan {

	public static void main(String[] args) {

		gugudan(3);
		gugudan(5);
		gugudan(4);
		gugudan(2);
		gugudan(7);
		gugudan(9);
		
		for(int i = 2; i < 10; i++) {
			gugudan(i);
		}
		
	}
	
	// method = 함수, function, subroutine , procedure
	static void gugudan(int dan) {
		System.out.println(dan + " 구구단");
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(dan + "x" + i + "=" +(dan*i) );
		}
	}

}
