package com.bit.hello;

public class If_Else_04 {

	public static void main(String[] args) {

		int pay = 3214520;
		
		int q = pay / 50000; // 5만원 권을 계산
		System.out.println("5만원권" + q + "매");
		pay = pay-(50000 * q); // 5만원권을 제외한 나머지 금액
		
		q = pay / 10000; // 1만원 권 계산
		System.out.println("1만원권" + q +"매");
		pay = pay-(10000*q) ; // 1만원권을 제외한 나머지 금액

		q = pay / 5000; // 5천원 권 계산
		System.out.println("5천원권" + q + "매");
		pay = pay-(5000 * q); // 5천원권을 제외한 나머지 금액

		q = pay / 1000; // 1천원 권 계산
		System.out.println("1천원권" + q + "매");
		pay = pay-(1000 * q); // 5천원권을 제외한 나머지 금액

		q = pay / 500; // 5백원 권 계산
		System.out.println("5백원권" + q + "매");
		pay = pay-(500 * q); // 5천원권을 제외한 나머지 금액

		q = pay / 100; // 1백원 권 계산
		System.out.println("1백원권" + q + "매");
		pay = pay-(100 * q); // 5천원권을 제외한 나머지 금액
		
		q = pay / 50; // 5십원 권 계산
		System.out.println("5십원권" + q + "매");
		pay = pay-(50 * q); // 5천원권을 제외한 나머지 금액
		
		q = pay / 10; // 1십원 권 계산
		System.out.println("1십원권" + q + "매");
		pay = pay-(10 * q); // 5천원권을 제외한 나머지 금액
		
	}

}
