/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */
class DemonExample extends Thread{
	
	public void run(){
		
		if(Thread.currentThread().isDaemon()){
			System.out.println("It is a deamon Thread");
		}else{
			System.out.println(" THread is not a deamon thread");
		}
		
	}
	
}


public class DeamonThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DemonExample t1 = new DemonExample();
		
		t1.setDaemon(true);
		t1.start();
		
		
	}

}
