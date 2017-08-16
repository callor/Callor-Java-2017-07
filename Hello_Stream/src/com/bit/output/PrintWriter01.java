package com.bit.output;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriter01 {

	public static void main(String[] args) {

		// 생성할 파일이름
		String fileName = "src/com/bit/output/data.txt";
		Scanner scanner = new Scanner(System.in);
		PrintWriter printWriter = null ;

		// 파일을 생성하기 위해서 OS에게 권한 요청
		// OS로부터 경고, 오류를 받으면 프로그램이 멈추게 된다.
		// try catch 로 묶어 주어야 한다.
		try {
			
			printWriter = new PrintWriter(fileName);
			while(true) {
			
				System.out.print("숫자를 입력하세요");
				String strKeyIn = scanner.nextLine();
				if(strKeyIn.equals("--00")) break;
				printWriter.println(strKeyIn);
			}
			
			// write 하기 위해 파일을 open 하면
			// 반드시 close()로 닫아 주어야 한다.
			// OS에게 권한을 반납하는 절차
			printWriter.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 생성할 수 없습니다");
			printWriter.close();
			
		}
		System.out.println("파일 저장 완료");
	}

}
