package com.bit.hello;

public class If_Else_05 {

	public static void main(String[] args) {

		int pay = 3214520;
		int intM = 50000;
		
		for(int i = 0 ; i < 9 ; i ++ ) {
			int q = pay / intM ; 
			System.out.println(intM +" 원권" + q + "매");
			pay = pay-(intM * q); 
			if(i % 2 == 0) {
				intM /= 5;
			} else {
				intM /= 2;
			}
		}
		
		pay = 3214520;
		intM = 50000;
		int sw = 1; // 스위치 변수
		while(intM > 5) {
			int q = pay / intM;
			System.out.println(intM + " 원권" + q + "매");
			pay = pay - (intM * q);
			if(sw == 1) {
				intM /= 5;
			} else {
				intM /= 2;
			}
			sw = sw*(-1);
		}

		pay = 3214520;
		intM = 50000;
		int intCount = 0 ;
		while(intM > 5) {
			int q = pay / intM;
			System.out.println(intM + " 원권" + q + "매");
			pay = pay - (intM * q);
			
			if(intCount % 2 == 0) {
				intM /= 5;
			} else {
				intM /= 2;
			}
			intCount ++ ;
		}

		pay = 3214520;
		intM = 50000;
		int sw1 = 1;
		while(intM > 5) {
			int q = pay / intM;
			System.out.println(intM + " 원권" + q + "매");
			pay = pay - (intM * q);
			if(sw1 == 1) {
				intM /= 5;
				sw1 = 0;
			} else {
				intM /= 2;
				sw1 = 1;
			}
//			sw = sw*(-1);
		}
		
	}

}






