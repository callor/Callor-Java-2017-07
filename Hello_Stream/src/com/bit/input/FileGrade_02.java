package com.bit.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.bit.vo.GradeVO;

public class FileGrade_02 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/input/grades.txt";
		ArrayList<GradeVO> arrGrade = new ArrayList<GradeVO>();
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			while(true) {
				
				reader = buffer.readLine();
				if(reader == null) break;
				
				String[] grades = reader.split(":");
				
				GradeVO vo = new GradeVO();
				vo.setStrNum(grades[0]);
				vo.setStrName(grades[1]);
				vo.setIntKor(Integer.parseInt(grades[2]));
				vo.setIntEng(Integer.parseInt(grades[3]));
				vo.setIntMath(Integer.parseInt(grades[4]));
				
				arrGrade.add(vo);
			
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(fileName + " 파일 오픈 문제 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("======================================================");
		System.out.println("   성   적    관    리");
		System.out.println("------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------");
		
		for(GradeVO v : arrGrade) {
			
			System.out.print(v.getStrNum() + "\t");
			System.out.print(v.getStrName() + "\t");
			System.out.print(v.getIntKor() + "\t");
			System.out.print(v.getIntEng() + "\t");
			System.out.print(v.getIntMath() + "\t");
			int sum = v.getIntKor() + v.getIntEng() + v.getIntMath();
			System.out.print(sum + "\t");
			System.out.println(sum / 3);
			
		}
		
		System.out.println("======================================================");
		
		
	}

}
