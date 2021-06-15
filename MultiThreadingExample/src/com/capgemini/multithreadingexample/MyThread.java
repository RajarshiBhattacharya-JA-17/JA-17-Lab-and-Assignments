/**
 * 
 */
package com.capgemini.multithreadingexample;

/**
 * @author Rajarshi
 *
 */
public class MyThread implements Runnable {

	String name;
	Thread t;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5;i>0;i--)
		{
			System.out.println(name+" : "+i);
		}
		
	}
	
	public MyThread(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
		System.out.println("hiii");
	}
}
