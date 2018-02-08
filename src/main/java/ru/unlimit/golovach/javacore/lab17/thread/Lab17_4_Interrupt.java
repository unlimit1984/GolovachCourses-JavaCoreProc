package ru.unlimit.golovach.javacore.lab17.thread;

public class Lab17_4_Interrupt {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println("Hello, Java!");
					try {
						Thread.sleep(1000000);
					} catch (InterruptedException e) {
						System.out.println("Interrupted");
						return;
					}
				}
				
			}
		});
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
	}

}
