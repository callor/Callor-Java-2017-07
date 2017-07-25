// package는 source 파일을 정리하 위한 폴더 개념
// statement는 반드시 끝에 세미콜론(;)으로 끝나야 한다
package com.bit.hello;

// public class : keyword
// Hello : 이름 = 파일의 이름(Hello.java)
public class Hello {

	// public static void : keyword
	// main(,,,) : 특별한 명령어 모음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 명령어 모음
		// 이문장 자체가 하는일이 이미 정해져
		// 단, 키워드는 조합하는 방법에 따라 기능이 다르다.
		// Sys...prinln() : 괄호안의 내용의 결과를 console 에 보여라
		// " " 묶인 부분은 문자열이라고 부른다.
		// " " 묶인 부분은 그대로 console에 보여라
		System.out.println(   "안녕하세요"   );
		
		// 괄호안에 숫자하고 숫자를 계산하는 식이 있으면 계산 결과를 보여라
		System.out.println(30+40);
		
		// " " 묶인 부분에 빈칸을 넣으면 그 개수만큼 띄어쓰기가 된다.
		System.out.println("30  +  40");
		
		// 괄호가 있으면 괄호 부분을 먼저 계산한다.
		System.out.println("30+40=" + (30+40));
		
		// 문자열 + 문자열 은 문자열을 연결시켜서 보여라
		System.out.println("30+40="+"30"+"40");
		
		// 괄호가 없이 문자열 + 숫자 는 숫자를 문자열로 변환시켜서
		// 연결시켜 보여라 하는 것과 같습니다.
		System.out.println("30+40="+30+40);
		
		

	}

}
