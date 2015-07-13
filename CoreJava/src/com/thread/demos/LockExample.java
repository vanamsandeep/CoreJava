/**
 *comments
 *Every object in java has one incentric lock or mutex 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */
public class LockExample {

	/**
	 * @param args
	 */
	private volatile int count =0;
	
	public synchronized void increment(){
		count++;
	}
	
	public static void main(String[] args) {
		
		LockExample le = new LockExample();
		le.doWork();
		
	}
	
	public void doWork(){

		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<10000; i++){
					increment();
				}
			}
		});
		
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10000; i++){
					increment();
					
				}
			}
		});
		thread.start();
		thread2.start();
		
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(" the value of Count is "+count);
	}

}
