/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */

class Customer{
		
	int amount = 10000;
	
	synchronized void withdraw(int amount){
		System.out.println(" going to withdraw the money");
		if(this.amount < amount){
			System.out.println(" low balnce waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" withdraw is completed");
		}
		
	}
	
	
	synchronized void deposit(int amount){
		
		System.out.println(" going to deposit the money");
		
		amount = amount+this.amount;
		System.out.println(" Deposit completed ");
		notify();
	}
	
}


public class ThreadInterCommunicationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final Customer c = new Customer();
		
		new Thread(){
			public void run(){
				c.withdraw(15000);
			}
			
		}.start();
		
	new Thread(){
		public void run(){
			c.deposit(15000);
		}
		
	}.start();
	
}

}
