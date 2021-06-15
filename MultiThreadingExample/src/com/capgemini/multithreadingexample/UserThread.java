/**
 * 
 */
package com.capgemini.multithreadingexample;

/**
 * @author Rajarshi
 *
 */
public class UserThread extends Thread {

	//to assign an action or task to a thread
	@Override
	public void run() {
		System.out.println("Thread is in running state...");
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		UserThread ut = new UserThread();
		ut.start();
		try {
			ut.join();
			System.out.println("Thread Id: "+ut.getId());
			System.out.println("Thread Name: "+ut.getName());
		}catch(Exception e) {
			System.out.println(e);
		}
		UserThread ut1 = new UserThread();
		ut1.start();
		UserThread ut2 = new UserThread();
		ut2.start();
		//Thread.sleep(3000);
		//System.out.println("Sleep is done...");
	}
	
}
