/**
 * 
 */
package com.coreJava.Examples;

/**
 * @author sv8986
 *
 */
public class InheritanceParent {
	
	private int gear ;
	private int speed;
	
	public InheritanceParent(int g, int s){
		
		gear= g;
		speed =s;
	}
	
	public void parentDisplay(){
		
		System.out.println(" the values of gear gaer is "+gear +"speed value is "+speed);
	}

}
