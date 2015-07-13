/**
 * 
 */
package com.thread.demos;

import java.io.IOException;

/**
 * @author sv8986
 *
 */
public class RuntimeExample {

	/**
	 * @param args
	 * Runtime is available in java.lang package and this explains the methods in it
	 */
	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad");
			System.out.println("The total memory processor "+r.totalMemory());
			System.out.println("Free memory is "+r.freeMemory());
			System.out.println("Avaliable Processors "+ r.availableProcessors());
			
			//CHecking the free space after creating 1000 classes
			
			for(int i=0; i<10000; i++){
				new RuntimeExample();
			}
			System.out.println("After creating the 1000 new classes ");
			System.out.println("Free memory is "+r.freeMemory());
			System.gc();
			System.out.println(" check the Free memory after GC is invoked");
			System.out.println("Free memory is "+r.freeMemory());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
