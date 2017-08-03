package com.bit.arrays;

/**
 * 숫자를 1자리씩 잘라 더한 합을 계산
 * @author callor
 *
 */
public class ArrayValue_01 {

	public static void main(String[] args) {
		
		int intNum = 20301230;
		Integer intM = intNum ; // int 형 변수를 Integer 형 변수로 바꾸고
		String strNum = intM.toString(); // 문자열로 바꾼다
		
		String[] sNum = strNum.split("");
		
		int sum = 0;
		for(int i = 0 ; i < sNum.length; i++) {
			sum += Integer.parseInt(sNum[i]); // 문자열을 숫자 변환
		}
		System.out.println(sum);

	}

}
