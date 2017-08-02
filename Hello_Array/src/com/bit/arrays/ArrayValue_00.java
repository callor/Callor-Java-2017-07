package com.bit.arrays;

public class ArrayValue_00 {

	public static void main(String[] args) {
		/*
		int intKor01 = 90;
		int intKor02 = 80;
		int intKor03 = 60;
		int intKor04 = 85;
		int intKor05 = 76;
		int intKor06 = 77;
		int intKor07 = 56;
		int intKor08 = 97;
		int intKor09 = 78;
		int intKor10 = 88;
		*/
		// 배열(Array)이라고 한다.
		// 같은 종류의 변수를 연속해서 여러개 사용하고자 할때
		// [] 안의 숫자는 생성할 배열의 개수
		int[] arrKor = new int[10];
		
		// 첨자, 위치값, 주소값
		arrKor[0] = 90;
		arrKor[1] = 90;
		arrKor[2] = 80;
		arrKor[3] = 60;
		arrKor[4] = 85;
		arrKor[5] = 76;
		arrKor[6] = 77;
		arrKor[7] = 56;
		arrKor[8] = 97;
		arrKor[9] = 78;
		// 개수를 10개 예약 하면
		// 방 번호는 0번부터 9번까지만 쓸수 있다.
		// 10번 방을 쓰면 오류가 난다
//		arrKor[10] = 88;  // 개수가 10개 이므로
		
		int sum = 0 ;
		for(int i = 0 ; i < 10 ; i++) {
			sum += arrKor[i];
		}
		System.out.println("총점=" + sum);
		System.out.println("평균=" + ( sum/10 ));
		
	}

}
