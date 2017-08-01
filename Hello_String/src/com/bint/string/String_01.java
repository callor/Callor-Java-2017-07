package com.bint.string;

public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNation = "Republic of Korea"; 
		String strName = new String(); // 아무것도 담기지 않은 변수

		String strName1 = new String("홍길동");
		String strName2 = "홍길동";
		
		// strNation에 담긴 문자열의 길이
		System.out.println(strNation.length());
		// 모두 소문자로
		System.out.println(strNation.toLowerCase());
		// 모두 대문자로
		System.out.println(strNation.toUpperCase());

		int beginIndex = 3;
		int endIndex = 7;
		// 문자열의 특정부분을 잘라내는 method
		System.out.println(strNation.substring(beginIndex, endIndex));
		System.out.println(strNation.substring(3,7));
		
		// endIndex가 생략되면 끝까지 모두
		System.out.println(strNation.substring(beginIndex));
		
		// 결과가 문자열
		String strsub = strNation.substring(beginIndex);
		
		// index위치의 문자를 추출
		System.out.println(strNation.charAt(5));
		char strsub1 = strNation.charAt(5);

		// strNation을 문자단위로 잘라내어 보여달라
		for(int i = 0 ; i < strNation.length();i++) {
			System.out.println(strNation.charAt(i));
		}

		
		int intNum1 = 100;
		if(intNum1 == 100) {
			System.out.println("맞아요");
		} else {
			System.out.println("아니네요");
		}
		
		// 문자열이 같은지 비교할때는 == 을 사용해서는 안된다.
		String str1 = "Korea";
		if(str1 == "Korea") {
			System.out.println("맞아요");
		} else {
			System.out.println("아니네요");
		}
		
		// 문자열이 같은지 비교할때는 equals method를 사용해야 한다.
		if(str1.equals("Korea")) {
			System.out.println("맞아요");
		} else {
			System.out.println("아니네요");
		}
		
		// 영문자 비교는 반드시 대소문자가 구별된다.
		if(str1.equals("KOREA")) {
			System.out.println("맞아요");
		} else {
			System.out.println("아니네요");
		}
		
		// 대소문자 구분 없이 비교할때
		if(str1.equalsIgnoreCase("korea")) {
			System.out.println("맞아요");
		} else {
			System.out.println("아니네요");
		}
		
		// B와 비교해서 D의 위치가 어디인가
		System.out.println("D".compareTo("B")); // +2
		// F와 비교해서 D의 위치가 어디인가
		System.out.println("D".compareTo("F")); // -2
		// 대소문자 구분 없이
		System.out.println("D".compareToIgnoreCase("b"));
	
	
	}
}





