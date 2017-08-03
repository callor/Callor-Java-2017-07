package com.bit.exec;

public class MakeString {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		// split method는 문자열을 특정 기준으로 잘라서
		// 배열로 return 해준다.
		// 이때 배열의 개수와 내용은 split이 결정한다.
		String[] strWord = strNation.split(" ");
		for(int i = 0 ; i < strWord.length ;i++) {
			System.out.println(strWord[i]);
		}

		String[] strChar = strNation.split("");
		for(int i = 0 ; i < strChar.length; i++) {
			System.out.println(strChar[i]);
		}
		
		String strString = "한국:korea";
		String[] strS1 = strString.split(":");
		System.out.println(strS1[0]);
		System.out.println(strS1[1]);
		
		
		
	}

}









