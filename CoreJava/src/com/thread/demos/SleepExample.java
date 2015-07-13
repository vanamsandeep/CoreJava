/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */
class SleepThread implements Runnable{
	
	public void run(){
		for(int i=0; i<10; i++){
			
			System.out.println("Testing sleep method of a thread "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}



public class SleepExample {

	/**
	 * @param args
	 */
	public static void main(String... args) {

		
		SleepThread st = new SleepThread();
		SleepThread st2 = new SleepThread();
		Thread t2 = new Thread(st2);
		Thread t = new Thread(st);
		t.start();//t.start();
		t2.start(); // try to execute this with this line comment once.
		
	}

}
