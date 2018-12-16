/**
 * 
 */
package com.kpit.com;

/**
 * @author SHADOW
 *
 */
public class LambdaExpressionForThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runnable r = ()->{
			
			System.out.println("InDirectly implementing run method");
		};
		Thread t1 = new Thread(r);
		t1.start();
		
		
		
	}

}
