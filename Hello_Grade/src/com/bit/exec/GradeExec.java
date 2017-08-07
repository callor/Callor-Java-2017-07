package com.bit.exec;

import java.util.ArrayList;

import com.bit.vo.GradeVO;

public class GradeExec {
	public static void main(String[] args) {
		
		ArrayList<GradeVO> arrGrade = new ArrayList<GradeVO>();
		
		//Class  인스턴스, 객체
		//                    생성자
		GradeVO gradeVO = new GradeVO(); // super 생성자 호출

		gradeVO.setStrNum("001");
		gradeVO.setStrName("홍길동");
		gradeVO.setIntKor(80);
		gradeVO.setIntEng(87);
		gradeVO.setIntMath(70);
		arrGrade.add(gradeVO);
		
		gradeVO = new GradeVO();
		gradeVO.setStrNum("002");
		gradeVO.setStrName("이몽룡");
		gradeVO.setIntKor(89);
		gradeVO.setIntEng(87);
		gradeVO.setIntMath(78);
		arrGrade.addAll(arrGrade);
		
		for(int i = 0 ; i<arrGrade.size();i++) {
			
			int sum = arrGrade.get(i).getIntKor();
			sum += arrGrade.get(i).getIntEng();
			sum += arrGrade.get(i).getIntMath();
			arrGrade.get(i).setIntTotal(sum);
			arrGrade.get(i).setIntAvg(sum / 3);
			
		}

		for(int i = 0 ; i<arrGrade.size();i++) {

			GradeVO g = arrGrade.get(i);
			int sum = g.getIntKor();
			sum += g.getIntEng();
			sum += g.getIntMath();
			g.setIntTotal(sum);
			g.setIntAvg(sum / 3);
			
		}

		
		
	}

}
