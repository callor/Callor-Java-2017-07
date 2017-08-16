package com.bit.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/input/word.txt" ;
		try {
			// ... word.txt 파일을 읽기 위해서 여는 과정
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			// reader에서 사용할 문자열 변수는 클래스 초기화를 해주어야 한다.
			String reader = new String();
//			String reader = "" ;
			
			while(true) {
			
				reader = buffer.readLine();
				// null code값으로 봤을때 0
				if(reader == null) break ;
				System.out.println(reader);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(fileName + "여는 중 문제 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("내용을 읽는 중에 문제 발생");
		}
		
	}
}
