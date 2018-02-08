package ru.unlimit.golovach.javacore.lab15.thread;

public class Lab15_4_Demon_Hello_By {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println("Hello");
				}
				
			}
		});
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(50);
		System.out.println("Bye");

	}

}
