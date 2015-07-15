/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */

class ThreadB extends Thread{
	 int total;
	public void run(){
		synchronized (this) {
			
			for(int i=0; i<5; i++){
				 total= total+i;
			}
			notify();
		}
	}
}


public class WaitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println(" waiting for the notify call");
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" the total value is "+b.total);
		}
		
		
	}

}
