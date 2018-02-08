package ru.unlimit.golovach.javacore.lab16.thread;

public class Coordinator implements Runnable{

	@Override
	public void run() {
		for(int k=0;k<10;k++){
			//A+B
			Runnable printerA = new PrintRunnable("A  .",100);
			Thread threadA = new Thread(printerA);
			threadA.start();
			
			Runnable printerB = new PrintRunnable(".  B",99);
			Thread threadB = new Thread(printerB);
			threadB.start();
			
			try {
				threadA.join();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			try {
				threadB.join();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			//C
			System.out.println("------");
			Runnable printerC = new PrintRunnable("  C",100);
			Thread threadC = new Thread(printerC);
			threadC.start();
			try {
				threadC.join();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("------");
		}
	}
}
