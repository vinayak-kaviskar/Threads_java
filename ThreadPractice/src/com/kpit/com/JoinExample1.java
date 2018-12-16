package com.kpit.com;

public class JoinExample1 extends Thread{

	
	public void run() {
		
		for(int i=0;i<=5;i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() +":"+i);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinExample1 thread1 = new JoinExample1();
		JoinExample1 thread2 = new JoinExample1();
		JoinExample1 thread3 = new JoinExample1();
		thread1.start();
		
		try {
			thread1.join(); // wait other threads till this thread executes
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		thread2.start();
		thread3.start();

	}

}
