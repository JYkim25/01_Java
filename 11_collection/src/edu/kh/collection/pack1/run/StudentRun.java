package edu.kh.collection.pack1.run;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {

	public static void main(String[] args) {
		
		StudentService service = new StudentService();
		//service.ex();
		service.displayMenu();
		
		/*
		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(5);
		numberList.add(1);
		numberList.add(2);
		numberList.add(4);
		numberList.add(3);
		
		// 숫자 리스트를 정렬 (오름차순)
		// Integer는 이미 Comparable을 상속받아 compareTo() 정의함
		
		Collections.sort(numberList);
		
		System.out.println(numberList); // [1,2,3,4,5]
		*/
		
		
		
	}

}
