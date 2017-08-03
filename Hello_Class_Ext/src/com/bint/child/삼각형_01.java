package com.bint.child;

import com.bit.parents.*;

public class 삼각형_01 extends 도형{

	// 부모의 method를 상속받은 후 다시 작성(재정의)
	@Override
	public void 회전() {
		System.out.println("삼각형이 회전합니다");
	}
	
}




