/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */

/**
 * In this example check the thread name 
	by running the code with t.start() and t.run() seperately
	If you run the thread with out starting It will not create a seperate callStack, rather it will call from main therad call
 *
 */

class ThreadCall extends Thread{
	
	public void run(){
		System.out.println("thread name is "+ Thread.currentThread());
		System.out.println(" Child Thread called ");
	}
}


public class ThreadCallTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadCall t = new ThreadCall();
		
		t.run(); 
		t.setName("Sandeep");
		t.start();
		
	}

}
