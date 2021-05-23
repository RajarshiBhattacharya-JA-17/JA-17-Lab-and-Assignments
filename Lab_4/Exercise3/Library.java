package com.Capgemini;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book("Christopher Paolini", 100567, "Eragon", 20000);
		b1.addItems();
		System.out.println(b1.toString());
		
		System.out.println();
		
		JournalPaper jp1 = new JournalPaper(2019, "Mark Raiola", 129805, "Revolutionizing Mathematics", 12000);
		System.out.println(jp1.toString());
		
		System.out.println();
		
		Video v1 = new Video(198750, "Inception", 500000, 126000, "Christopher Nolan", "Sci-Fi", 2007);
		System.out.println(v1.toString());
		
		System.out.println();
		
		CD cd = new CD(145609, "Shutter Island", 300000, "Leonardo Di Caprio", "Thriller", 125000);
		System.out.println(cd.toString());
	}
}
