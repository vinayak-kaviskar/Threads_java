package com.kpit.com;

public class JoinExample2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoinExample2 obj1 = new JoinExample2();
		JoinExample2 obj2 = new JoinExample2();
		JoinExample2 obj3 = new JoinExample2();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		Thread thread3 = new Thread(obj3);
		
		thread1.start();
		
		try {
			thread1.join(1500); //  wait other thread for 1500 miliiseconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		thread2.start();
		thread3.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
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

}
