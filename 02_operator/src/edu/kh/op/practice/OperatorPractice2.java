package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
public void practice() {

	/*
	 * 
키보드로 나이를 입력받아 
20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
입력받은 값이 65세 이상이거나, 12세 이하면 
"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		
[실행화면]
		
당신의 나이는 ? : 20
저는 성인입니다
청소년 입니까? false
노인이거나 어린이 입니까? false
-----------------------------------------
당신의 나이는 ? : 13
저는 미성년입니다
청소년 입니까? true
노인이거나 어린이 입니까? false
	 * */
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("당신의 나이는 ? : ");
	int input1 = sc.nextInt();
	
	String result = input1 >= 20 ? "저는 성인 입니다" : "저는 미성년 입니다";
	String result2 = input1 >= 13 && input1 <= 19 ? " true" : "false" ;
	String result3 = input1 >= 65 || input1 <= 12 ? " true" : "false" ;
	
	
	System.out.println( result );
	System.out.println( "청소년입니까? " + result2 );
	System.out.println( "노인이거나 어린이 입니까? " + result3 );
	
}

}
