package com.bit.keyinput;

import java.util.ArrayList;
import java.util.Scanner;

import com.bit.vo.GradeVO;

public class GradeExec {

	public static void main(String[] args) {

		ArrayList<GradeVO> arrGrade = new ArrayList<GradeVO>();
		Scanner scan = new Scanner(System.in);
		
		int intNum = 0;

		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		while(true) {
			intNum ++ ;
			System.out.println(intNum + "번 학생점수입력");
			System.out.print("이름 >> ");
			String strName = scan.nextLine();
			if(strName.equals("--END")) {
				break;
			}

			try {
				System.out.print("국어>> ");
				String strKor = scan.nextLine();
				int intKor = Integer.parseInt(strKor);

				System.out.print("영어>> ");
				String strEng = scan.nextLine();
				int intEng = Integer.parseInt(strEng);

				GradeVO v = new GradeVO(Integer.toString(intNum),
						strName,
						intKor,
						intEng);
				arrGrade.add(v);
			} catch (Exception e) {
				System.out.println("점수가 잘못되었습니다");
				System.out.println("다시 입력해 주세요");
				intNum -- ;
			}
		}
		
		// 저장된 내용확인
		System.out.println(arrGrade.toString());
	}

}
















