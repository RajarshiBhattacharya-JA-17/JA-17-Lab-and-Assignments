/**
 * 
 */
package com.capgemini.product;

import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class ProductMain {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductManagementJDBC pms = new ProductManagementJDBC();
		pms.getConnection();
		//pms.createTable();
		char ch = 'y';
		int choice = 0;
		while(ch == 'y') {
			System.out.println("Enter Choice:");
			System.out.println("1) Insert Product\n"
					+ "2) Display All Products\n"
					+ "3) Display Product By PID\n"
					+ "4) Update Product\n"
					+ "5) Delete Product\n"
					+ "6) Exit\n");
			choice = sc.nextInt();
			switch(choice) {
			case 1:pms.insertData();
			System.out.println();
			break;
			case 2:pms.getProducts();
			System.out.println();
			break;
			case 3:pms.getProductByID();
			System.out.println();
			break;
			case 4:pms.updateProduct();
			System.out.println();
			break;
			case 5:pms.deleteProduct();
			System.out.println();
			break;
			case 6:ch = 'n';
			System.out.println();
			break;
			default:System.out.println("Invalid Choice...");
			System.out.println();
			break;
			}
		}
		
		System.out.println("Thank You");
		System.out.println();
		
		//pms.insertData();
		//pms.getProducts();
		//pms.getProductByID();
	}

}
