package ru.unlimit.golovach.javacore.lab17.thread;

import java.util.concurrent.TimeoutException;

public class ProducerTimed implements Runnable {

	private int startValue;
	private final int period;
	private SingleElementBuffer_TimeOut buffer;
	private final long timeout;
	
	public ProducerTimed(int startValue, int period, SingleElementBuffer_TimeOut buffer, long timeout) {
		this.startValue=startValue;
		this.period=period;
		this.buffer=buffer;
		this.timeout=timeout;
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println(startValue+" produced");
				buffer.put(startValue++,timeout);
				Thread.sleep(period);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" stopped");
				return;
			} catch (TimeoutException e) {
				System.out.println(Thread.currentThread().getName()+" time out");
				return;
			}
		}

	}

}
