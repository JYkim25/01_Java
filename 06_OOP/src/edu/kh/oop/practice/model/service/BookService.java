package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book b1 = new Book(); //기본 생성
		Book b2 = new Book("자바의 정석",30000,0.2,"남궁성");
		
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
	
		
		
		
	}

}
