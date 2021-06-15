/**
 * 
 */
package com.capgemini;

import com.capgemini.service.ProductManager;

/**
 * @author Rajarshi
 *
 */
public class ProductMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductManager pm = new ProductManager();
		pm.createProduct();
		pm.compareProducts();
		pm.sortProducts();
		pm.sortProductUsingID();
		pm.sortProductUsingName();
		pm.sortProductUsingPrice();
	}

}
