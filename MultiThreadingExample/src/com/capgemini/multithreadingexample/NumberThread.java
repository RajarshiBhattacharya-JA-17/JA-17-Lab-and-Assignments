/**
 * 
 */
package com.capgemini.multithreadingexample;

/**
 * @author Rajarshi
 *
 */
public class NumberThread implements Runnable {

	String tname;
	Thread t;
	
	public NumberThread(String threadName) {
		System.out.println("In Constructor...");
		tname = threadName;
		t = new Thread(this, threadName);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(tname);
	}
	
	public static void main(String[] args) {
		new NumberThread("ABCD");
		System.out.println("In Main Method...");
	}
}
