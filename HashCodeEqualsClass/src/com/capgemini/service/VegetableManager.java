/**
 * 
 */
package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.capgemini.model.Vegetable;

/**
 * @author Rajarshi
 *
 */
public class VegetableManager {

	public VegetableManager() {
		
	}
	
	ArrayList<Vegetable> vegList = new ArrayList<Vegetable>();
	
	public ArrayList<Vegetable> addVeg(int vegId, String vegName, 
			double vegPrice) {

		Vegetable veg = new Vegetable(vegId, vegName, vegPrice);
		if(checkIfVegetableAlreadyExists(vegId)) {
			vegList.add(veg);
		}
		return vegList;
	}
	
	private boolean checkIfVegetableAlreadyExists(int vegId) {
		// TODO Auto-generated method stub
		Iterator<Vegetable> vegiter = vegList.iterator();
		while(vegiter.hasNext()) {
			Vegetable v = vegiter.next();
			if(v.getVegId() == vegId) {
				System.out.println("Vegetable Already Exists");
				return false;
			}
		}
		return true;
	}

	public void displayVeg(ArrayList<Vegetable> vegList,
			int vegId) {
		
		
		Iterator<Vegetable> vegiter = vegList.iterator();
		while(vegiter.hasNext()) {
			Vegetable v = vegiter.next();
			if(v.getVegId() == vegId) {
				System.out.println("Veg ID: "+v.getVegId()
						+", Veg Name: "+v.getVegName()
						+", Veg Price: "+v.getVegPrice());
				return;
			}
		}
		
		System.out.println("Vegetable Not Found...");
	}
	
	public void updateVeg(ArrayList<Vegetable> vegList,
			int vegId, String vegName, 
			double vegPrice) {
		
		Iterator<Vegetable> vegiter = vegList.iterator();
		while(vegiter.hasNext()) {
			Vegetable v = vegiter.next();
			if(v.getVegId() == vegId) {
				v.setVegName(vegName);
				v.setVegPrice(vegPrice);
				return;
			}
		}
		System.out.println("Vegetable not Found...");
	}
	
	public void deleteVeg(ArrayList<Vegetable> vegList,
			int vegId) {
		
		Iterator<Vegetable> vegiter = vegList.iterator();
		while(vegiter.hasNext()) {
			Vegetable v = vegiter.next();
			if(v.getVegId() == vegId) {
				vegList.remove(v);
				return;
			}
		}
		System.out.println("Vegetable not Found...");
	}
	
	public void sortVegetable(ArrayList<Vegetable> vegList) {
			
			Collections.sort(vegList);
			System.out.println();
			System.out.println("Sorted List");
			System.out.println();
			for(Vegetable v : vegList) {
				System.out.println(v.toString());
			}
	}

	public void sortVegUsingID(ArrayList<Vegetable> vegList) {
		// TODO Auto-generated method stub
		Collections.sort(vegList, new VegIDComparator());
		System.out.println("===============");
		System.out.println("Sorted List using ID");
		System.out.println("===============");
		for(Vegetable p : vegList) {
			System.out.println(p.getVegId()+"\t\t"
					+ p.getVegName()+"\t\t"
					+p.getVegPrice());
		}
	}

	public void sortVegUsingName(ArrayList<Vegetable> vegList) {
		// TODO Auto-generated method stub
		Collections.sort(vegList, new VegNameComparator());
		System.out.println("===============");
		System.out.println("Sorted List using Name");
		System.out.println("===============");
		for(Vegetable p : vegList) {
			System.out.println(p.getVegId()+"\t\t"
					+ p.getVegName()+"\t\t"
					+p.getVegPrice());
		}
	}

	public void sortVegUsingPrice(ArrayList<Vegetable> vegList) {
		// TODO Auto-generated method stub
		Collections.sort(vegList, new VegPriceComparator());
		System.out.println("===============");
		System.out.println("Sorted List using Price");
		System.out.println("===============");
		for(Vegetable p : vegList) {
			System.out.println(p.getVegId()+"\t\t"
					+ p.getVegName()+"\t\t"
					+p.getVegPrice());
		}
	}

}
