/**
 * 
 */
package com.capgemini;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.model.Vegetable;
import com.capgemini.service.VegetableManager;

/**
 * @author Rajarshi
 *
 */
public class VegetableMain {

	/**
	 * @param args
	 */
	
	static Scanner sc = new Scanner(System.in);
	static int vegId;
	static String vegName;
	static double vegPrice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VegetableManager vm = new VegetableManager();
    	char ch = 'y';
    	
		ArrayList<Vegetable> vegList = new ArrayList<Vegetable>();
    	
    	while(ch == 'y') {
    		
    		System.out.println("Enter Your Choice:");
    		System.out.println("1) Add Vegetable\n"
    				+ "2) Display Vegetable Details Using Veg ID\n"
    				+ "3) Update Vegetable Details\n"
    				+ "4) Delete Vegetable\n"
    				+ "5) Sort Vegetables Based on Veg Name\n"
    				+ "6) Sort Using Comparator");
    		int choice = sc.nextInt();
    		//Switch-Case Block to choose Options
    		switch(choice)
    		{
    		case 1://Add Book Details
    			readDetails();
    			vegList = vm.addVeg(vegId, vegName, vegPrice);
    			System.out.println();
    			break;
    		case 2://Display Book Details Using Book ID
    			readvegID();
    			vm.displayVeg(vegList, vegId);
    			System.out.println();
    			break;
    		case 3://Update Book Details
    			readDetails();
    			vm.updateVeg(vegList, vegId, 
						vegName, vegPrice);
    			System.out.println();
    			System.out.println("Updated Successfully");
    			System.out.println();
    			break;
    		case 4://Delete Book
    			readvegID();
    			vm.deleteVeg(vegList, vegId);
    			System.out.println();
    			System.out.println("Vegetable Deleted Successfully");
    			System.out.println();
    			break;
    		case 5://Sort Based on Veg Name
    			vm.sortVegetable(vegList);
    			break;
    		case 6://Sort Using Comparator
    			vm.sortVegUsingID(vegList);
    			vm.sortVegUsingName(vegList);
    			vm.sortVegUsingPrice(vegList);
    			break;
    		default:System.out.println("Invalid Choice...");
    			System.out.println();
    			break;
    		}
    		
    		System.out.println("Do you wish to continue?(y/n)");
    		ch = sc.next().charAt(0);
    		System.out.println();
    	}
    	
    	System.out.println("Thank You...");
	}
	
	private static void readvegID() {
		// TODO Auto-generated method stub
		System.out.println("Enter Vegetable ID:");
		vegId = sc.nextInt();
	}

	private static void readDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Vegetable Details");
		readvegID();
		System.out.println("Enter Vegetable Name:");
		sc.nextLine();
		vegName = sc.nextLine();
		System.out.println("Enter Vegetable Price:");
		vegPrice = sc.nextDouble();
	}

}
