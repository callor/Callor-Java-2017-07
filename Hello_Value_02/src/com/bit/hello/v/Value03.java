package com.bit.hello.v;

public class Value03 {

	public static void main(String[] args) {

		// 반복적인 일을 처리하는 문장
		
		int intNum1 = 0 ;
		int intSum = 0;
		
		// 어떤 조건을 부여하고,
		// 그 조건이 참(true)일동안만 반복
		
		// 만약 intNum1의 값이 0이면
		if(intNum1 == 0) {
			// 조건이 true이면 실행할 문장
		}
		

		
		
		// 무조건, 중단할때까지, 계속 무한반복
		for( ;; ) {
			// intNum1의 값을 1씩 증가 시켜라
			intNum1 ++;
			// 그 증가된값 11이 되면
			if(intNum1 == 11) {
				break; // for 문장을 끝내라
			}
			intSum += intNum1;
			System.out.println(intSum);
		}
		
		// for가 끝났을때...
		System.out.println("결과값:" + intSum);
		
		// 조건에 맞으면 중단
		for( ;; ) {
			if( 0 == 0 ) {
				break;
			}
		}
		
		// 무조건 반복
		for( ;; ) {
			
		}
		
		
	}

}










