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
public class VegIDComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable veg1, Vegetable veg2) {
		// TODO Auto-generated method stub
		if(veg1.getVegId() == veg2.getVegId())
			return 0;
		return 1;
	}

}
