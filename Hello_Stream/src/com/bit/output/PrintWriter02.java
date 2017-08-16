package com.bit.output;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter02 {
	
	public static void main(String[] args) {
		String[] arrName = new String[] {
						"홍길동",
						"이몽룡",
						"장영실",
						"성춘향",
						"장보고",
						"임걱정" };
		
		String fileName = "src/com/bit/output/data1.txt";
		PrintWriter printWriter = null;

		try {
		
			printWriter = new PrintWriter(fileName);
			
			for(String s : arrName) {
				int intNum = (int)(Math.random() * (100-50)+50);
				printWriter.print(s);
				printWriter.print(":");
				printWriter.println(Integer.toString(intNum));
			}
			printWriter.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일 생성 오류");
			printWriter.close();
		}
		System.out.println("파일 저장 완료");
		
		
	}

}










