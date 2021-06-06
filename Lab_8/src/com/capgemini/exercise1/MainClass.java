/**
 * 
 */
package com.capgemini.exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Rajarshi
 *
 */
public class MainClass {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File input = new File("D:\\Capgemini Internship\\Java_Programs\\Lab_8\\src\\com\\capgemini\\exercise1\\InputFile.txt");
		File output = new File("D:\\Capgemini Internship\\Java_Programs\\Lab_8\\src\\com\\capgemini\\exercise1\\OutputFile.txt");
		
		FileInputStream fIn = new FileInputStream(input);
        FileOutputStream fOut = new FileOutputStream(output);
        CopyDataThread cdt = new CopyDataThread(fIn, fOut);
        cdt.run();
	}

}
