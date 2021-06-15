/**
 * 
 */
package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Product;

/**
 * @author Rajarshi
 *
 */
public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product  product2) {
		// TODO Auto-generated method stub
		if(product1.getName().equalsIgnoreCase(product2.getName()))
			return 1;
		else
			return 0;
	}

}
