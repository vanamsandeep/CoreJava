/**
 * 
 */
package com.coreJava.Examples;

/**
 * @author sv8986
 *
 */
public class InheritanceChild extends InheritanceParent{

	int seatHeight;
	
	
	public InheritanceChild(int g, int s, int sh) {
		super(g, s);
		seatHeight = sh;
	}
	
	public void display(){
		
		System.out.println(" the values are "+seatHeight);//+" gear value is "+gear+" speed value is "+ speed );
		parentDisplay();
	}

}
