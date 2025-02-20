package edu.kh.personal;

import java.util.Scanner;

public class practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {

		/*
		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		짝수가 아니면 “홀수입니다.“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		*/
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input <= 0) {
			result = "양수만 입력해주세요.";
					
		} else {
			if(input % 2 == 0) {
				result = "짝수입니다.";
						
			} else {
				result = "홀수입니다.";
						
			}
		}
		
		
		
		System.out.println(result);
		
	}
	


	public void ex2() {
		
		/*
		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		*/
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격입니다." : "불합격입니다.";
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println(result);
			
		} else {
			System.out.println(result);
			
		}
			
		
	}
	
	
	
	public void ex3() {
		
		/*
		1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		*/
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : System.out.println(month+"월은 31일까지 있습니다."); break;
		case 4 : case 6 : case 9 : case 11 : System.out.println(month+"월은 31일까지 있습니다."); break;
		case 2 : System.out.println(month+"월은 28일까지 있습니다."); break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		
		}
		
	}
	
	
	
	public void ex4( ) {
		/*
		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		ex.
		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
		4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
		*/
		
	
		}
		
		
	
	public void ex5() {
//배열을 이용한 검색

		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		// ex)
		// 정수 입력 : 200
		// 1번 인덱스에 존재
		// 정수 입력 : 5
		// 존재하지 않음
		
		int[] a = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]==input) {
				System.out.println(i + "번째 인덱스에 존재");
				flag=true;
			if( !flag ) {
					System.out.println("존재하지 않음");
			}
			
			}
		}
	}

	
	
	public void ex6() {

		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
				// 1,2,12 겨울 (-15도 이하 : "한파 경보" / -12도 이하 : "한파 주의보")
				// 3~5 봄
				// 6~8 여름 (35도 이상: "폭염 경보" / 33도 이상 : "폭염 주의보")
				// 9~11 가을
				// 1~12 사이가 아닐 땐 "해당하는 계절이 없다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String Season;
		
		if(month == 1 || month == 2 || month == 12) {
			Season = "겨울";
			
			System.out.print("온도 입력");
			int temperature = sc.nextInt();
			
			if(temperature <= -15) {
				Season += " 한파 경보";
			} else if(temperature <= -12) {
				Season += " 한파 주의보";
				}
			
		} else if(month >= 3 && month <= 5) {
			Season = "봄";
					
		} else if(month >= 6 && month <= 8) {
			Season = "여름";
		
			System.out.println("온도 입력");
			int temperature = sc.nextInt();
			
			if(temperature >= 35) {
				Season += " 폭염 경보";
			} else if(temperature >= 33) {
				Season += " 폭염 주의보";
			}
				
		} else if(month >= 9 && month <= 11) {
			Season = "가을" ;
			
		} else {
			Season = "해당하는 계절이 없습니다.";
		}
		System.out.println(Season);
		
	
		
	}

	
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age>100 || age<0) {
			result = "나이를 잘못 입력하셨습니다";
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height>250.0 || height<0) {
				result = "키를 잘못 입력하셨습니다";
			} else {
				if( age < 12 && height >= 140.0 ) { // 나이 X, 키 O
					result = "키는 적절하나, 나이가 적절치 않음";
					
				} else if( age >= 12 && height < 140.0 ) { // 나이 O, 키 X
					result = "나이는 적절하나, 키가 적절치 않음";	
					
				} else if( age < 12 && height < 140.0 ) { // 나이 X, 키 X
					result = "나이와 키 모두 적절치 않음";
					
				} else { // 나이 O, 키 O (그 외 조건 생각하기 : 변수를 선언만 했을 때)
					result = "탑승 가능!";
			}
		}
			
		
		}
		System.out.println(result);
	}
	
	
	public void ex8() {
		/*
		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		
	}
	

}


		
				
				
		
		

	
