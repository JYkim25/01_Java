package com.hw3.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.hw3.dto.Book;

public class BookService { // 동작 구현을 위한 서비스 클래스
	
	Scanner sc = new Scanner(System.in); // 스캐너 생성
	
	private List<Book> bookList = new ArrayList<>(); // 책 정보 객체들을 모은 컬렉션 생성
	
	public BookService() { // 컬렉션에 Book 클래스의 생성자를 이용해서 책 정보들 추가
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
		
		
	}

	public void bookList() { // 도서 목록 프로그램 메서드
		
		int input = 0; // 메뉴 입력번호 초기화
		
		do { // 프로그램을 종료하기 전에는 계속 반복될 수 있도록 do~ while~ 반복문 작성
			System.out.println("===도서 목록 프로그램===");
			
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.println(); // 줄 띄어쓰기용
			System.out.print("메뉴를 입력하세요 : ");
			
			input = sc.nextInt(); //스캐너로 메뉴 입력번호 받기
			sc.nextLine(); // 개행 문자 제거
			
			switch(input){ //입력된 메뉴 번호에 따라 다른 메서드를 구동하는 case문
			
			case 1 : System.out.println(addBook()); break;
			case 2 : showBooks(); break;
			case 3 : System.out.println(updateBook()); break;
			case 4 :  break;
			case 5 :  break;
			case 6 :  break;
			case 7 :  break;
			case 8 :  break;
			case 0 :  break;
			default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
			}
		
		
		} while (input != 0); // 0이 입력되면 반복 종료
		
		
		
		
	}
	
	
	public String addBook() { // 도서 등록 메서드
		
		System.out.println("======도서 등록======");
		System.out.println(); // 줄 띄어쓰기
		System.out.print("도서 번호 : "); // 새로 등록할 도서의 정보들을 입력
		int num = sc.nextInt();
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		sc.nextLine(); // 개행문자 제거
		System.out.print("도서 저자 : ");
		String author = sc.next();
		sc.nextLine(); // 개행문자 제거
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		System.out.print("도서 출판사 : ");
		String publisher = sc.next();
		System.out.println();
		
		if(bookList.add(new Book(num, title, author, price, publisher))) { // 값들이 문제없이 입력되면
			
			return "등록 완료"; // 등록과 함께 등록 완료 스트링 반환
			
		} else {
			
			return "등록 실패"; // 아닐 경우 등록 실패 스트링 반환
			
		}
		
		
		
	}
	
	
	public void showBooks() { // 현재 등록된 도서들을 조회하는 메서드
		
		for(Book B : bookList) { // 향상된 for 구문으로 bookList 컬렉션을 돌면서
			
			System.out.println(B); // 현재 도서들 정보의 (오버라이드 되며 반환된) toString 출력
		}
		
	}
	
	
	public String updateBook() { // 도서 정보 수정 메서드
		
		System.out.println("========도서 수정========");
		System.out.println(); // 줄 띄어쓰기
		
		int updateMenu = 0; // 수정할 정보에 대한 번호를 입력받을 예정이어서 초기화
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int updateBookNum = sc.nextInt(); //수정할 도서의 번호를 스캐너로 입력받음
		
		boolean flag = true; // 입력받은 번호가 컬렉션에 포함되어 있는지 검사하기 위한 flag 초기화
		
		for(Book temp : bookList) { // 책 정보 객체들을 모아둔 bookList의
									// 각 요소를 참조하는 변수 temp를 생성해놓고 해당 컬렉션을 돌면서,
			if(temp.getNum() == updateBookNum) { // get한 책 번호들 중 입력받은 번호와 같은 것이 있다면,
				
				flag = false; //검사 flag 값을 변경하고 수정할 정보를 고르는 구문 출력
				
				System.out.println(); // 줄 띄어쓰기
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.println(); // 줄 띄어쓰기
				System.out.print("어떤 정보를 수정하시겠습니까?");
				updateMenu = sc.nextInt();
				sc.nextLine(); // 개행문자 제거
				
				switch(updateMenu) { // 입력받은 수정 항목 번호에 따라 실행 메서드를 구분하는 switch문
				
				case 1 : System.out.println("=====도서명 수정====="); //각 항목에 따라 스캐너와 set을 이용해 매개변수 수정
				System.out.print("수정할 도서명을 입력하세요 : ");
				String title = sc.nextLine();
				temp.setTitle(title);
				break;
				
				case 2 : System.out.println("=====도서 저자 수정====="); // 이하 동일
				System.out.print("수정할 도서 저자를 입력하세요 : ");
				String author = sc.nextLine();
				temp.setAuthor(author);
				break;
				
				case 3 : System.out.println("=====도서 가격 수정=====");
				System.out.print("수정할 도서 가격을 입력하세요 : ");
				int price = sc.nextInt();
				temp.setPrice(price);
				break;
				
				case 4 : System.out.println("=====도서 출판사 수정=====");
				System.out.print("수정할 도서 출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				temp.setPublisher(publisher);
				break;
				
				case 0 : System.out.println("수정 종료"); break;
				default : System.out.println("메뉴에 있는 번호만 선택하세요!"); // 해당되는 번호가 없을 때 구문 출력
				
				if(flag) { // flag 변수가 바뀌지 않고 true로 남아있다면 수행하는 코드 없이
					return "일치하는 도서 번호가 없습니다."; // 알림 스트링 반환
				}
			}
		}
		
		
		}
		return "수정 완료"; // 정상적으로 완료되었다면 처리화 함께 반복 구문들을 빠져나와 스트링 반환
		
	
		
		
		
	}
	
	
}
