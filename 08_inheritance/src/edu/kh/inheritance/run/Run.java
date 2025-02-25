package edu.kh.inheritance.run;

import edu.kh.inheritance.model.dto.BasicPhone;
import edu.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.setBrand("Samsung");
		sp.setModel("Galaxy S20");
		sp.setYear(2020);
		sp.setPrice(1200000);
		sp.setOperatingSystem("Android");
		sp.setStorageCapacity(128);
		
		sp.printInfo();
		
		System.out.println("=================================");
		
		BasicPhone bp = new BasicPhone();
		
		bp.setBrand("Nokia");
		bp.setModel("3310");
		bp.setYear(2000);
		bp.setPrice(100000);
		bp.setHasPhysicalKeyboard(true);
		
		bp.printInfo();
		bp.checkKeyboard();
		
		
	
		
	}

}
