package ru.unlimit.golovach.javacore.lab14.thread;

public class Lab14_6_volatile_interrupt {

	static boolean interruptStatus = false; 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!interruptStatus){
					System.out.println("!");
				}
				System.out.println("Bye");
			}
		});
		
		Thread me = Thread.currentThread();
		thread.start();
		me.sleep(100);
		interruptStatus = true;
	}

}
