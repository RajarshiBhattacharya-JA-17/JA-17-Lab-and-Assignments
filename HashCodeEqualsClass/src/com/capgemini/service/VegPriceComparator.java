/**
 * 
 */
package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Vegetable;

/**
 * @author Rajarshi
 *
 */
public class VegPriceComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable veg1, Vegetable veg2) {
		// TODO Auto-generated method stub
		if(veg1.getVegPrice() == veg2.getVegPrice())
			return 0;
		else if(veg1.getVegPrice() > veg2.getVegPrice())
			return 1;
		return -1;
	}

}
