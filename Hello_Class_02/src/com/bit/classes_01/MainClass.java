package com.bit.classes_01;

// 다른 package에 있는 Class를 사용할때는 
//		해당 Class를 import
// Ctrl + Shift + O : 자동으로 import
import com.bit.classes.MathClass_01;

public class MainClass {

	public static void main(String[] args) {
		
		// import 문에 의해
		// 다른 package에 있는 Class도 사용 가능하다.
		MathClass_01 m_01 = new MathClass_01();
	
	}
}
