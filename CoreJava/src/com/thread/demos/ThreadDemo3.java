package com.thread.demos;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			public void run() {
				for(int i=0; i<5;i++){
					
					System.out.println("Printing runnable in Main method");
					System.out.println(ThreadGroup.class.getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	
		t.start();
		System.out.println(t.getThreadGroup().getName());
	}

}
