package com.hw3.run;

import com.hw3.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		
		BookService service = new BookService(); // BookService 클래스를 이용한 새 인스턴스를 service라는 이름으로 생성
		service.bookList(); // service 객체의 bookList(); 메서드를 실행

	}

}
