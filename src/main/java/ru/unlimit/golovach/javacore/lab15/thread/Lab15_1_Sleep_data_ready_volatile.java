package ru.unlimit.golovach.javacore.lab15.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Lab15_1_Sleep_data_ready_volatile {

	//Организация данных между потоками
	
	//Должно быть volatile, иначе ready залипает на кеше первого уровня
	//и или даже в регистре процессора и не передается вниз до RAM
	//Поэтому общие данные помечать как volatile
	//data в данной задаче не нужно делать volatile,
	//т.к. при чтении while(!ready),
	//все кеши на чтение подгружаются напрямую из RAM,
	//в том числе и другие поля
	//если data сделать тоже volatile, то кэши будут сбрасываться 2 раза в RAM
	// во время 1)ready=true и 2)data=1 
	volatile static boolean ready = false;//сделать volatile
	//static AtomicInteger ready = new AtomicInteger(0);
	static int data = 0;
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				sleep(1000);
				data=1;				
				ready=true;//ready.set(1);
				//поменять местами, поставить сюда data=1
				//data=1;//в этом случае data может остаться в кешах, так как было изменено после изменения volatile ready
			}

		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!ready){/*sleep(1);*/};//можно вместо volatile использовать sleep(1)
				//while(ready.intValue()==0){};
				System.out.println(data);
			}
		}).start();;

	}
	private static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			//обернули в try-catch, чтобы не оборачивать выше в Runnable,
			//так как там нельзя сделать throws из-за того,
			//что интерфейс Runnable.run без throws
			//это чтобы наверху код не загромождать лишним кодом
			throw new RuntimeException(e);
		}
		
	}

}
