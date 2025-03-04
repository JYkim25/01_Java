package com.toyFactory.model.dto;

public class Toy {

	private String name;
	private int availAge;
	private int price;
	private String color;
	private String manufacture;
	private String[] materials;
	
	public Toy() {}

	public Toy(String name, int availAge, int price, String color, String manufacture, String... materials) {
		super();
		this.name = name;
		this.availAge = availAge;
		this.price = price;
		this.color = color;
		this.manufacture = manufacture;
		this.materials = materials;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvailAge() {
		return availAge;
	}

	public void setAvailAge(int availAge) {
		this.availAge = availAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String[] getMaterials() {
		return materials;
	}

	

	
	
	
	
	
}

