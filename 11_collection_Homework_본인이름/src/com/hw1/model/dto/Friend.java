package com.hw1.model.dto;

import java.util.List;
import java.util.Random;

public class Friend {

	private String name;
	
	
	public Friend() {}


	public Friend(String name) {
		super();
		this.name = name;
	}

	public static void pickLeader(List<Friend> frList) {
		 Random pick = new Random(); 
		 int rannum = pick.nextInt(frList.size());
	        Friend captain = frList.get(rannum);  // 해당 인덱스의 친구 객체 선택
	        System.out.println(captain.getName()+"가 떡잎방범대 대장이다!");
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
