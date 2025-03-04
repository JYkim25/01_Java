package com.hw3.dto;

public class Book { //Book 클래스의 필드 항목 작성

	private int num;
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {} // 기본 생성자

	public Book(int num, String title, String author, int price, String publisher) { // 매개변수 생성자
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	//getter, setter 세팅
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() { // toString 출력을 위한 오버라이딩
		return num + "번 도서 : [도서제목 : " + title + "/ 도서저자 : " + author + "/ 도서가격 : " + price + "/ 출판사 : "
				+ publisher + "]";
	}
	
	
	
	
	

	
}
