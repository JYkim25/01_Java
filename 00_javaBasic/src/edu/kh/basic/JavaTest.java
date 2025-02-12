package edu.kh.basic;

// 한 줄 주석 : (컴파일러가 해석하지 않는 부분)

//git 테스트! 집에서 코드 변경해봄
//학원에서 공부함!

/*
a
b
c
d
*/

public class JavaTest {
public static void main(String[] args) {
	System.out.println("Hello world!");
	System.out.println("저녁 뭐먹을까");
	System.out.println("12345");
	
	System.out.println("Hi");
	System.out.println("Hi");
	System.out.println("Hi");
	
	System.out.println("1+2"); //문자열 출력
	System.out.println(1+2); //연산
	
	System.out.println(50-23);
	System.out.println(12*13);
	System.out.println(327/3);
	System.out.println(12%2); // %는 나머지 (0)
	
	//""(문자열)+숫자 함께 작성
	System.out.println("14*19="+266); //문자열 이어쓰기
	System.out.println("14*19="+14*19); //이어쓰기 뒷부분 연산
	
	System.out.println("90+70+65="+90+70+65); //+를 문자열 이어쓰기로 인식
	System.out.println("90+70+65="+(90+70+65)); //실제 연산을 위해 소괄호 사용
	
	//자바는 사칙연산의 우선 순위를 그대로 따른다
	// - 우선 계산을 원하면 () 소괄호 사용
	
	//+기호의 역할
	//  숫자+숫자=덧셈 연산 결과
	//  문자열+숫자 or
	//  문자열+문자열 - 이어쓰기
	System.out.println("A"+"B");
	
}
}
