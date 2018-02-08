package ru.unlimit.golovach.javacore.lab15.thread;

import java.util.HashMap;

public class Lab15_3_Priority {
	
	public static volatile boolean stop=false;
	
	public static void main(String[] args) throws InterruptedException {
		final Thread[] threads= new Thread[32];
		for(int k=0;k<32;k++){
			final int finalK=k;
			threads[k] = new Thread(new Runnable() {
				@Override
				public void run() {
					for(long index=0; index<1_000_000_000_000L;index++){
						if(stop){
							System.out.println(finalK+":"+index);
							break;
						}
					}
				}
			});
		}
		for(int k=0;k<32;k++){
			threads[k].setPriority(k<16 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY);
		}
		for(int k=0;k<32;k++){
			threads[k].start();
		}
		Thread.sleep(100);
		stop=true;
	}
}
