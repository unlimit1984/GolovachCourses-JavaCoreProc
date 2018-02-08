package ru.unlimit.golovach.javacore.lab14.thread;

import java.util.concurrent.atomic.AtomicInteger;

import org.w3c.dom.css.Counter;

public class Lab14_1_2BillionCounter {
	private static final int N = 10_000_000;
	
	//1-й вариант неправильный
	private static int counter = 0;
	
	//2-й вариант чуть улучшили, но тоже неправильный
	//private static volatile int counter = 0;
	
	//3-й вариант правильный, поскольку атомарная переменная
	//private static AtomicInteger counter = new AtomicInteger(0);
	
	//4-й вариант правильный добавить synchronized
//	private synchronized static void inc(){//с synchronized и без
//		counter++;
//	}
	
	//3-й вариант 
//	private static void inc(){ 
//		counter.incrementAndGet();
//	}

//	private static void inc(){ 
//		counter++;
//	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t0=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int k=1;k<=N;k++){
					counter++;//counter.addAndGet(1);
				}
			}
		});
		t0.start();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int k=1;k<=N;k++){
					counter++;//counter.addAndGet(1);
				}
			}
		});
		t1.start();
		
		t0.join();
		t1.join();
		
		System.out.println(counter);
		
	}

}
