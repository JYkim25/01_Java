package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {

	// 얕은 복사 (shallow copy)
	// -> 주소를 복사하여 서로 다른 두 참조변수가
	// 하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사방법
	public void shallowCopy() {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println();
		// 얕은 복사 진행
		int[] copyArr = arr; // 주소만 복사

		System.out.println("변경 전");
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr 주소 : " + copyArr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// 얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		
		
	}

	// 깊은 복사 (deep copy)
	// -> 같은 자료형의 새로운 배열을 만들어서
	// 기존 배열의 데이터를 모두 복사하는 방법
	public void deepCopy() {
		
		int[]arr = {1,2,3,4,5}; // 원본
		
		// 1. for 문을 이용한 깊은 복사
		int[]copyArr1 = new int[arr.length]; // 5칸짜리 배열 생성. 내용 대입은 아직
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
				
		}
		
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr1 주소 :" + copyArr1);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		
		// 2. System.arraycopy(원본배열, 원본복사 시작 인덱스,
		//					복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		
		// 3. 복사할 배열 참조변수 = Arrays. copyOf(원본배열, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(arr, arr.length); // 배열 생성, 내용 대입 전부
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		
		// 값 변경 후 확인
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		
		
		
	}
	
	// 로또 번호 생성기
	// 배열을 이용한 중복데이터 제거 + 정렬
	public void createLottoNumber() {
		
		// 1. 1 ~ 45 사이 중복되지 않은 난수 6개 생성
		// 2. 생성된 난수가 오름차순 정렬
		// 3. [5, 11, 13, 18, 24, 25]
		
		// 1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2) 생성된 배열(lotto)을 처음부터 끝까지 순차 접근하는 for문 작성
		for(int i = 0; i< lotto.length; i++) {
			
			// 3) 1 ~ 45 사이 난수 생성
			int random = (int)(Math.random() * 45 + 1); // 1 ~ 45
			
			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = random;
			
			// 5) 중복 검사를 위한 for문 작성
			for(int x = 0; x < i; x++)
				
				// 6) 현재 생성된 난수와 같은 수가
				//	  앞쪽 요소에 있는지 검사
				if(random == lotto[x]) {
					i--;
					// i가 1씩 증가할 때 마다 난수가 하나 생성됨
					// -> 중복 값이 있으면 난수를 새로 하나 더 생성해야 함.
					// -> i값을 인위적으로 1 감소시켜서 난수 발생의 기회를 한번 더 주는 것.
					break;
					// 앞쪽에서 중복데이터를 발견하면
					// 남은 값은 비교할 필요 없다.
					// 효율 향상을 위해서 중복 검사용 for문 종료
					
				}
			
		}
		
		// 정렬은 되어 있지 않지만, 중복 제거가 된 배열이 완성됨
		
		// 7) 오름차순 정렬
		// -> 선택, 삽입, 버블, 퀵 등등
		// --> 자바가 정렬 방법을 미리 만들어서 제공하고 있음
		// Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬됨
		
		Arrays.sort(lotto);
		
		
		// 결과 출력
		System.out.println(Arrays.toString(lotto));
		
		
	}
	
	
	public void practice1() {
		/*
		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

		[실행 화면]
		1 2 3 4 5 6 7 8 9
		짝수 번째 인덱스 합 : 25
		*/
		
		int[]a = new int[9];
		
		
				
		for(int i=0; i<a.length; i++) {
			a[i]=i+1;
		}
		
		System.out.println(Arrays.toString(a));
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				sum += a[i];
			}
		
	}
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice2() {
		/*
		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

		[실행 화면]
		9 8 7 6 5 4 3 2 1
		홀수 번째 인덱스 합 : 20
		*/
		int[]a = new int[9];
		
		
		
		for(int i=0; i<a.length; i++) { //a[0] = a.length(9), a[1] = 8 ... a[a.length] = 0
			a[i]=a.length-i;
		}
		
		System.out.println(Arrays.toString(a));
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(i%2!=0) {
				sum += a[i];
			}
		
	}
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
		
	}
	
	public void practice3() {
		/*
		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		[실행 화면]
		양의 정수 : 5
		1 2 3 4 5
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] a;
		a = new int[input];
		
		
		for(int i=0; i<a.length; i++) {
			a[i]=i+1;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		
	}
	
	public void practice4() {
		/*
		정수 5개를 입력 받아 배열을 초기화 하고
		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

		[실행 화면 1]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 8
		인덱스 : 1
		*/
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		
		for(int i = 0; i < input.length; i++) {
			
			System.out.print("입력 "+i+" : ");
			input[i] = sc.nextInt();
			
	}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false; 
		
		for(int i = 0; i < input.length; i++) {
			
			if(input[i] == search) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
			
		}
		
		if( !flag ) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
	}
		
	public void practice5() {
		/*
		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		[실행 화면]
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8
		i 개수 : 2
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String word = sc.next(); // String word : 입력한 문자열
				
		char[]arr = new char[word.length()];
		
		for(int i = 0; i < arr.length; i++) { //입력한 문자열을 charAt으로 배열
			arr[i] = word.charAt(i);
			
		}
		
		
		System.out.print("문자 : "); 
		char search = sc.next().charAt(0); // char search : 검색하고자 하는 문자
		
		
		int count = 0; // 검색한 횟수 0부터 시작
		String searchIndex = "";
	
		for(int i = 0; i < arr.length; i++) { //검색을 위한 반복문
			
			if(arr[i] == search) { //검색 성공시
				count++; //검색한 글자 개수 카운트	
				searchIndex += i + " ";
			}
		}
		
		
		
		System.out.println(word + "에 "+ search +"가 존재하는 위치(인덱스) : "+ searchIndex);
		
		System.out.println(search + " 개수 : " + count);
		
	}

	public void practice6() {
		/*
		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

		[실행 화면]
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2
		총 합 : 2
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int length = sc.nextInt();
		
		int[] num = new int[length];
		String str = "";
		int sum = 0;
		
		for(int i=0; i<length; i++) {
			
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			num[i] = sc.nextInt();
			str += num[i]+" ";
			sum += num[i];
		}
		
		System.out.println(str);
		System.out.println("총 합 : "+sum);
		
		
		
	}

	public void practice7() {
		/*
		주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.

		[실행 화면]
		주민등록번호(-포함) : 123456-1234567
		123456-1******
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.next();
		
		char[]arr = new char[num.length()];
		
		for(int i = 0; i < arr.length; i++) { //입력한 문자열을 charAt으로 배열
			arr[i] = num.charAt(i);
		
		}
		String show = "";
		
		for(int i = 0; i < 8; i++) {
			show += arr[i];
			
		}
		System.out.println(show+"******");
		
	}

	public void practice8() {
		/*
		3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.

		[실행 화면]
		정수 : 4
		다시 입력하세요.
		정수 : -6
		다시 입력하세요.
		정수 : 5
		1, 2, 3, 2, 1
		*/
		
		
		
	}
		
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.println("더 값을 입력하시겠습니까? y/n : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'y' || ch =='Y') {
				
				System.out.println("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length+addSize];
				
				
				for(int i = 0; i < newArr.length; i++) {
					
					if(i<arr.length) {
						newArr[i] = arr[i];
					} else {
						System.out.println((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
					
				}
				
				arr = newArr;
				
				
				
			}else if(ch=='n'||ch=='N') {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
		
		
}
	
	
	
