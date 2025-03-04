package com.toyFactory.model.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	Scanner sc = new Scanner(System.in);

	
	
	
	public Set<Toy> toyList = new HashSet<>();

	
	public ToyFactory() {
		toyList.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", "면직물", "고무"));
		toyList.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", "면직물", "플라스틱"));
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", "면직물", "플라스틱"));
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", "면직물", "플라스틱"));
		toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225", "면직물", "플라스틱", "고무"));
	
	}
	
	public void MatrialList() {
		Map<Integer, String> materialList = new HashMap<Integer, String>(); 
		materialList.put(1, "면직물");
		materialList.put(2, "플라스틱");
		materialList.put(3, "유리");
		materialList.put(4, "고무");
	}
	
		
	public void menu() {
		
		int input = 0;
		
		do {
			System.out.println("<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.print("선택 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1 : showToys(); break;
			case 2 : newToy(); break;
			case 3 :  break;
			case 4 :  break;
			case 5 :  break;
			case 6 :  break;
			case 7 :  break;
			default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
			}
			
		} while (input != 0);
		
	}
	
	
	public void showToys() {
		
		int num = 1;
		for(Toy T : toyList) {
			System.out.println(num++ + ". 이름 : " + T.getName() + " / 가격 : " + T.getPrice() + " / 색상 : " + T.getColor() + " / 사용가능연령 : " + T.getAvailAge() + " / 제조년월일 : " + T.getManufacture() + " / 재료 : " + Arrays.toString(T.getMaterials()));
			
			
			
		}
		
	}
	
	
	public String newToy() {
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();
		sc.nextLine();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price= sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String color = sc.nextLine();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String manufacture = sc.nextLine();
		
		while (true) {
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요)");
			String materials = sc.nextLine();
			
			if (materials.equalsIgnoreCase("q")) {
				break;
			}
			
			
			
		}
		
		
		
		
		if(toyList.add(new Toy(name, age, price, color, manufacture))) {
			return "새로운 장난감이 추가되었습니다.";
		} else {
			return "등록 실패";
		}
		
	}
	
	
	
	
}
