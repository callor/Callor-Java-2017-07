package com.bint.vo;

import java.util.ArrayList;

public class GradeExec {

	public static void main(String[] args) {

		ArrayList<GradeVO> arrGrade = new ArrayList<GradeVO>();
		for(int i = 0 ; i < 5 ; i++) {
		
			GradeVO vo = new GradeVO();
			int intKor = (int)(Math.random() * (100-50) + 50);
			int intEng = (int)(Math.random()* (100-50) + 50);
			int intMath = (int)(Math.random() * (100-50) + 50);
			
			vo.setStrNum(Integer.toString(i+1));
			vo.setStrName(Integer.toHexString(i+1));
			
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			arrGrade.add(vo);
			
		}
		// 화면출력 호출
		gradePrint(arrGrade);
		for(int i = 0 ; i < arrGrade.size();i++) {

			GradeVO vo = arrGrade.get(i);
			int sum = vo.getIntKor();
			sum += vo.getIntEng();
			sum += vo.getIntMath();
			
			vo.setIntTotal(sum);
			vo.setIntAvg(sum / 3);
			
		}
		gradePrint(arrGrade);
		
		for(int i = 0 ; i < arrGrade.size();i++) {
			for(int j = i ; j < arrGrade.size();j++) {
				
				GradeVO vI = arrGrade.get(i);
				GradeVO vJ = arrGrade.get(j);
				
				if(vI.getIntTotal() > vJ.getIntTotal()) {
					GradeVO t = arrGrade.get(i) ;
					arrGrade.set(i, arrGrade.get(j));
					arrGrade.set(j, t );
				}
			}
		}
		gradePrint(arrGrade);
		
	}
	
	static void gradePrint(ArrayList<GradeVO> arr) {

		System.out.println("============================================");
		System.out.println("   성   적   표");
		System.out.println("============================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		
		for(int i = 0 ; i < arr.size();i++) {
			GradeVO vo = arr.get(i);
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntEng()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			System.out.print(vo.getIntTotal()+"\t");
			System.out.println(vo.getIntAvg());
		}
		System.out.println("=============================================");
		
		
	}

}














