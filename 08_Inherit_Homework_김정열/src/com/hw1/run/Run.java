package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		// 향상된 for문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를
		 * 순차적으로 간단하게 반복할 수 있는 구조를 제공
		 * 일반적인 for문보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 작성할 수 있다
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션){
		 *		//반복해서 실행할 코드
		 * }
		 * */
		
		for(Student std : students) {
			System.out.println(std.information());
		}
		
		System.out.println("--------------------------");
		
		Employee[] emps = new Employee[10];
				
		
				
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emps[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			// 배열이 꽉 찼으면 반복 종료
			if(emps.length == count) {
				break;
			}
			
			// 추가 여부 묻기
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			String str = sc.next().toUpperCase(); // 소문자 -> 대문자
			// "n" -> "N"
			// String.toLowerCase() : 대문자 -> 소문자 "N" -> "n"
			
			if(str.equals("N")) break;
			
			//if(str.equalsIgnoreCase("N")) break;
			// equalsIgnoreCase() : 문자열 비교 메서드, 대소문자를 구분하지 않고
			// 두 문자열이 같은지 비교
			
			
		}
		
		 // 현재까지 기록된 사원들의 정보를 모두 출력
		for(Employee emp : emps) {
			// 첫번쨰 EMP 객체에 대한 주소, 두번째 EMP 객체주소, null, null, null...
			// 만약에 emp가 null이면 반복 종료!
			if(emp == null) break ; // NullPointerException 방지
			
			
			System.out.println( emp.information());
		}
		
		
	}

}
