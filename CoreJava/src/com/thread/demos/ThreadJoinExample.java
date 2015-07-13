/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */
//The join() method waits for a thread to die. In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.
class JoinThreadExample extends Thread{
	
	public void run(){
		
		for(int i=0; i<10 ; i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoinExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JoinThreadExample t1 = new JoinThreadExample();
		JoinThreadExample t2 = new JoinThreadExample();
		JoinThreadExample t3 = new JoinThreadExample();
		t1.start();
		
		try {
			t1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}

}
