package edu.kh.inheritance.model.dto;

// dto(Data Transfer Object) : 비즈니스 계층과 데이터 교환을 위해 사용하는 객체
public class Person /*extends Object*/{
	// Object 클래스
	// - 모든 클래스의 최장위 부모
	// - class 선언부에 상속 구문이 하나도 작성되어있지 않다면
	// 컴파일러가 extends Object 구문을 자동으로 추가해준다
	
	// 속성(필드)
	private String name;	    // 이름
	private int age; 			// 나이
	private String nationality; // 국적
	
	// 생성자
	public Person() {}
		//super(); 컴파일러가 자동으로 추가해줌
	
	public Person(String name, int age, String nationality) {
		super(); //super 생성자 : 부모(Object)의 기본생성자
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	// 기능(메서드)
	// getter/setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다");
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다");
	}
	
	
	@Override
	public String toString() {
		
		return name + " / " + age + " / " + nationality;
	}
	
	
	
	
	
	
	
}
