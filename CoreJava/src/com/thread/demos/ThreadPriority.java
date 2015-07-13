/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */
class ThreadPriorityTest extends Thread{
	
	public void run(){
		System.out.println("The thread Name is "+Thread.currentThread()+"The thread priority is "+Thread.currentThread().getPriority());
	}
}

public class ThreadPriority {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadPriorityTest t1 = new ThreadPriorityTest();
		ThreadPriorityTest t2 = new ThreadPriorityTest();
		ThreadPriorityTest t3 = new ThreadPriorityTest();
		ThreadPriorityTest t4 = new ThreadPriorityTest();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(10); // If you set threadPriority more than 10 you will get an error IllegalArgumentException
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
