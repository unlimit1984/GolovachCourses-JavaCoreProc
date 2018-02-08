package ru.unlimit.golovach.javacore.lab16.thread;

public class Lab16_DZ1_Play_Accordion {

	//Переделать лабу так, чтобы был отдельный класс Coordinator,
	//который будет стартовать потоки  A,B,C,
	//а main присоединяется к Координатору.
	//Потоки A,B запускаются одновременно, затем запускатеся C-поток
	//после чего Координатор присоединяется сначлаа к А и Б, а потом и к С
	
	public static void main(String[] args) throws InterruptedException {
		/*
		for(int k=0;k<10;k++){
			//A+B
			Runnable printerA = new PrintRunnable("A  .",100);
			Thread threadA = new Thread(printerA);
			threadA.start();
			
			Runnable printerB = new PrintRunnable(".  B",99);
			Thread threadB = new Thread(printerB);
			threadB.start();
			
			threadA.join();
			threadB.join();
			//C
			System.out.println("------");
			Runnable printerC = new PrintRunnable("  C",100);
			printerC.run();
			System.out.println("------");
		}
		*/

		//Решение
		Thread t=new Thread(new Coordinator());
		t.start();
		t.join();
	}

}
