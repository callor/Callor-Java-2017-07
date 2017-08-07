package com.bit.exec;

import java.util.ArrayList;
import com.bit.vo.BookVO;

public class BookExec {

	public static void main(String[] args) {

		ArrayList<BookVO> books = new ArrayList<BookVO>();
		
		books.add(new BookVO("정보처리","영진출판사","IT",20000));
		books.add(new BookVO("자바의 정석","길벗","IT",30000));
		books.add(new BookVO("윈도우 10","정보문화사","IT",50000));
		books.add(new BookVO("리눅스 마스터","영진출판사","IT",15000));
		books.add(new BookVO("HTML5","아이콘","IT",22000));
	
		// 출판사가 영진출판사인 도서목록
		for(int i = 0 ; i < books.size();i++) {
			BookVO v = books.get(i);
			// 문자열 비교는 == 로 하지 않는다.
//			if(v.getStrComp() == "영진출판사") {
			
			if(v.getStrComp().equals("영진출판사")) {
				System.out.println(v.toString());
			}
		}
		System.out.println("=========================");
	
		// 가격이 20000원이상인 도서만 출력
		for(BookVO v : books) {
			if(v.getIntPrice() >= 20000) {
				System.out.println(v.toString());
			}
		}
		
		int sum = 0 ;
		for(BookVO v : books) {
			sum += v.getIntPrice();
		}
		System.out.println("도서가격 : " + sum);
	}
}



















