package ru.unlimit.golovach.javacore.lab14.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Lab14_2_VolatileExample {

	static volatile boolean in0 = false;
	static volatile boolean in1 = false;
	//Есть ли у нас гарантии что:
	//1. Будет напечатана хотя бы одна единица
	//2. Никогда не будет 0 в окружении двух единиц
	//3. Возможна взаимная блокировка
	
	
	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true){
					in0=true;
					if(!in1){
						System.out.println(0);
						System.out.println(0);
					}
					in0=false;
				}
			}
		}).start();
		
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(true){
					in1=true;
					if(!in0){
						System.out.println(1);
						System.out.println(1);
					}
					in1=false;
				}
			}
		}).start();
	}
}
