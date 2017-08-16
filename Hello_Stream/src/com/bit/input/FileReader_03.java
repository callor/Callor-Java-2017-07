package com.bit.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bit.vo.WordVO;

public class FileReader_03 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/input/words.txt";
		ArrayList<WordVO> arrWord = new ArrayList<WordVO>();
		Scanner scanner = new Scanner(System.in);
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			while(true) {
				
				reader = buffer.readLine();
				if(reader == null) break;
				String[] words = reader.split(":");
				
				WordVO vo = new WordVO();
				vo.word = words[0];
				vo.mean = words[1];

				arrWord.add(vo);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(WordVO v : arrWord) {
			System.out.println("다음에 제시된 단의 뜻은?");
			System.out.print(v.word + ">> ");
			String ans = scanner.nextLine();
			if(ans.equalsIgnoreCase(v.mean)) {
				System.out.println("참 잘했어요");
			} else {
				System.out.println("아쉽네요");
				System.out.println("정답은 " + v.mean);
			}
		}
		
	}

}
