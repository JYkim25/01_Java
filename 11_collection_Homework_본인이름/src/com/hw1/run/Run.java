package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		List<Friend> frList = new ArrayList<>();
		
		
		frList.add(new Friend("짱구"));
		frList.add(new Friend("철수"));
		frList.add(new Friend("유리"));
		frList.add(new Friend("훈이"));
		frList.add(new Friend("맹구"));
		
		
		Friend.pickLeader(frList);
		

	}

}
