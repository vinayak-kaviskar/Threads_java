package com.kpit.com;

public class StartMethod extends Thread{

	
	
	public void run() {
		
		
		System.out.println("Running thread");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		StartMethod method = new StartMethod();
		method.start();
	//	method.start(); throws Illegal thread state exception
		
	}

}
