package com.techment.CollectionsPractice.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	
	String name;
	int id,price,quantity;
	public Product(String name, int id, int price, int quantity) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}
	
}

class QuantitySortDecreasing implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.quantity == o2.quantity)
			return 0;
		else if(o1.quantity > o2.quantity)
			return -1;
		else 
			return 1;
	}
}

class PriceSort implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price == o2.price)
			return 0;
		else if(o1.price > o2.price)
			return 1;
		else 
			return -1;
	}
}

public class ProductTask {

	public static void main(String[] args) {

//		create a product class:
//			id,name,price,quantity
//
//			->display all the product 
//			->display only those product whose price is greater than 5000
//			->sort the product quantity in descending
//			->sort the product price in ascending 
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("TV", 1, 50000, 5));
		products.add(new Product("Sofa", 2, 10000, 10));
		products.add(new Product("Chair", 3, 1000, 15));
		products.add(new Product("Bedsheet", 4, 900, 20));
		
		for(Product prods : products) {
			System.out.println("Product [Name=" + prods.name + ", id=" + prods.id + ", price=" + prods.price + ", Quantity=" + prods.quantity + "]");
		}
		
		System.out.println("-------------- Price More than 5000 --------------");
	
		for(Product prods : products) {
			if(prods.price > 5000) {
				System.out.println("Product [Name=" + prods.name + ", id=" + prods.id + ", price=" + prods.price + ", Quantity=" + prods.quantity + "]");
			}
		}
		
		System.out.println("-------------- Sorting Quantity in Descening -------------");
		Collections.sort(products, new QuantitySortDecreasing());
		for(Product prods : products) {
			System.out.println("Product [Name=" + prods.name + ", id=" + prods.id + ", price=" + prods.price + ", Quantity=" + prods.quantity + "]");
		}
		
		System.out.println("----------------- Sorting by Price ---------------------");
		Collections.sort(products, new PriceSort());
		for(Product prods : products) {
			System.out.println("Product [Name=" + prods.name + ", id=" + prods.id + ", price=" + prods.price + ", Quantity=" + prods.quantity + "]");
		}
	}

}
