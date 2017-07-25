package com.bit.hello.i;

public class IfElse {

	public static void main(String[] args) {

		boolean booValue = true ;// false
		
		// 10하고 1이 같냐?
		// 같으면 true 가 저장될 것이고,
		// 다르면 false 가 저장 될 것입니다.
		booValue = (10 == 1) ; // false
		
		// if는 괄호 안의 값, 식, 문장이 true인가, false인가 판단해서
		// { } 내의 문장들을 실행할것인가, 안할 것인가 결정
		if(booValue) {
			// if 괄호 안의 값, 식, 문장이 true일때 실행되는 부분
			System.out.println("10과 1은 같습니다");
			
		// if 괄호 안의 값, 식, 문장이 false이면 실행되는 부분
		} else { 
			System.out.println("10과 1은 다릅니다");
		}
		
	}

}
