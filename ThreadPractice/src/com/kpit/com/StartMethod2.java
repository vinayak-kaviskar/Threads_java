package com.kpit.com;

public class StartMethod2 implements Runnable {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StartMethod2 method2 = new StartMethod2();
		Thread t1 = new Thread(method2);
		
		t1.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread started by implementing Runnable interface");
	}

}
