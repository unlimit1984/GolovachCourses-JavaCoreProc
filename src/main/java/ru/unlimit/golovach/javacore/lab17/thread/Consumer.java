package ru.unlimit.golovach.javacore.lab17.thread;

public class Consumer implements Runnable {
	
	private SingleElementBuffer buffer;
	
	public Consumer(SingleElementBuffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while(true){
			try{
				Integer elem=buffer.get();
				System.out.println(elem+" consumed");
			}
			catch (InterruptedException e){
				System.out.println(Thread.currentThread().getName()+" stopped");
				return;
			}
		}

	}

}
