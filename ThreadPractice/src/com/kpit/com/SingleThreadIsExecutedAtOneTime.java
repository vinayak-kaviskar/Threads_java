package com.kpit.com;

public class SingleThreadIsExecutedAtOneTime  extends Thread{
	
	
	
	public void run() {
		
		
		for(int i = 0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleThreadIsExecutedAtOneTime obj1 = new SingleThreadIsExecutedAtOneTime();
		SingleThreadIsExecutedAtOneTime obj2 = new SingleThreadIsExecutedAtOneTime();
		//obj1.setName("thread1");
	//	obj2.setName("thread2");
		obj1.start();
		obj2.start();
		
		
	}

}
