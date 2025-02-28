package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;


public class Zoo {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Animal> animals = new ArrayList<>();
	
	public Zoo() {}
	
	public void addAnimal(Animal animal) {}
	
	public void showAnimals() {
		
		
	}
	
	public void displayMenu() {
		
		System.out.println("****** KH 동물원 ******");
		System.out.println("원하는 직업을 선택하세요 : ");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
			case 1 : showAnimals(); break;
			case 2 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다"); break;
		}
		
	}

}
