package ru.unlimit.golovach.javacore.lab16.thread;
public class Lab16_two_synchronized_App {
	public static void main(String[] args) throws InterruptedException {
		
		Object ref = new Object();
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (ref) {
					try {
						System.out.println("Run:WAIT ... ");
						ref.wait();
						System.out.println("Run: THANKS");
						
					} catch (InterruptedException e) {
						/*NOP*/
					}
				}
			}
		}).start();

		System.out.println("MAIN:sleep");
		Thread.sleep(2000);
		
		System.out.println("MAIN:notify");
		
		synchronized (ref) {
			ref.notify();
		}
	}
}
