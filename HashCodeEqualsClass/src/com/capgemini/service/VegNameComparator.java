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
public class VegNameComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable veg1, Vegetable veg2) {
		// TODO Auto-generated method stub
		if(veg1.getVegName().equals(veg2.getVegName()))
			return 0;
		else
			return 1;
	}

}
