package com.kpit.com;

public class YieldMethod extends Thread{
	
	
	
	public void run() {
		
		
		for(int i=0;i<5;i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		YieldMethod thread1 = new YieldMethod();
		YieldMethod thread2 = new YieldMethod();
		YieldMethod thread3 = new YieldMethod();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		for(int i =0;i<5;i++) {
			
			try {
				Thread.sleep(500);
				thread2.yield();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
		
		
		
		
		

	}

}
