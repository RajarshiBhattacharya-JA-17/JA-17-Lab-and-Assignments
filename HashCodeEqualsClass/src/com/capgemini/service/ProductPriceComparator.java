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
public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product  product2) {
		// TODO Auto-generated method stub
		if(product1.getPrice() == product2.getPrice())
			return 0;
		else if(product1.getPrice() > product2.getPrice())
			return 1;
		return -1;
	}
}
