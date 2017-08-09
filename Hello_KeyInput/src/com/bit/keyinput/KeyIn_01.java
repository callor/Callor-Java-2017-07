package com.bit.keyinput;

import java.util.Scanner;

public class KeyIn_01 {

	public static void main(String[] args) {

		System.out.println("대한민국");
		
		Scanner scan = new Scanner(System.in) ;
		
		// 키보드로 부터 무엇가 입력을 하기를 기다리는데,
		// 영문, 숫자를 문자열 형태로 입력하기를 기다린다.
		// 가장 마지막에 Enter를 입력할때까지 마냥 기다림
		String strInput = scan.nextLine(); // Blocking 상태, 기다리는 상태
		
		System.out.print("키보드 입력값:");
		System.out.println(strInput);
		
		
	}

}







