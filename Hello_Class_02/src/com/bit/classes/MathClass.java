package com.bit.classes;

// main method가 없는 Class
//    main method가 있는 Class로 부터 기능을 호출당하는 입장
// Class를 선언했다.(누군가 나를 사용해주도록 모양만 만들어진 상태)
public class MathClass {

	// 기능만을 호출할 수 있는 가장 단순한 method
	public void add() {
		System.out.println("나는 덧셈을 실행하는 method 입니다");
	}
	
	// 값을 주면서 기능을 호출하는 method
	//               argument, 매개변수, 파라메타(parameter)
	public void add(int num1, int num2) {
		System.out.println("나는 두수를 매개변수로 받아 덧셈을 하는 method 입니다");
		System.out.print(num1);
		System.out.print("+");
		System.out.print(num2);
		System.out.print("=");
		System.out.println(num1 + num2);
	}
	
	// 기능을 호출하면 그 결과를 호출한 곳에 알려주는 method
	public String add1() {
		return "나는 두수를 덧셈 결과를 return 한는 method 입니다" ;
	}
	
	// 값을 주면서 기능을 호출하면,
	//  매개 변수에 값을 받아서
	// 그 결과를 다시 호출한 곳에 알려주는 method
	public String add1(int num1, int num2) {
		return "두 수의 덧셈 결과=" + Integer.toString(num1 + num2);
	}
	
}













