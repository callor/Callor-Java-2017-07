package com.bit.array;

public class GradeArray {

	public static void main(String[] args) {

		// 학번, 성명, 국어, 영어, 수학, 총점, 평균
		String[] strNum = new String[5];
		String[] strName = new String[5];
		
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
		int[] intTotal = new int[5];
		int[] intAvg = new int[5];
		
		for(int i = 0 ; i < strNum.length ; i ++) {
			
			strNum[i] = Integer.toString(i+1);
			strName[i] = Integer.toHexString(i+1) ; // 16진수
		
			// 난수를 만들어주는 method
			// Math.random() : 0부터 1미만의 무작위수(난수) 발생시키는 method
			// Math.random() * 10 : 0부터 10미만의 수를 발생
			// (int)(Math.random() * 10) : random으로 나탄 수를 정수화
			// 		소수점 이하를 무조건 잘라
			//		0 부터 9까지의 정수를 난수로 발쌩시키는 기법
			intEng[i] = (int)(Math.random() * (100-50) + 50); 
			intKor[i] = (int)(Math.random() * (100-50) + 50);
			intMath[i] = (int)(Math.random() * (100-50) + 50);
			
		}
		
//		System.out.println("학번\t성명\t국어\t영어\t수학");
//		System.out.println("====================================");
//		for(int i = 0 ; i < strNum.length; i++) {
//			
//			System.out.print(strNum[i] + "\t");
//			System.out.print(strName[i] + "\t");
//			System.out.print(intKor[i] + "\t");
//			System.out.print(intEng[i] + "\t");
//			System.out.println(intMath[i]);
//			
//		}

		// 출력부분을 별도 method로 분리해서 공통으로 사용
		gradePrint(strNum, strName, intKor,intEng, intMath, intTotal, intAvg);
		
		for(int i = 0 ; i < strNum.length; i++) {
			int sum = intKor[i] + intEng[i] + intMath[i];
			
			intTotal[i] = sum ;
			intAvg[i] = sum / 3;
		}
		gradePrint(strNum, strName, intKor, intEng, intMath, intTotal, intAvg);
		
		for(int i = 0 ; i < intTotal.length ; i++) {
			for(int j = i ; j < intTotal.length; j++) {
				if(intTotal[i] > intTotal[j]) {
					
					int tmp = intTotal[i] ;
					intTotal[i] = intTotal[j];
					intTotal[j] = tmp;

					tmp = intAvg[i];
					intAvg[i] = intAvg[j];
					intAvg[j] = tmp;
					
					tmp = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = tmp;

					tmp = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = tmp;

					tmp = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = tmp;
					
					String st = strNum[i] ;
					strNum[i] = strNum[j] ;
					strNum[j] = st;

					st = strName[i] ;
					strName[i] = strName[j] ;
					strName[j] = st;
					
					
					
				}
			}
		}
		gradePrint(strNum, strName, intKor, intEng, intMath, intTotal, intAvg);
	

		
		
	}

	
	
	
	
	static void gradePrint(
			
			String strNum[],
			String strName[],
			int intKor[],
			int intEng[],
			int intMath[],
			
			int intTotal[],
			int intAvg[]
			) 
	
	{
		
		System.out.println("===============================================");
		System.out.println(" 성  적   표");
		System.out.println("------------------------------------------------");
		System.out.println("학번\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===============================================");
		for(int i = 0 ; i < strNum.length; i++) {
			
			System.out.print(strNum[i] + "\t");
			System.out.print(strName[i] + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			System.out.print(intTotal[i] + "\t");
			System.out.println(intAvg[i]);
		}
		System.out.println("===============================================");
	}

}
