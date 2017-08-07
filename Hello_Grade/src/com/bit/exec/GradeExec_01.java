package com.bit.exec;

import java.util.ArrayList;

import com.bit.vo.GradeVO;
import com.bit.vo.SupperClass;

public class GradeExec_01 {

	public static void main(String[] args) {

		ArrayList<GradeVO> arrGrade = new ArrayList<GradeVO>();
		GradeVO gradeVO = new GradeVO("001","홍길동",80,70,80);
		
		arrGrade.add(new GradeVO("002","이몽룡",90,80,70));
		arrGrade.add(new GradeVO("003","장영실",90,80,70));
		arrGrade.add(new GradeVO("004","이몽룡",90,80,70));
		arrGrade.add(new GradeVO("005","이몽룡",90,80,70));
		arrGrade.add(new GradeVO("006","이몽룡",90,80,70));
		arrGrade.add(new GradeVO("007","이몽룡",90,80,70));
		arrGrade.add(new GradeVO("008","이몽룡",90,80,70));
		

		// ArrayList를 println 으로 출력을 하면
		// List에 포함된 객체들을 1개씩 추출하고,
		// 각 객체의 toString() method를 호출하고
		// 결과값을 console에 표시하라
		System.out.println(arrGrade);
		System.out.println(arrGrade.get(0).toString());
		
		
	}

}









