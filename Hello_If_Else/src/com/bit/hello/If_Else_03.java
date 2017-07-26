package com.bit.hello;

public class If_Else_03 {

	public static void main(String[] args) {

		// 어떤 임의의 수가 주어졌을때
		// 그 숫자가 어떤 범위에 들어가는가 알아보고 싶다.
		int intNum = 51223311; // 
		
		if(intNum > 1000) {
			System.out.println("1000보다 큽니다");
		}
		if(intNum > 2000 ){
			System.out.println("2000보다 큽니다");
		}
		if(intNum > 3000) {
			System.out.println("3000보다 큽니다");
		}
		
		if(intNum > 1000) {
			System.out.println("1000보다 큽니다");
		} else if(intNum > 2000 ){
			System.out.println("2000보다 큽니다");
		} else if(intNum > 3000) {
			System.out.println("3000보다 큽니다");
		}
		
		if(intNum > 3000) {
			System.out.println("3000보다 큽니다");
		} else if(intNum > 2000) {
			System.out.println("2000보다 큽니다");
		} else if(intNum > 1000) {
			System.out.println("1000보다 큽니다");
		}

	
	}
}











