package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People; // 다른 패키지에 있으니 import

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지 or 서비스
// (비밀번호 -> 암호화, 파일 -> 유효한 파일 걸러내는 작업..)

public class AbstractionService {

	// 속성
	// 기능
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형처럼 사용된다 *
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다!!!
		
		// int[] arr = new int[5];
		
		
		/*
		p1.name = "홍길동"; // .필드명 (직접 접근) 캡슐화 어김
		p1.gender = '남'; // The field People.gender is not visible
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name); //필드에 접근 변수.
		//System.out.println("p1의 gender : " + (int)p1.gender); 
		System.out.println("p1의 gender : " + p1.gender); 
		// char타입 jvm 기본값은 0
		// 유니코드 문자체계에서 0은 공백을 나타냄
		// -> int 형으로 강제 형변환하면 0인 것을 확인할 수 있음!
		
		System.out.println("p1의 pNo : " + p1.pNo); 
		System.out.println("p1의 address : " + p1.address); 
		System.out.println("p1의 phone : " + p1.phone); 
		System.out.println("p1의 age : " + p1.age); 
		
		*/
		
		
		// 전달하는 값(인자) : 전달 인자
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setGender('남');
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		// 본인 객체
		// People 클래스 이용하여 본인 이름 객체 생성하기
		// 본인의 정보 setter 값 대입
		// getter 이용해서 콘솔창 출력까지
		
		
		
		
	}
	
	public void ex2() {
		
		People 김정열 = new People();
		
		김정열.setName("김정열");
		김정열.setGender('남');
		김정열.setpNo("123456-1234567");
		김정열.setAddress("서울시 은평구");
		김정열.setPhone("010-6462-8326");
		김정열.setAge(38);
		
		
		System.out.println(김정열.getName());
		System.out.println(김정열.getGender());
		System.out.println(김정열.getpNo());
		System.out.println(김정열.getAddress());
		System.out.println(김정열.getPhone());
		System.out.println(김정열.getAge());
	}
	
}
