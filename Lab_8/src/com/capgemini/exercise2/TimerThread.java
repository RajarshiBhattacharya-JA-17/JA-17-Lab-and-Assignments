/**
 * 
 */
package com.capgemini.exercise2;

import java.time.LocalTime;

/**
 * @author Rajarshi
 *
 */
public class TimerThread extends Thread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
