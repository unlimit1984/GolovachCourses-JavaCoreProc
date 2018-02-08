package ru.unlimit.golovach.javacore.lab14.thread;

public class Lab14_3_interrupt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Thread t = new Thread();
		t.start();
		t.interrupt();
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println("!");
					if(Thread.currentThread().isInterrupted())
					//if(Thread.interrupted())
						break;
//					try {
//						Thread.sleep(250);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}
				System.out.println("End");
			}
		});
		thread.start();
		
		Thread.sleep(1000);
		thread.interrupt();
	}
}
