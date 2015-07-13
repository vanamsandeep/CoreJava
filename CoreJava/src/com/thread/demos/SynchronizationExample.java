/**
 * 
 */
package com.thread.demos;

/**
 * @author sv8986
 *
 */
class PrintTable{
	
	//In Below method remove the keyword synchronized and check the out put
	synchronized void printTable(int n){
		
		for(int i=0; i<5; i++){
			System.out.println(" Table value "+n*i);
		}
	}
	
	//below code is example for synchronized block
/*	void printTable(int n){
		
		synchronized (this) {
			for(int i=0; i<5; i++){
				System.out.println(" Table value "+n*i);
			}
		}
	}*/
	
}

class Thread1 extends Thread{
	
	PrintTable t;
	Thread1(PrintTable t){
		this.t= t;
	}
	public void run(){
		
		t.printTable(5);
	}
	
}

class Thread2 extends Thread{
	
	PrintTable t;
	
	Thread2(PrintTable t){
		this.t =t;
	}
	
	
	public void run(){
		
		t.printTable(500);
	}
	
}

public class SynchronizationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrintTable obj = new PrintTable();
		
		Thread1 t = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t.start();
		t2.start();
		
	}

}
