/**
 * 
 */
package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;

import com.capgemini.model.Product;

/**
 * @author Rajarshi
 *
 */
public class ProductManager {

	ArrayList<Product> prodList = new ArrayList<Product>();
	public void createProduct() {
		
		Product p = new Product(1234, "Pen", 50);
		Product p1 = new Product(1235, "Pencil", 35);
		prodList.add(p);
		prodList.add(p1);
		
	}
	
	public void compareProducts() {
		
		if(prodList.get(0).equals(prodList.get(1))){
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
	
	public void sortProducts() {
		
		Collections.sort(prodList);
		System.out.println();
		System.out.println("Sorted List");
		System.out.println();
		for(Product p : prodList) {
			System.out.println(p.toString());
		}
	}
	
	public void sortProductUsingID() {
		Collections.sort(prodList, new ProductIDComparator());
		System.out.println("===============");
		System.out.println("Sorted List using ID");
		System.out.println("===============");
		for(Product p : prodList) {
			System.out.println(p.getPid()+"\t\t"
					+ p.getName()+"\t\t"
					+p.getPrice());
		}
	}
	
	public void sortProductUsingName() {
		Collections.sort(prodList, new ProductNameComparator());
		System.out.println("===============");
		System.out.println("Sorted List using Name");
		System.out.println("===============");
		for(Product p : prodList) {
			System.out.println(p.getPid()+"\t\t"
					+ p.getName()+"\t\t"
					+p.getPrice());
		}
	}
	
	public void sortProductUsingPrice() {
		Collections.sort(prodList, new ProductPriceComparator());
		System.out.println("===============");
		System.out.println("Sorted List using Price");
		System.out.println("===============");
		for(Product p : prodList) {
			System.out.println(p.getPid()+"\t\t"
					+ p.getName()+"\t\t"
					+p.getPrice());
		}
	}

}
