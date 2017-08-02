package com.bit.classes;

public class MathClass_01 {
	
	/**
	 * 
	 * 매개변수의 개수, 종류가 다르면
	 * 같은 이름의 method를 중복해서 사용할 수 있다.
	 * 다형성, OverLoad
	 * 
	 */
	
	public void add() {
		System.out.println("매개변수가 없는 add");
	}
	
	public void add(int num1) {
		System.out.println("매개변수가 1개 있는 add");
	}

	public void add(int num1, int num2) {
		System.out.println("매개변수가 2개의 정수인 add");
	}
	
	public void add(float num1, float num2) {
		System.out.println("매개변수가 2개의 실수인 add");
	}
	
	public void add(int num1, float num2) {
		System.out.println("매개변수가 정수, 실수인 add");
	}
	
	public void add(float num1, int num2) {
		System.out.println("매개변수가 실수, 정수인 add");
	}
}
