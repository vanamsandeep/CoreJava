/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */

class myThread extends Thread{

	public void run() {
		
		for(int i=0; i<5;i++){
			System.out.println("Printing Mythread class");
			try {
				myThread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
} 


public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			myThread mythread = new myThread();
			mythread.start();
			
	}

}
