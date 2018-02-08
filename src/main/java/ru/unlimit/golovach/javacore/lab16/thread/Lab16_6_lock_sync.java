package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_6_lock_sync {

	public static void main(String[] args) throws InterruptedException {
		
		final Object lock = new Object();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("RUN started");
				synchronized(lock){
					System.out.println("RUN: I'm in!");
					while(true){}
				}
			}
		}).start();
		System.out.println("MAIN: start sleep");
		System.out.println(1000);
		System.out.println("MAIN: stop sleep");
		Thread.sleep(1000);
		synchronized (lock) {
			System.out.println("MAIN: I'm in!");
		}
	}

}
