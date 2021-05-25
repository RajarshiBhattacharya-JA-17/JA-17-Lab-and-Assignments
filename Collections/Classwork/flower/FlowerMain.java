package com.capgemini.flower;

//Using Hash Set

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class FlowerMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Flower> flowerList = new HashSet<Flower>();
		Flower flower;
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		
		while(ch == 'y')
		{
			System.out.println("Enter your choice");
			System.out.println("1) Add Flower Details\n"
					+ "2) Delete Flower\n"
					+ "3) Display Flower List\n");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1://Create Flower List
				System.out.println("How many flowers do you wish to add?:");
				int n = sc.nextInt();
				for(int i=0; i<n; i++)
				{
					System.out.println("Enter Details for flower "+i+":");
					System.out.println("Enter Flower ID:");
					int id = sc.nextInt();
					System.out.println("Enter Flower Name:");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Enter Price per Kg:");
					double price = sc.nextDouble();
					System.out.println("Enter Quantity:");
					int qty = sc.nextInt();
					
					flowerList.add(new Flower(id, name, price, qty));
				}
				break;
			case 2://Delete Flower
				Iterator<Flower> flwitr = flowerList.iterator();
				System.out.println("Enter Flower ID:");
				int id = sc.nextInt();
				boolean rem = false;
				while(flwitr.hasNext())
				{
					Flower flr = flwitr.next();
					if(flr.getfId() == id)
					{
						rem = true;
						if(flr.getQty() <= 0)
						{
							flowerList.remove(flr);
							System.out.println("Removed Successfully");
						}
						else
							System.out.println("Cannot Remove since quantity is not 0!!!");
					}
				}
				if(!rem)
					System.out.println("Could not find a match!!!");
				
				System.out.println();
				break;
			case 3://Display Flower List
				Iterator<Flower> flrDisp = flowerList.iterator();
				while(flrDisp.hasNext())
				{
					Flower flr = flrDisp.next();
					System.out.println("Flower ID: " + flr.getfId()
					+ ", Flower Name: " + flr.getfName()
					+ ", Price Per Kg: " + flr.getPricePerKg()
					+ ", Quantity: " + flr.getQty());
					
					System.out.println();
				}
				break;
			default:System.out.println("Incorrect Choice!!!");
				System.out.println();
			}
			
			System.out.println("Do you wish to continue?(y/n): ");
			ch = sc.next().charAt(0);
		}
		
		sc.close();
	}

}
