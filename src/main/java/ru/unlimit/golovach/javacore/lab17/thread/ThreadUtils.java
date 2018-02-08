package ru.unlimit.golovach.javacore.lab17.thread;

public class ThreadUtils {

	public void sleep(long sleepTime){
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
