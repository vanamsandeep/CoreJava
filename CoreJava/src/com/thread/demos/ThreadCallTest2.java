/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */


//As you can see in the program output that there is no context-switching because here t1 and t2 will be treated as normal object not thread object.


class ThreadCall2 extends Thread{
	
	public void run(){
		
		System.out.println("Observe How values are going to print");
		
		for(int i=0; i<5; i++){
			
			System.out.println(i);
		}
	}
	
}
public class ThreadCallTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadCall2 t1 = new ThreadCall2();
		ThreadCall2 t2 = new ThreadCall2();
		t1.run();
		t2.run();
		
	}

}
