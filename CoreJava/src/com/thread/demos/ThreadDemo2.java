package com.thread.demos;


class Runner implements Runnable{

	public void run() {
		
		for(int i=0; i<5; i++){
			System.out.println("Printing Runner class thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
} 

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runner());
		t.start();
		
	}

}
