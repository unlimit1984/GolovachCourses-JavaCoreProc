package ru.unlimit.golovach.javacore.lab17.thread;

public class Lab17_2_Interrupt {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread thread=Thread.currentThread();
				while(true){
					System.out.println(thread.isInterrupted());
					for(long k=0;k<1_000_000_000L;k++){
						
					}
				}
				
			}
		});
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();

	}

}
