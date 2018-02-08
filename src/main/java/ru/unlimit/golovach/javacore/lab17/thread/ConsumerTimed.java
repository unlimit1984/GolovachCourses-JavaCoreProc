package ru.unlimit.golovach.javacore.lab17.thread;

import java.util.concurrent.TimeoutException;

public class ConsumerTimed implements Runnable {
	
	private SingleElementBuffer_TimeOut buffer;
	private final long timeout;
	
	public ConsumerTimed(SingleElementBuffer_TimeOut buffer, long timeout) {
		this.buffer = buffer;
		this.timeout = timeout;
	}
	
	@Override
	public void run() {
		while(true){
			try{
				Integer elem=buffer.get(timeout);
				System.out.println(elem+" consumed");
			} catch (InterruptedException e){
				System.out.println(Thread.currentThread().getName()+" stopped");
				return;
			} catch (TimeoutException e) {
				System.out.println(Thread.currentThread().getName()+" time out");
				return;
			}
		}

	}

}
