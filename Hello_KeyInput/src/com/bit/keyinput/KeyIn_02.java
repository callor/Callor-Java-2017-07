package com.bit.keyinput;

import java.util.Scanner;

public class KeyIn_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// prompt : 무엇을 할것인가 미리 알려주는 작은 도움말
		System.out.print("영문자 KOREA를 입력하세요> ");
		String strInput = scan.nextLine();
		System.out.println(strInput);
		
		System.out.print("임의 숫자를 입력하세요 >> ");
		String strNum = scan.nextLine();
		System.out.println(strNum);
	
	}

}
















