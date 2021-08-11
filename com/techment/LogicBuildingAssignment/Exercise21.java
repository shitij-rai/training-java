package com.techment.LogicBuildingAssignment;

import java.util.ArrayList;

class Product{
	String name;
	int id , price;
	public Product(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class Exercise21 {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();
	
		products.add(new Product("Football", 10, 800));
		products.add(new Product("Badminton", 11, 1200));
		products.add(new Product("Shirt", 12, 2000));
		
		for(Product prods : products) {
			System.out.println("[Name=" + prods.name + ", id=" + prods.id + ", price=" + prods.price +"]");
		}
	}

}
