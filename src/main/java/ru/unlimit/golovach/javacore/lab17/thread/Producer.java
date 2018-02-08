package ru.unlimit.golovach.javacore.lab17.thread;

public class Producer implements Runnable {

	private int startValue;
	private final int period;
	private SingleElementBuffer buffer;
	
	public Producer(int startValue, int period, SingleElementBuffer buffer) {
		this.startValue=startValue;
		this.period=period;
		this.buffer=buffer;
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println(startValue+" produced");
				buffer.put(startValue++);
				Thread.sleep(period);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" stopped");
				break;
			}
		}

	}

}
