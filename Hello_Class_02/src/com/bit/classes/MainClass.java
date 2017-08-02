package com.bit.classes;


// main method가 있는 Class
// main method가 있는 Class는 보통 main method가 없는 Class의
//     여러 기능(method)들을 호출해서 일을 처리한다.
public class MainClass {

	// 시작점 method 
	// 원칙이 전체 project에서 1개만 존재해한다.
	public static void main(String[] args) {

		// Class를 사용하기 위해서 object로 "생성"한다
		// Class
		//        object, 객체
		// 					  클래스의 생성자
		MathClass mathClass = new MathClass();
		
		MathClass_01 m_01 = new MathClass_01();
		
		m_01.add();
		m_01.add(100);
		m_01.add(100,200);
		m_01.add(10.0f, 20.f);
		m_01.add(100, 10.0f);
		m_01.add(10.0f, 1000);
		
		MathClass_Old old = new MathClass_Old();
		old.add(100,100);
		old.add_float(10.0f, 20.0f);
		old.add_float_int(10.9f, 200);
		old.add_int(100, 200);
		old.add_int_float(100, 10.f);
	
		
		
	}

}














